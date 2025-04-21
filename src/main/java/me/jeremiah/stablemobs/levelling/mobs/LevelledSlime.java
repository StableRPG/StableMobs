package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Slime;
import org.jetbrains.annotations.NotNull;

public class LevelledSlime extends BaseLevelledMob<@NotNull Slime> {

  public LevelledSlime(@NotNull Slime mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Slime";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 