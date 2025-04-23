package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.GlowSquid;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledGlowSquid extends AbstractLevelledMob<@NotNull GlowSquid> {

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