package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Spider;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSpider extends AbstractLevelledMob<@NotNull Spider> {

  public LevelledSpider(@NotNull Spider mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Spider";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

}
