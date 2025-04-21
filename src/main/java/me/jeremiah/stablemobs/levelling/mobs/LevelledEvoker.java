package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Evoker;
import org.jetbrains.annotations.NotNull;

public class LevelledEvoker extends BaseLevelledMob<@NotNull Evoker> {

  public LevelledEvoker(@NotNull Evoker mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Evoker";
  }

  @Override
  public int getBaseLevel() {
    return 18;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 