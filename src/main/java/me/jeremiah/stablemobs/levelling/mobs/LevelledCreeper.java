package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Creeper;
import org.jetbrains.annotations.NotNull;

public class LevelledCreeper extends BaseLevelledMob<@NotNull Creeper> {

  public LevelledCreeper(@NotNull Creeper mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Creeper";
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

}
