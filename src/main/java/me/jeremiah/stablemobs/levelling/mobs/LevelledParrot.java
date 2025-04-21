package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Parrot;
import org.jetbrains.annotations.NotNull;

public class LevelledParrot extends BaseLevelledMob<@NotNull Parrot> {

  public LevelledParrot(@NotNull Parrot mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Parrot";
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 