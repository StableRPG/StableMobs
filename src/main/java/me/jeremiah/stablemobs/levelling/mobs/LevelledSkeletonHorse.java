package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.SkeletonHorse;
import org.jetbrains.annotations.NotNull;

public class LevelledSkeletonHorse extends BaseLevelledMob<@NotNull SkeletonHorse> {

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