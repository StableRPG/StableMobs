package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.CaveSpider;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCaveSpider extends AbstractLevelledMob<@NotNull CaveSpider> {

  public LevelledCaveSpider(@NotNull CaveSpider mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cave Spider";
  }

  @Override
  public int getBaseLevel() {
    return 13;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 