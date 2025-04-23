package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Bogged;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledBogged extends AbstractLevelledMob<@NotNull Bogged> {

  public LevelledBogged(@NotNull Bogged mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bogged";
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