package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Cow;
import org.jetbrains.annotations.NotNull;

public class LevelledCow extends BaseLevelledMob<@NotNull Cow> {

  public LevelledCow(@NotNull Cow mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cow";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 