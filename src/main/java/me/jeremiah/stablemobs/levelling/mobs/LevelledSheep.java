package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Sheep;
import org.jetbrains.annotations.NotNull;

public class LevelledSheep extends BaseLevelledMob<@NotNull Sheep> {

  public LevelledSheep(@NotNull Sheep mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Sheep";
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