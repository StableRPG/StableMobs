package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.PolarBear;
import org.jetbrains.annotations.NotNull;

public class LevelledPolarBear extends BaseLevelledMob<@NotNull PolarBear> {

  public LevelledPolarBear(@NotNull PolarBear mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Polar Bear";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<yellow>%d</yellow> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 