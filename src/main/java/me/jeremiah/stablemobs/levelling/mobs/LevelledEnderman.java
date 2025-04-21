package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Enderman;
import org.jetbrains.annotations.NotNull;

public class LevelledEnderman extends BaseLevelledMob<@NotNull Enderman> {

  public LevelledEnderman(@NotNull Enderman mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Enderman";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<dark_purple>%d</dark_purple> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.NEUTRAL;
  }

} 