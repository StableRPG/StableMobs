package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Donkey;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledDonkey extends AbstractLevelledMob<@NotNull Donkey> {

  public LevelledDonkey(@NotNull Donkey mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Donkey";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 