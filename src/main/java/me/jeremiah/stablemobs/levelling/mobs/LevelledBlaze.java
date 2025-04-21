package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Blaze;
import org.jetbrains.annotations.NotNull;

public class LevelledBlaze extends BaseLevelledMob<@NotNull Blaze> {

  public LevelledBlaze(@NotNull Blaze mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Blaze";
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