package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Cat;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCat extends AbstractLevelledMob<@NotNull Cat> {

  public LevelledCat(@NotNull Cat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cat";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 