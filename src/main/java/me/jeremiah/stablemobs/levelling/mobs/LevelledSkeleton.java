package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Skeleton;
import org.jetbrains.annotations.NotNull;

public class LevelledSkeleton extends BaseLevelledMob<@NotNull Skeleton> {

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
