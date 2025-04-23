package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Vindicator;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledVindicator extends AbstractLevelledMob<@NotNull Vindicator> {

  public LevelledVindicator(@NotNull Vindicator mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Vindicator";
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