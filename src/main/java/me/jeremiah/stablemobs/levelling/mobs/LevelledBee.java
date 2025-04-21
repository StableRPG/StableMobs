package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Bee;
import org.jetbrains.annotations.NotNull;

public class LevelledBee extends BaseLevelledMob<@NotNull Bee> {

  public LevelledBee(@NotNull Bee mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bee";
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