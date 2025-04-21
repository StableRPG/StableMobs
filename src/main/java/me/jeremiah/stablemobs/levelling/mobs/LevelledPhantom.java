package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Phantom;
import org.jetbrains.annotations.NotNull;

public class LevelledPhantom extends BaseLevelledMob<@NotNull Phantom> {

  public LevelledPhantom(@NotNull Phantom mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Phantom";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 