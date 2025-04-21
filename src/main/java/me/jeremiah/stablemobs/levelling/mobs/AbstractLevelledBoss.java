package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import me.jeremiah.stablemobs.levelling.modifier.ModifierContext;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Mob;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractLevelledBoss<T extends Mob> extends BaseLevelledMob<T> {

  protected AbstractLevelledBoss(@NotNull T mob) {
    super(mob);
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.BOSS;
  }

  @Override
  protected int applyLevelModifiers(int level, ModifierContext context) {
    return Math.max(1, level);
  }


  @Override
  public @NotNull Component getDisplayName() {
    String levelColor = getLevelColor().toString();
    String rawName = String.format("<%s>%d<%s> <gray>%s</gray>", levelColor, getLevel(), levelColor, getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  protected abstract @NotNull NamedTextColor getLevelColor();

}
