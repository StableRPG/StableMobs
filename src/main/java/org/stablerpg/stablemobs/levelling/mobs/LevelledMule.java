package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Mule;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledMule extends AbstractLevelledMob<@NotNull Mule> {

  public LevelledMule(@NotNull Mule mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Mule";
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