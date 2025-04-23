package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Drowned;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledDrowned extends AbstractLevelledMob<@NotNull Drowned> {

  public LevelledDrowned(@NotNull Drowned mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Drowned";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 