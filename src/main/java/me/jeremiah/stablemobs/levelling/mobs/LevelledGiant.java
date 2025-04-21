package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Giant;
import org.jetbrains.annotations.NotNull;

public class LevelledGiant extends BaseLevelledMob<@NotNull Giant> {

  public LevelledGiant(@NotNull Giant mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Giant";
  }

  @Override
  public int getBaseLevel() {
    return 40;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.BOSS;
  }

} 