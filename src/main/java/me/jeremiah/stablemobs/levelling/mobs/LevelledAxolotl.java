package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Axolotl;
import org.jetbrains.annotations.NotNull;

public class LevelledAxolotl extends BaseLevelledMob<@NotNull Axolotl> {

  public LevelledAxolotl(@NotNull Axolotl mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Axolotl";
  }

  @Override
  public int getBaseLevel() {
    return 4;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 