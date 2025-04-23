package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Villager;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledVillager extends AbstractLevelledMob<@NotNull Villager> {

  public LevelledVillager(@NotNull Villager mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Villager";
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