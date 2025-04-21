package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Turtle;
import org.jetbrains.annotations.NotNull;

public class LevelledTurtle extends BaseLevelledMob<@NotNull Turtle> {

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