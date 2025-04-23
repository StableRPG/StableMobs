package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Breeze;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledBreeze extends AbstractLevelledMob<@NotNull Breeze> {

  public LevelledBreeze(@NotNull Breeze mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Breeze";
  }

  @Override
  public int getBaseLevel() {
    return 18;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 