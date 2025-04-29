package org.stablerpg.stablemobs.levelling.mobs;

import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.StableMobs;
import org.stablerpg.stablemobs.levelling.Hostility;
import org.stablerpg.stablemobs.levelling.modifier.LevelModifier;
import org.stablerpg.stablemobs.levelling.modifier.MobModifier;

import java.util.Arrays;

@Getter
public abstract class AbstractLevelledMob<T extends Mob> extends SimpleMobImpl<T> {

  private int level;
  private final LevelModifier[] levelModifiers;
  private final MobModifier[] mobModifiers;

  protected AbstractLevelledMob(@NotNull T mob) {
    super(mob);
    levelModifiers = Arrays.stream(LevelModifier.values()).filter(modifier -> modifier.test(this)).toArray(LevelModifier[]::new);
    mobModifiers = Arrays.stream(MobModifier.values()).filter(modifier -> modifier.test(this)).toArray(MobModifier[]::new);
    if (mob.getTicksLived() == 0) {
      mob.setCustomNameVisible(true);
      setPersistentData(StableMobs.getPluginKey("spawn-x"), PersistentDataType.INTEGER, mob.getChunk().getX());
      setPersistentData(StableMobs.getPluginKey("spawn-z"), PersistentDataType.INTEGER, mob.getChunk().getZ());
    }
  }

  public abstract @NotNull String getName();

  public @NotNull Component getDisplayName() {
    String levelColor = getLevelColor().toString();
    int level = this.level;
    String name = getName();
    int health = (int) getHealth();
    String rawName = String.format("<%s>%d</%s> <gray>%s</gray> <red>%d ❤</red>", levelColor, level, levelColor, name, health);
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  protected @NotNull NamedTextColor getLevelColor() {
    return getHostility().getColor();
  }

  public abstract int getBaseLevel();

  public abstract @NotNull Hostility getHostility();

  protected int applyLevelModifiers(int level) {
    for (LevelModifier modifier : levelModifiers)
      level = modifier.apply(level, this);
    return Math.max(1, level);
  }

  public void updateLevel() {
    if (isDead()) {
      StableMobs.logger().warning("Chat, why are we trying to update a dead mob?");
      return;
    }

    int level = getBaseLevel();
    level = applyLevelModifiers(level);
    this.level = level;

    updateMob();
  }

  private void updateMob() {
    customName(getDisplayName());

    getBaseAttributes().forEach(this::setAttributeBaseValue);
    for (MobModifier modifier : mobModifiers)
      modifier.accept(this);

    LootTable lootTable = getLootTable();
    if (lootTable != null)
      setLootTable(lootTable);
  }

  public void tick(int tick) {
    if (tick % 20 == 0)
      updateLevel();
  }

}
