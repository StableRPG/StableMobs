package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Mob;
import org.jetbrains.annotations.NotNull;

public class GenericLevelledMob extends BaseLevelledMob<@NotNull Mob> {

  public GenericLevelledMob(@NotNull Mob mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Generic Mob";
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }
}
