package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Husk;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledHusk extends AbstractLevelledMob<@NotNull Husk> {

  public LevelledHusk(@NotNull Husk mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Husk";
  }

  @Override
  public int getBaseLevel() {
    return 11;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 