package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Sniffer;
import org.jetbrains.annotations.NotNull;

public class LevelledSniffer extends BaseLevelledMob<@NotNull Sniffer> {

  public LevelledSniffer(@NotNull Sniffer mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Sniffer";
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 