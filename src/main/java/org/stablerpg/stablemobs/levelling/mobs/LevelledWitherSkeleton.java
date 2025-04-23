package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.WitherSkeleton;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledWitherSkeleton extends AbstractLevelledMob<@NotNull WitherSkeleton> {

  public LevelledWitherSkeleton(@NotNull WitherSkeleton mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wither Skeleton";
  }

  @Override
  public int getBaseLevel() {
    return 16;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 