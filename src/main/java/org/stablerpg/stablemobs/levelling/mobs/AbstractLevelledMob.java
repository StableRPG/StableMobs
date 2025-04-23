package org.stablerpg.stablemobs.levelling.mobs;

import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.stablerpg.stablemobs.StableMobs;
import org.stablerpg.stablemobs.levelling.Hostility;
import org.stablerpg.stablemobs.levelling.MobType;
import org.stablerpg.stablemobs.levelling.modifier.LevelModifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Getter
public abstract class AbstractLevelledMob<T extends Mob> implements MobDataHolder<T> {

  private final @NotNull T mob;
  private final @NotNull MobType type;

  private int level;
  private final LevelModifier[] modifiers;

  protected AbstractLevelledMob(@NotNull T mob) {
    this.mob = mob;
    type = MobType.getMobType(mob);
    modifiers = Arrays.stream(LevelModifier.values()).filter(modifier -> modifier.test(this)).toArray(LevelModifier[]::new);
    if (mob.getTicksLived() == 0) {
      mob.setCustomNameVisible(true);
      PersistentDataContainer container = mob.getPersistentDataContainer();
      container.set(StableMobs.getPluginKey("spawn-x"), PersistentDataType.INTEGER, mob.getChunk().getX());
      container.set(StableMobs.getPluginKey("spawn-z"), PersistentDataType.INTEGER, mob.getChunk().getZ());
    }
  }

  public abstract @NotNull String getName();

  public @NotNull Component getDisplayName() {
    String levelColor = getLevelColor().toString();
    int level = this.level;
    String name = getName();
    int health = (int) mob.getHealth();
    String rawName = String.format("<%s>%d<%s> <gray>%s</gray> <red>%d ❤</red>", levelColor, level, levelColor, name, health);
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @SuppressWarnings("DataFlowIssue")
  protected @NotNull NamedTextColor getLevelColor() {
    return getHostility().getColor();
  }

  public abstract int getBaseLevel();

  public abstract @NotNull Hostility getHostility();

  protected int applyLevelModifiers(int level) {
    for (LevelModifier modifier : modifiers)
      level = modifier.apply(level, this);
    return Math.max(1, level);
  }

  public @NotNull Map<Attribute, Double> getAttributes() {
    return Collections.emptyMap();
  }

  public @Nullable LootTable getLootTable() {
    return null;
  }

  public void updateLevel() {
    Mob mob = this.mob;
    if (mob.isDead()) {
      StableMobs.logger().warning("Chat, why are we trying to update a dead mob?");
      return;
    }

    int level = getBaseLevel();

    level = applyLevelModifiers(level);
    this.level = level;

    updateMob();
  }

  private void updateMob() {
    mob.customName(getDisplayName());

    for (Map.Entry<Attribute, Double> entry : getAttributes().entrySet()) {
      AttributeInstance attribute = mob.getAttribute(entry.getKey());
      if (attribute == null) {
        String attributeName = entry.getKey().getKey().asMinimalString();
        String type = this.type.name();
        StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      } else
        attribute.setBaseValue(entry.getValue());
    }

    LootTable lootTable = getLootTable();
    if (lootTable != null)
      mob.setLootTable(lootTable);
  }

  public void tick(int tick) {
    if (tick % 20 == 0)
      updateLevel();
  }

}
