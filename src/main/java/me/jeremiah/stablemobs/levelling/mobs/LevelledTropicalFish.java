package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.TropicalFish;
import org.jetbrains.annotations.NotNull;

public class LevelledTropicalFish extends BaseLevelledMob<@NotNull TropicalFish> {

  public LevelledTropicalFish(@NotNull TropicalFish mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tropical Fish";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<green>%d</green> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 2;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 