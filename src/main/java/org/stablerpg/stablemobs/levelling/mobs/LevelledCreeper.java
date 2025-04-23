package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Creeper;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCreeper extends AbstractLevelledMob<@NotNull Creeper> {

  public LevelledCreeper(@NotNull Creeper mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Creeper";
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
