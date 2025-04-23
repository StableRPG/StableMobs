package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Goat;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledGoat extends AbstractLevelledMob<@NotNull Goat> {

  public LevelledGoat(@NotNull Goat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Goat";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 