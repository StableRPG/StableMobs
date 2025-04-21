package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Silverfish;
import org.jetbrains.annotations.NotNull;

public class LevelledSilverfish extends BaseLevelledMob<@NotNull Silverfish> {

  public LevelledSilverfish(@NotNull Silverfish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Silverfish";
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 