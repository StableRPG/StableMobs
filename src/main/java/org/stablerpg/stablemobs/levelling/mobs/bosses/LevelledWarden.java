package org.stablerpg.stablemobs.levelling.mobs.bosses;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Warden;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledBoss;

public class LevelledWarden extends AbstractLevelledBoss<@NotNull Warden> {

  public LevelledWarden(@NotNull Warden mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Warden";
  }

  @Override
  protected @NotNull NamedTextColor getLevelColor() {
    return NamedTextColor.DARK_AQUA;
  }

  @Override
  public int getBaseLevel() {
    return 1000;
  }

}
