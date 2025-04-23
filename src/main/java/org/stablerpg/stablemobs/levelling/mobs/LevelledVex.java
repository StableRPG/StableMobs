package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Vex;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledVex extends AbstractLevelledMob<@NotNull Vex> {

  public LevelledVex(@NotNull Vex mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Vex";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 