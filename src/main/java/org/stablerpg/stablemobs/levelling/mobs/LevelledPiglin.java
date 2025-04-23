package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Piglin;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPiglin extends AbstractLevelledMob<@NotNull Piglin> {

  public LevelledPiglin(@NotNull Piglin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Piglin";
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 