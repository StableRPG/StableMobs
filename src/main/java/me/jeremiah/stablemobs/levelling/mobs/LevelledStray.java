package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Stray;
import org.jetbrains.annotations.NotNull;

public class LevelledStray extends BaseLevelledMob<@NotNull Stray> {

  public LevelledStray(@NotNull Stray mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Stray";
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