package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Zombie;
import org.jetbrains.annotations.NotNull;

public class LevelledZombie extends BaseLevelledMob<@NotNull Zombie> {

  public LevelledZombie(@NotNull Zombie mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zombie";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

}
