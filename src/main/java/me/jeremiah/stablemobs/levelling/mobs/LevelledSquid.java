package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Squid;
import org.jetbrains.annotations.NotNull;

public class LevelledSquid extends BaseLevelledMob<@NotNull Squid> {

  public LevelledSquid(@NotNull Squid mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Squid";
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 