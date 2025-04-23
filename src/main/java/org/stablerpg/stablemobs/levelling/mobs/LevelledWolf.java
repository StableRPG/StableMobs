package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Wolf;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledWolf extends AbstractLevelledMob<@NotNull Wolf> {

  public LevelledWolf(@NotNull Wolf mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wolf";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 