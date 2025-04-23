package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Creaking;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCreaking extends AbstractLevelledMob<@NotNull Creaking> {

  public LevelledCreaking(@NotNull Creaking mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Creaking";
  }

  @Override
  public int getBaseLevel() {
    return 17;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 