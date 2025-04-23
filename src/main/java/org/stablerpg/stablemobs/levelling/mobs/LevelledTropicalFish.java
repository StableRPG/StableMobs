package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.TropicalFish;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledTropicalFish extends AbstractLevelledMob<@NotNull TropicalFish> {

  public LevelledTropicalFish(@NotNull TropicalFish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tropical Fish";
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 