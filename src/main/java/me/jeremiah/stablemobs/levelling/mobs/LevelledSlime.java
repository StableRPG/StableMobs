package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Slime;
import org.jetbrains.annotations.NotNull;

public class LevelledSlime extends BaseLevelledMob<@NotNull Slime> {

  public LevelledSlime(@NotNull Slime mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Slime";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<red>%d</red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 8;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 