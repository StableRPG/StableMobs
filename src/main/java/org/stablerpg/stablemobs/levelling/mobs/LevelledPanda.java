package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Panda;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPanda extends AbstractLevelledMob<@NotNull Panda> {

  public LevelledPanda(@NotNull Panda mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Panda";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 