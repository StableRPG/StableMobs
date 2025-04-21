package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Horse;
import org.jetbrains.annotations.NotNull;

public class LevelledHorse extends BaseLevelledMob<@NotNull Horse> {

  public LevelledHorse(@NotNull Horse mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Horse";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 