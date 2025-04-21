package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Bogged;
import org.jetbrains.annotations.NotNull;

public class LevelledBogged extends BaseLevelledMob<@NotNull Bogged> {

  public LevelledBogged(@NotNull Bogged mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Bogged";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 16;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 