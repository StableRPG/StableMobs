package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Ravager;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledRavager extends AbstractLevelledMob<@NotNull Ravager> {

  public LevelledRavager(@NotNull Ravager mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ravager";
  }

  @Override
  public int getBaseLevel() {
    return 22;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 