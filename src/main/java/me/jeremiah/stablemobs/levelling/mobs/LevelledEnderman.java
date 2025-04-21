package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Enderman;
import org.jetbrains.annotations.NotNull;

public class LevelledEnderman extends BaseLevelledMob<@NotNull Enderman> {

  public LevelledEnderman(@NotNull Enderman mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Enderman";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 