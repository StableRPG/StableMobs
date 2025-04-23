package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Hoglin;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledHoglin extends AbstractLevelledMob<@NotNull Hoglin> {

  public LevelledHoglin(@NotNull Hoglin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Hoglin";
  }

  @Override
  public int getBaseLevel() {
    return 18;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 