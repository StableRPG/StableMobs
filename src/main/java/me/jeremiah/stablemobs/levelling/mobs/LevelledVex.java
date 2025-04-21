package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Vex;
import org.jetbrains.annotations.NotNull;

public class LevelledVex extends BaseLevelledMob<@NotNull Vex> {

  public LevelledVex(@NotNull Vex mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Vex";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 