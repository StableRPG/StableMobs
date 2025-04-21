package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Creaking;
import org.jetbrains.annotations.NotNull;

public class LevelledCreaking extends BaseLevelledMob<@NotNull Creaking> {

  public LevelledCreaking(@NotNull Creaking mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Creaking";
  }

  @Override
  public int getBaseLevel() {
    return 17;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 