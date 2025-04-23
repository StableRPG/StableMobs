package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Endermite;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledEndermite extends AbstractLevelledMob<@NotNull Endermite> {

  public LevelledEndermite(@NotNull Endermite mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Endermite";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 