package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.PiglinBrute;
import org.jetbrains.annotations.NotNull;

public class LevelledPiglinBrute extends BaseLevelledMob<@NotNull PiglinBrute> {

  public LevelledPiglinBrute(@NotNull PiglinBrute mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Piglin Brute";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 