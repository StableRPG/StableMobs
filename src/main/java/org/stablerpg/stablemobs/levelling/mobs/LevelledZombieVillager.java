package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.ZombieVillager;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledZombieVillager extends AbstractLevelledMob<@NotNull ZombieVillager> {

  public LevelledZombieVillager(@NotNull ZombieVillager mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zombie Villager";
  }

  @Override
  public int getBaseLevel() {
    return 13;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 