package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.ZombieHorse;
import org.jetbrains.annotations.NotNull;

public class LevelledZombieHorse extends BaseLevelledMob<@NotNull ZombieHorse> {

  public LevelledZombieHorse(@NotNull ZombieHorse mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Zombie Horse";
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 