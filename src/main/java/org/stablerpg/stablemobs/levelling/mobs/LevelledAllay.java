package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Allay;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledAllay extends AbstractLevelledMob<@NotNull Allay> {

  public LevelledAllay(@NotNull Allay mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Allay";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 