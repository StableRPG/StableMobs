package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Witch;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledWitch extends AbstractLevelledMob<@NotNull Witch> {

  public LevelledWitch(@NotNull Witch mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Witch";
  }

  @Override
  public int getBaseLevel() {
    return 14;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 