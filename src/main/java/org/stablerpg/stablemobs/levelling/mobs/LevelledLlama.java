package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Llama;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledLlama extends AbstractLevelledMob<@NotNull Llama> {

  public LevelledLlama(@NotNull Llama mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Llama";
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