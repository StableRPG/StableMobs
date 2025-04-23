package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Salmon;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSalmon extends AbstractLevelledMob<@NotNull Salmon> {

  public LevelledSalmon(@NotNull Salmon mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Salmon";
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