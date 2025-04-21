package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Frog;
import org.jetbrains.annotations.NotNull;

public class LevelledFrog extends BaseLevelledMob<@NotNull Frog> {

  public LevelledFrog(@NotNull Frog mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Frog";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 