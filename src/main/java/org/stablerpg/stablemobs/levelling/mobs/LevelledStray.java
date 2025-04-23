package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Stray;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledStray extends AbstractLevelledMob<@NotNull Stray> {

  public LevelledStray(@NotNull Stray mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Stray";
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