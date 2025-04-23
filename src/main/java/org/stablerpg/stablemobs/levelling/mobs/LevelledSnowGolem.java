package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Snowman;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSnowGolem extends AbstractLevelledMob<@NotNull Snowman> {

  public LevelledSnowGolem(@NotNull Snowman mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Snow Golem";
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 