package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Tadpole;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledTadpole extends AbstractLevelledMob<@NotNull Tadpole> {

  public LevelledTadpole(@NotNull Tadpole mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tadpole";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 