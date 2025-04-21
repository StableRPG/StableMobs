package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Panda;
import org.jetbrains.annotations.NotNull;

public class LevelledPanda extends BaseLevelledMob<@NotNull Panda> {

  public LevelledPanda(@NotNull Panda mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Panda";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 