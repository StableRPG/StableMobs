package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Enderman;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledEnderman extends AbstractLevelledMob<@NotNull Enderman> {

  public LevelledEnderman(@NotNull Enderman mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Enderman";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 