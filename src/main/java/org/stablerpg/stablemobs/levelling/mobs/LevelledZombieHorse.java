package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.ZombieHorse;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledZombieHorse extends AbstractLevelledMob<@NotNull ZombieHorse> {

  public LevelledZombieHorse(@NotNull ZombieHorse mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zombie Horse";
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