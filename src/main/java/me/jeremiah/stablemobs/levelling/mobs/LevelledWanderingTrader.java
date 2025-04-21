package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.WanderingTrader;
import org.jetbrains.annotations.NotNull;

public class LevelledWanderingTrader extends BaseLevelledMob<@NotNull WanderingTrader> {

  public LevelledWanderingTrader(@NotNull WanderingTrader mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Wandering Trader";
  }

  @Override
  public @NotNull Component getDisplayName() {
    String rawName = String.format("<green>%d</green> <gray>%s</gray>", getLevel(), getName());
    return MiniMessage.miniMessage().deserialize(rawName);
  }

  @Override
  public int getBaseLevel() {
    return 10;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.PASSIVE;
  }

} 