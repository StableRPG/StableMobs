package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Snowman;
import org.jetbrains.annotations.NotNull;

public class LevelledSnowGolem extends BaseLevelledMob<@NotNull Snowman> {

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