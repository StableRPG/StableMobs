package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.IronGolem;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledIronGolem extends AbstractLevelledMob<@NotNull IronGolem> {

  public LevelledIronGolem(@NotNull IronGolem mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Iron Golem";
  }

  @Override
  public int getBaseLevel() {
    return 25;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 