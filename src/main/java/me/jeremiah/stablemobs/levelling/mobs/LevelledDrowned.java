package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Drowned;
import org.jetbrains.annotations.NotNull;

public class LevelledDrowned extends BaseLevelledMob<@NotNull Drowned> {

  public LevelledDrowned(@NotNull Drowned mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Drowned";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 12;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 