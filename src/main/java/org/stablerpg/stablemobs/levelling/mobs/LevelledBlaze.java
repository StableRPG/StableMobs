package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Blaze;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledBlaze extends AbstractLevelledMob<@NotNull Blaze> {

  public LevelledBlaze(@NotNull Blaze mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Blaze";
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 