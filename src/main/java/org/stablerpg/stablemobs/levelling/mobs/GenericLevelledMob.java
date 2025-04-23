package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Mob;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class GenericLevelledMob extends AbstractLevelledMob<@NotNull Mob> {

  public GenericLevelledMob(@NotNull Mob mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Generic Mob";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }
}
