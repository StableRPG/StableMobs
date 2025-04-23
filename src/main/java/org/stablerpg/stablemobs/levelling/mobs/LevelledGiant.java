package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Giant;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledGiant extends AbstractLevelledMob<@NotNull Giant> {

  public LevelledGiant(@NotNull Giant mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Giant";
  }

  @Override
  public int getBaseLevel() {
    return 40;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.BOSS;
  }

} 