package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Piglin;
import org.jetbrains.annotations.NotNull;

public class LevelledPiglin extends BaseLevelledMob<@NotNull Piglin> {

  public LevelledPiglin(@NotNull Piglin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Piglin";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<yellow>%d</yellow> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 