package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Salmon;
import org.jetbrains.annotations.NotNull;

public class LevelledSalmon extends BaseLevelledMob<@NotNull Salmon> {

  public LevelledSalmon(@NotNull Salmon mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Salmon";
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