package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Mule;
import org.jetbrains.annotations.NotNull;

public class LevelledMule extends BaseLevelledMob<@NotNull Mule> {

  public LevelledMule(@NotNull Mule mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Mule";
  }

  @Override
  public int getBaseLevel() {
    return 7;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 