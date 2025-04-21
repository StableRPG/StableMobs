package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Cod;
import org.jetbrains.annotations.NotNull;

public class LevelledCod extends BaseLevelledMob<@NotNull Cod> {

  public LevelledCod(@NotNull Cod mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cod";
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