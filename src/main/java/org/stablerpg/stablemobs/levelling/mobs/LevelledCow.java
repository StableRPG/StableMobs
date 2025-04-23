package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Cow;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCow extends AbstractLevelledMob<@NotNull Cow> {

  public LevelledCow(@NotNull Cow mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cow";
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