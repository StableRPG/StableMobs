package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Wolf;
import org.jetbrains.annotations.NotNull;

public class LevelledWolf extends BaseLevelledMob<@NotNull Wolf> {

  public LevelledWolf(@NotNull Wolf mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wolf";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 