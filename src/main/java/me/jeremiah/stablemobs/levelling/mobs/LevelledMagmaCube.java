package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.MagmaCube;
import org.jetbrains.annotations.NotNull;

public class LevelledMagmaCube extends BaseLevelledMob<@NotNull MagmaCube> {

  public LevelledMagmaCube(@NotNull MagmaCube mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Magma Cube";
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