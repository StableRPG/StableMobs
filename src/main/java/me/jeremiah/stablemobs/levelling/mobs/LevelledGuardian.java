package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Guardian;
import org.jetbrains.annotations.NotNull;

public class LevelledGuardian extends BaseLevelledMob<@NotNull Guardian> {

  public LevelledGuardian(@NotNull Guardian mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Guardian";
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 