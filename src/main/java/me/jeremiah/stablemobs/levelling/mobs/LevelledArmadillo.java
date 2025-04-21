package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Armadillo;
import org.jetbrains.annotations.NotNull;

public class LevelledArmadillo extends BaseLevelledMob<@NotNull Armadillo> {

  public LevelledArmadillo(@NotNull Armadillo mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Armadillo";
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