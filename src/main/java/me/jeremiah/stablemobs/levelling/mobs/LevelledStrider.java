package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Strider;
import org.jetbrains.annotations.NotNull;

public class LevelledStrider extends BaseLevelledMob<@NotNull Strider> {

  public LevelledStrider(@NotNull Strider mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Strider";
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 