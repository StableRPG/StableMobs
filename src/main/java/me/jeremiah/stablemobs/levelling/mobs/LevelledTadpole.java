package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Tadpole;
import org.jetbrains.annotations.NotNull;

public class LevelledTadpole extends BaseLevelledMob<@NotNull Tadpole> {

  public LevelledTadpole(@NotNull Tadpole mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Tadpole";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<green>%d</green> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 1;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 