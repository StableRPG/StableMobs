package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Bee;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledBee extends AbstractLevelledMob<@NotNull Bee> {

  public LevelledBee(@NotNull Bee mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bee";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 