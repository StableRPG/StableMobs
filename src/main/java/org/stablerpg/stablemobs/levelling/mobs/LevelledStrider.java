package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Strider;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledStrider extends AbstractLevelledMob<@NotNull Strider> {

  public LevelledStrider(@NotNull Strider mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Strider";
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