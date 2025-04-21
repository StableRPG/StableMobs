package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Donkey;
import org.jetbrains.annotations.NotNull;

public class LevelledDonkey extends BaseLevelledMob<@NotNull Donkey> {

  public LevelledDonkey(@NotNull Donkey mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Donkey";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<green>%d</green> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 6;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 