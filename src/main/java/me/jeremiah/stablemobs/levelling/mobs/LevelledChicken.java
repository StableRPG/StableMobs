package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Chicken;
import org.jetbrains.annotations.NotNull;

public class LevelledChicken extends BaseLevelledMob<@NotNull Chicken> {

  public LevelledChicken(@NotNull Chicken mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Chicken";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 