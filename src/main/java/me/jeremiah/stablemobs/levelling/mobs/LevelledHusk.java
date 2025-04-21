package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Husk;
import org.jetbrains.annotations.NotNull;

public class LevelledHusk extends BaseLevelledMob<@NotNull Husk> {

  public LevelledHusk(@NotNull Husk mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Husk";
  }

  @Override
  public int getBaseLevel() {
    return 11;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 