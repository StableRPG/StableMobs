package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Sheep;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSheep extends AbstractLevelledMob<@NotNull Sheep> {

  public LevelledSheep(@NotNull Sheep mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Sheep";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 