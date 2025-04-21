package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Villager;
import org.jetbrains.annotations.NotNull;

public class LevelledVillager extends BaseLevelledMob<@NotNull Villager> {

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