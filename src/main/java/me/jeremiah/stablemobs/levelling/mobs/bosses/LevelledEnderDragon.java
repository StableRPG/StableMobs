package me.jeremiah.stablemobs.levelling.mobs.bosses;

import me.jeremiah.stablemobs.levelling.mobs.AbstractLevelledBoss;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.EnderDragon;
import org.jetbrains.annotations.NotNull;

public class LevelledEnderDragon extends AbstractLevelledBoss<@NotNull EnderDragon> {

  public LevelledEnderDragon(@NotNull EnderDragon mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Ender Dragon";
  }

  @Override
  protected @NotNull NamedTextColor getLevelColor() {
    return NamedTextColor.DARK_PURPLE;
  }

  @Override
  public int getBaseLevel() {
    return 999;
  }

}
