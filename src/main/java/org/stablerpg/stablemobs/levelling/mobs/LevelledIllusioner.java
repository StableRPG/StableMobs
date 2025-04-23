package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Illusioner;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.Hostility;

public class LevelledIllusioner extends AbstractLevelledMob<@NotNull Illusioner> {

  public LevelledIllusioner(@NotNull Illusioner mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Illusioner";
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