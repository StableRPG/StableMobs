package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Horse;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledHorse extends AbstractLevelledMob<@NotNull Horse> {

  public LevelledHorse(@NotNull Horse mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Horse";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 