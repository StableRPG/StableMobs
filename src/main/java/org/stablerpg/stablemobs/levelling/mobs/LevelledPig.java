package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Pig;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledPig extends AbstractLevelledMob<@NotNull Pig> {

  public LevelledPig(@NotNull Pig mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Pig";
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
