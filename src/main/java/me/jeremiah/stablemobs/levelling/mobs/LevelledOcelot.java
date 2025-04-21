package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Ocelot;
import org.jetbrains.annotations.NotNull;

public class LevelledOcelot extends BaseLevelledMob<@NotNull Ocelot> {

  public LevelledOcelot(@NotNull Ocelot mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ocelot";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 