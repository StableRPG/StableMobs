package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Axolotl;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledAxolotl extends AbstractLevelledMob<@NotNull Axolotl> {

  public LevelledAxolotl(@NotNull Axolotl mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Axolotl";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 