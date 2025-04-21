package me.jeremiah.stablemobs.levelling.mobs;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;

public abstract class BaseLevelledMob<T extends Mob> extends AbstractLevelledMob<T> {

  protected BaseLevelledMob(@NotNull T mob) {
    super(mob);
  }

  @Override
  public @NotNull Component getDisplayName() {
    String levelColor = getLevelColor().toString();
    int level = getLevel();
    String name = getName();
    int health = (int) getMob().getHealth();
    String rawName = String.format("<%s>%d<%s> <gray>%s</gray> <red>%d ❤</red>", levelColor, level, levelColor, name, health);
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public @NotNull Map<Attribute, Double> getAttributes() {
    return Collections.emptyMap();
  }

  @Override
  public LootTable getLootTable() {
    return getMob().getLootTable();
  }

  @Override
  public void tick(int tick) {
    if (tick % 20 == 0)
      updateLevel();
  }

}
