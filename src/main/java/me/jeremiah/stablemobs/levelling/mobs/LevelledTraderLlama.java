package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.TraderLlama;
import org.jetbrains.annotations.NotNull;

public class LevelledTraderLlama extends BaseLevelledMob<@NotNull TraderLlama> {

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