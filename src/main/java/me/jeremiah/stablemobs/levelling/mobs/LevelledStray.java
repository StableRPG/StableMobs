package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Stray;
import org.jetbrains.annotations.NotNull;

public class LevelledStray extends BaseLevelledMob<@NotNull Stray> {

  public LevelledStray(@NotNull Stray mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Stray";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 