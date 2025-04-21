package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.IronGolem;
import org.jetbrains.annotations.NotNull;

public class LevelledIronGolem extends BaseLevelledMob<@NotNull IronGolem> {

  public LevelledIronGolem(@NotNull IronGolem mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Iron Golem";
  }

  @Override
  public int getBaseLevel() {
    return 25;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 