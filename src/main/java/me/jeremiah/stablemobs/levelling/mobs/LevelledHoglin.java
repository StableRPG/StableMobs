package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Hoglin;
import org.jetbrains.annotations.NotNull;

public class LevelledHoglin extends BaseLevelledMob<@NotNull Hoglin> {

  public LevelledHoglin(@NotNull Hoglin mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Hoglin";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 18;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 