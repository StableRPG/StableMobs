package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Dolphin;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledDolphin extends AbstractLevelledMob<@NotNull Dolphin> {

  public LevelledDolphin(@NotNull Dolphin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Dolphin";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 