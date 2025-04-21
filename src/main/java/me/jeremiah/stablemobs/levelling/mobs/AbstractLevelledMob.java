package me.jeremiah.stablemobs.levelling.mobs;

import lombok.Getter;
import me.jeremiah.stablemobs.StableMobs;
import me.jeremiah.stablemobs.levelling.Hostility;
import me.jeremiah.stablemobs.levelling.MobType;
import me.jeremiah.stablemobs.levelling.modifier.ModifierContext;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

@Getter
public abstract class AbstractLevelledMob<T extends Mob> implements MobDataHolder<T> {

  private final @NotNull T mob;
  private final @NotNull MobType type;

  private int level;

  protected AbstractLevelledMob(@NotNull T mob) {
    this.mob = mob;
    type = MobType.getMobType(mob);
    if (mob.getTicksLived() == 0) {
      mob.setCustomNameVisible(true);
      PersistentDataContainer container = mob.getPersistentDataContainer();
      container.set(StableMobs.getPluginKey("spawn-x"), PersistentDataType.INTEGER, mob.getChunk().getX());
      container.set(StableMobs.getPluginKey("spawn-z"), PersistentDataType.INTEGER, mob.getChunk().getZ());
    }
  }

  public abstract @NotNull String getName();

  public abstract @NotNull Component getDisplayName();

  public abstract int getBaseLevel();

  public abstract @NotNull Hostility getHostility();

  protected abstract int applyLevelModifiers(int level, ModifierContext context);

  public abstract @NotNull Map<Attribute, Double> getAttributes();

  public abstract @Nullable LootTable getLootTable();

  public void updateLevel() {
    Mob mob = this.mob;
    if (mob.isDead()) {
      StableMobs.logger().warning("Chat, why are we trying to update a dead mob?");
      return;
    }

    int level = getBaseLevel();
    ModifierContext context = new ModifierContext.Builder(this).build();

    level = applyLevelModifiers(level, context);
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

  public abstract void tick(int tick);

}
