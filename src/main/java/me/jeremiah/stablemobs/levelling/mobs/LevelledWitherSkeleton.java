package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.WitherSkeleton;
import org.jetbrains.annotations.NotNull;

public class LevelledWitherSkeleton extends BaseLevelledMob<@NotNull WitherSkeleton> {

  public LevelledWitherSkeleton(@NotNull WitherSkeleton mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wither Skeleton";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<dark_red>%d</dark_red> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 16;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 