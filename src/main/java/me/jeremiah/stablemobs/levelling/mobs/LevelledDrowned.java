package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Drowned;
import org.jetbrains.annotations.NotNull;

public class LevelledDrowned extends BaseLevelledMob<@NotNull Drowned> {

  public LevelledDrowned(@NotNull Drowned mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Drowned";
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