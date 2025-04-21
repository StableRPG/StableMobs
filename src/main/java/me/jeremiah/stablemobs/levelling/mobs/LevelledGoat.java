package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Goat;
import org.jetbrains.annotations.NotNull;

public class LevelledGoat extends BaseLevelledMob<@NotNull Goat> {

  public LevelledGoat(@NotNull Goat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Goat";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 