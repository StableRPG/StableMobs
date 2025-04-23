package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Zoglin;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledZoglin extends AbstractLevelledMob<@NotNull Zoglin> {

  public LevelledZoglin(@NotNull Zoglin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zoglin";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 