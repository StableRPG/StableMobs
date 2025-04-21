package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Llama;
import org.jetbrains.annotations.NotNull;

public class LevelledLlama extends BaseLevelledMob<@NotNull Llama> {

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