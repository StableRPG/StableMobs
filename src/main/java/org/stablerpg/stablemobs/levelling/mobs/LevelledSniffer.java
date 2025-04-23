package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Sniffer;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSniffer extends AbstractLevelledMob<@NotNull Sniffer> {

  public LevelledSniffer(@NotNull Sniffer mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Sniffer";
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