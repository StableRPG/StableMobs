package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Tadpole;
import org.jetbrains.annotations.NotNull;

public class LevelledTadpole extends BaseLevelledMob<@NotNull Tadpole> {

  public LevelledTadpole(@NotNull Tadpole mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tadpole";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 