package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Giant;
import org.jetbrains.annotations.NotNull;

public class LevelledGiant extends BaseLevelledMob<@NotNull Giant> {

  public LevelledGiant(@NotNull Giant mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Giant";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<dark_red>%d</dark_red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 40;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.BOSS;
  }

} 