package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.MagmaCube;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledMagmaCube extends AbstractLevelledMob<@NotNull MagmaCube> {

  public LevelledMagmaCube(@NotNull MagmaCube mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Magma Cube";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 