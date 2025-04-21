package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Dolphin;
import org.jetbrains.annotations.NotNull;

public class LevelledDolphin extends BaseLevelledMob<@NotNull Dolphin> {

  public LevelledDolphin(@NotNull Dolphin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Dolphin";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<aqua>%d</aqua> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 