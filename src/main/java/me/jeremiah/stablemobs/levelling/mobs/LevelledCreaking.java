package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Creaking;
import org.jetbrains.annotations.NotNull;

public class LevelledCreaking extends BaseLevelledMob<@NotNull Creaking> {

  public LevelledCreaking(@NotNull Creaking mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Creaking";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 17;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 