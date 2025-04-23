package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Camel;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledCamel extends AbstractLevelledMob<@NotNull Camel> {

  public LevelledCamel(@NotNull Camel mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Camel";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 