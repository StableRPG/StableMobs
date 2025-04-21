package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.ZombieVillager;
import org.jetbrains.annotations.NotNull;

public class LevelledZombieVillager extends BaseLevelledMob<@NotNull ZombieVillager> {

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