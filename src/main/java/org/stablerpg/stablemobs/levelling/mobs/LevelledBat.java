package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Bat;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledBat extends AbstractLevelledMob<@NotNull Bat> {

  public LevelledBat(@NotNull Bat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bat";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 