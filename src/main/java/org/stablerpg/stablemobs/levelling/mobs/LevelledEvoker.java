package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Evoker;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledEvoker extends AbstractLevelledMob<@NotNull Evoker> {

  public LevelledEvoker(@NotNull Evoker mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Evoker";
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