package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Chicken;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledChicken extends AbstractLevelledMob<@NotNull Chicken> {

  public LevelledChicken(@NotNull Chicken mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Chicken";
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