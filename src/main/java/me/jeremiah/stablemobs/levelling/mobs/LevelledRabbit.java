package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Rabbit;
import org.jetbrains.annotations.NotNull;

public class LevelledRabbit extends BaseLevelledMob<@NotNull Rabbit> {

  public LevelledRabbit(@NotNull Rabbit mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Rabbit";
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