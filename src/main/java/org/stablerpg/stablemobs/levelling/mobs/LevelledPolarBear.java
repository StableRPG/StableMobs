package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.PolarBear;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPolarBear extends AbstractLevelledMob<@NotNull PolarBear> {

  public LevelledPolarBear(@NotNull PolarBear mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Polar Bear";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 