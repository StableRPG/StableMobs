package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Turtle;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledTurtle extends AbstractLevelledMob<@NotNull Turtle> {

  public LevelledTurtle(@NotNull Turtle mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Turtle";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 