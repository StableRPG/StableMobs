package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Pillager;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPillager extends AbstractLevelledMob<@NotNull Pillager> {

  public LevelledPillager(@NotNull Pillager mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Pillager";
  }

  @Override
  public int getBaseLevel() {
    return 14;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 