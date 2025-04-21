package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.MushroomCow;
import org.jetbrains.annotations.NotNull;

public class LevelledMooshroom extends BaseLevelledMob<@NotNull MushroomCow> {

  public LevelledMooshroom(@NotNull MushroomCow mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Mooshroom";
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