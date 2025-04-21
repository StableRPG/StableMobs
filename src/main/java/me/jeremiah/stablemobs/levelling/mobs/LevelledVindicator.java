package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Vindicator;
import org.jetbrains.annotations.NotNull;

public class LevelledVindicator extends BaseLevelledMob<@NotNull Vindicator> {

  public LevelledVindicator(@NotNull Vindicator mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Vindicator";
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