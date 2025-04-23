package org.stablerpg.stablemobs.levelling.mobs;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Mob;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public abstract class AbstractLevelledBoss<T extends Mob> extends AbstractLevelledMob<T> {

  protected AbstractLevelledBoss(@NotNull T mob) {
    super(mob);
  }

  @Override
  public @NotNull Component getDisplayName() {
    String levelColor = getLevelColor().toString();
    int level = getLevel();
    String name = getName();
    int health = (int) getHealth();
    String rawName = String.format("<%s><bold>%d</bold></%s> <gray>%s</gray> <red>%d ❤</red>", levelColor, level, levelColor, name, health);
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.BOSS;
  }

  @Override
  protected int applyLevelModifiers(int level) {
    return Math.max(1, level);
  }

  @Override
  protected abstract @NotNull NamedTextColor getLevelColor();

}
