package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Parrot;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledParrot extends AbstractLevelledMob<@NotNull Parrot> {

  public LevelledParrot(@NotNull Parrot mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Parrot";
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 