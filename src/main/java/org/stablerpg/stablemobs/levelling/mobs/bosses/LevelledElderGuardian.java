package org.stablerpg.stablemobs.levelling.mobs.bosses;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.ElderGuardian;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledBoss;

public class LevelledElderGuardian extends AbstractLevelledBoss<@NotNull ElderGuardian> {

  public LevelledElderGuardian(@NotNull ElderGuardian mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Elder Guardian";
  }

  @Override
  protected @NotNull NamedTextColor getLevelColor() {
    return NamedTextColor.AQUA;
  }

  @Override
  public int getBaseLevel() {
    return 100;
  }

} 