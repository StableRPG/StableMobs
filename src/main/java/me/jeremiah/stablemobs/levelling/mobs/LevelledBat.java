package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Bat;
import org.jetbrains.annotations.NotNull;

public class LevelledBat extends BaseLevelledMob<@NotNull Bat> {

  public LevelledBat(@NotNull Bat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bat";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 