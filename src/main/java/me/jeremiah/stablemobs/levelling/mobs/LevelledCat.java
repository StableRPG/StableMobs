package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Cat;
import org.jetbrains.annotations.NotNull;

public class LevelledCat extends BaseLevelledMob<@NotNull Cat> {

  public LevelledCat(@NotNull Cat mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Cat";
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