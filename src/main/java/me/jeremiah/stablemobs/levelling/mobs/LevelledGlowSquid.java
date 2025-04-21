package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.GlowSquid;
import org.jetbrains.annotations.NotNull;

public class LevelledGlowSquid extends BaseLevelledMob<@NotNull GlowSquid> {

  public LevelledGlowSquid(@NotNull GlowSquid mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Glow Squid";
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