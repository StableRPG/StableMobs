package org.stablerpg.stablemobs.levelling.mobs.bosses;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Wither;
import org.jetbrains.annotations.NotNull;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledBoss;

public class LevelledWither extends AbstractLevelledBoss<@NotNull Wither> {

  public LevelledWither(@NotNull Wither mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wither";
  }

  @Override
  protected @NotNull NamedTextColor getLevelColor() {
    return NamedTextColor.DARK_GRAY;
  }

  @Override
  public int getBaseLevel() {
    return 500;
  }

}
