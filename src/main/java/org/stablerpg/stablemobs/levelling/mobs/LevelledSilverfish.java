package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Silverfish;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSilverfish extends AbstractLevelledMob<@NotNull Silverfish> {

  public LevelledSilverfish(@NotNull Silverfish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Silverfish";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 