package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Ghast;
import org.jetbrains.annotations.NotNull;

public class LevelledGhast extends BaseLevelledMob<@NotNull Ghast> {

  public LevelledGhast(@NotNull Ghast mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ghast";
  }

  @Override
  public int getBaseLevel() {
    return 16;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 