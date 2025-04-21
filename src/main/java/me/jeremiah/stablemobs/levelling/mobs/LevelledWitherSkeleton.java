package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.WitherSkeleton;
import org.jetbrains.annotations.NotNull;

public class LevelledWitherSkeleton extends BaseLevelledMob<@NotNull WitherSkeleton> {

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