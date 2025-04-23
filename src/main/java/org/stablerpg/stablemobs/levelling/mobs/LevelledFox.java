package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Fox;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledFox extends AbstractLevelledMob<@NotNull Fox> {

  public LevelledFox(@NotNull Fox mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Fox";
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 