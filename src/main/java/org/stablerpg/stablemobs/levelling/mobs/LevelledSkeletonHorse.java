package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.SkeletonHorse;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSkeletonHorse extends AbstractLevelledMob<@NotNull SkeletonHorse> {

  public LevelledSkeletonHorse(@NotNull SkeletonHorse mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Skeleton Horse";
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