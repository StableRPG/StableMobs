package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Slime;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledSlime extends AbstractLevelledMob<@NotNull Slime> {

  public LevelledSlime(@NotNull Slime mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Slime";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 