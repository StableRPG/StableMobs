package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Witch;
import org.jetbrains.annotations.NotNull;

public class LevelledWitch extends BaseLevelledMob<@NotNull Witch> {

  public LevelledWitch(@NotNull Witch mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Witch";
  }

  @Override
  public int getBaseLevel() {
    return 14;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 