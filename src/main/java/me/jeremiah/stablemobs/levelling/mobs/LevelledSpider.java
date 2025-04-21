package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Spider;
import org.jetbrains.annotations.NotNull;

public class LevelledSpider extends BaseLevelledMob<@NotNull Spider> {

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
