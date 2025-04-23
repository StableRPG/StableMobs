package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.TraderLlama;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledTraderLlama extends AbstractLevelledMob<@NotNull TraderLlama> {

  public LevelledTraderLlama(@NotNull TraderLlama mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Trader Llama";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 