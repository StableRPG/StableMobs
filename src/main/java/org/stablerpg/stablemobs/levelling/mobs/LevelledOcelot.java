package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Ocelot;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledOcelot extends AbstractLevelledMob<@NotNull Ocelot> {

  public LevelledOcelot(@NotNull Ocelot mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ocelot";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 