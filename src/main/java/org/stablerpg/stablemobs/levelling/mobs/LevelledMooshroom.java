package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.MushroomCow;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledMooshroom extends AbstractLevelledMob<@NotNull MushroomCow> {

  public LevelledMooshroom(@NotNull MushroomCow mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Mooshroom";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 