package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Shulker;
import org.jetbrains.annotations.NotNull;

public class LevelledShulker extends BaseLevelledMob<@NotNull Shulker> {

  public LevelledShulker(@NotNull Shulker mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Shulker";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<light_purple>%d</light_purple> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 15;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 