package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Zombie;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledZombie extends AbstractLevelledMob<@NotNull Zombie> {

  public LevelledZombie(@NotNull Zombie mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zombie";
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
