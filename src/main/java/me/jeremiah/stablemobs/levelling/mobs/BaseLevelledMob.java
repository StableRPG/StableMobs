package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.modifier.LevelModifier;
import me.jeremiah.stablemobs.levelling.modifier.ModifierContext;
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
  protected int applyLevelModifiers(int level, ModifierContext context) {
    level = LevelModifier.SPAWN_DISTANCE_MODIFIER.apply(level, context);
    level = LevelModifier.DIFFICULTY_MODIFIER.apply(level, context);
    return Math.max(1, level);
  }

  @Override
  public @NotNull String getName() {
    return getMob().getType().name();
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<aqua>%d</aqua> <gray>%s</gray>", getLevel(), getName());
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
