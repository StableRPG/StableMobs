package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Allay;
import org.jetbrains.annotations.NotNull;

public class LevelledAllay extends BaseLevelledMob<@NotNull Allay> {

  public LevelledAllay(@NotNull Allay mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Allay";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<aqua>%d</aqua> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 3;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 