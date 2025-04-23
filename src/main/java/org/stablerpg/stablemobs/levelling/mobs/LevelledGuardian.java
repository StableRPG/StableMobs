package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Guardian;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledGuardian extends AbstractLevelledMob<@NotNull Guardian> {

  public LevelledGuardian(@NotNull Guardian mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Guardian";
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 