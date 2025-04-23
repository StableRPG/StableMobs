package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Rabbit;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledRabbit extends AbstractLevelledMob<@NotNull Rabbit> {

  public LevelledRabbit(@NotNull Rabbit mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Rabbit";
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 