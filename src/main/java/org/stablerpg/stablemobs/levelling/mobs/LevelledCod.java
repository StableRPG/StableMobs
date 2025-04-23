package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Cod;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCod extends AbstractLevelledMob<@NotNull Cod> {

  public LevelledCod(@NotNull Cod mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cod";
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