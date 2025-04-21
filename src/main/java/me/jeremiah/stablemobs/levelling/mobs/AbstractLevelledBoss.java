package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Mob;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractLevelledBoss<T extends Mob> extends BaseLevelledMob<T> {

  protected AbstractLevelledBoss(@NotNull T mob) {
    super(mob);
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
