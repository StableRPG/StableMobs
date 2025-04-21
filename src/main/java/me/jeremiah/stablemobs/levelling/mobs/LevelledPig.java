package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Pig;
import org.jetbrains.annotations.NotNull;

public class LevelledPig extends BaseLevelledMob<@NotNull Pig> {

  public LevelledPig(@NotNull Pig mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Pig";
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
