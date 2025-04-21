package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Fox;
import org.jetbrains.annotations.NotNull;

public class LevelledFox extends BaseLevelledMob<@NotNull Fox> {

  public LevelledFox(@NotNull Fox mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Fox";
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 