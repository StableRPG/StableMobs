package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Skeleton;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSkeleton extends AbstractLevelledMob<@NotNull Skeleton> {

  public LevelledSkeleton(@NotNull Skeleton mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Skeleton";
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
