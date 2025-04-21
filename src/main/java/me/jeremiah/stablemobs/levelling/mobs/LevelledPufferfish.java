package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.PufferFish;
import org.jetbrains.annotations.NotNull;

public class LevelledPufferfish extends BaseLevelledMob<@NotNull PufferFish> {

  public LevelledPufferfish(@NotNull PufferFish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Pufferfish";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 