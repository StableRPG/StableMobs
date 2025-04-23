package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Armadillo;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledArmadillo extends AbstractLevelledMob<@NotNull Armadillo> {

  public LevelledArmadillo(@NotNull Armadillo mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Armadillo";
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 