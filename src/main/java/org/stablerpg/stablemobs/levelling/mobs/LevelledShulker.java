package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Shulker;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledShulker extends AbstractLevelledMob<@NotNull Shulker> {

  public LevelledShulker(@NotNull Shulker mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Shulker";
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 