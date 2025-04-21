package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Snowman;
import org.jetbrains.annotations.NotNull;

public class LevelledSnowGolem extends BaseLevelledMob<@NotNull Snowman> {

  public LevelledSnowGolem(@NotNull Snowman mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Snow Golem";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<green>%d</green> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 5;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 