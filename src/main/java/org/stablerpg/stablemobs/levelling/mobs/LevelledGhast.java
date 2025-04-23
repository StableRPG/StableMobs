package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Ghast;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledGhast extends AbstractLevelledMob<@NotNull Ghast> {

  public LevelledGhast(@NotNull Ghast mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ghast";
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