package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Pillager;
import org.jetbrains.annotations.NotNull;

public class LevelledPillager extends BaseLevelledMob<@NotNull Pillager> {

  public LevelledPillager(@NotNull Pillager mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Pillager";
  }

  @Override
  public int getBaseLevel() {
    return 14;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 