package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Camel;
import org.jetbrains.annotations.NotNull;

public class LevelledCamel extends BaseLevelledMob<@NotNull Camel> {

  public LevelledCamel(@NotNull Camel mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Camel";
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