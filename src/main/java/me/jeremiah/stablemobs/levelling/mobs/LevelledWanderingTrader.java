package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.WanderingTrader;
import org.jetbrains.annotations.NotNull;

public class LevelledWanderingTrader extends BaseLevelledMob<@NotNull WanderingTrader> {

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