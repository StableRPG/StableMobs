package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Frog;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledFrog extends AbstractLevelledMob<@NotNull Frog> {

  public LevelledFrog(@NotNull Frog mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Frog";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 