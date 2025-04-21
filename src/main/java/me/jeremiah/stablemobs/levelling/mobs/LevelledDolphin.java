package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Dolphin;
import org.jetbrains.annotations.NotNull;

public class LevelledDolphin extends BaseLevelledMob<@NotNull Dolphin> {

  public LevelledDolphin(@NotNull Dolphin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Dolphin";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 