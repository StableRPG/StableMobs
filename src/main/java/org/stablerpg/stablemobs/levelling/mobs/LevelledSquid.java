package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Squid;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSquid extends AbstractLevelledMob<@NotNull Squid> {

  public LevelledSquid(@NotNull Squid mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Squid";
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