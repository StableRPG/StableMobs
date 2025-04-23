package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.WanderingTrader;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledWanderingTrader extends AbstractLevelledMob<@NotNull WanderingTrader> {

  public LevelledWanderingTrader(@NotNull WanderingTrader mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wandering Trader";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 