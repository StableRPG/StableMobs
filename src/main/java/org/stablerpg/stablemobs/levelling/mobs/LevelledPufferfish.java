package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.PufferFish;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPufferfish extends AbstractLevelledMob<@NotNull PufferFish> {

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