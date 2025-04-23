package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.PiglinBrute;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPiglinBrute extends AbstractLevelledMob<@NotNull PiglinBrute> {

  public LevelledPiglinBrute(@NotNull PiglinBrute mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Piglin Brute";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 