package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.PiglinBrute;
import org.jetbrains.annotations.NotNull;

public class LevelledPiglinBrute extends BaseLevelledMob<@NotNull PiglinBrute> {

  public LevelledPiglinBrute(@NotNull PiglinBrute mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Piglin Brute";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 