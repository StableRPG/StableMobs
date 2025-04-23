package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Phantom;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPhantom extends AbstractLevelledMob<@NotNull Phantom> {

  public LevelledPhantom(@NotNull Phantom mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Phantom";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 