package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.TropicalFish;
import org.jetbrains.annotations.NotNull;

public class LevelledTropicalFish extends BaseLevelledMob<@NotNull TropicalFish> {

  public LevelledTropicalFish(@NotNull TropicalFish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tropical Fish";
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 