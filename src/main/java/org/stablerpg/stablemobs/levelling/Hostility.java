package org.stablerpg.stablemobs.levelling;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.text.format.NamedTextColor;
import org.jetbrains.annotations.Nullable;

@RequiredArgsConstructor
@Getter
public enum Hostility {
  PASSIVE(NamedTextColor.GREEN),
  NEUTRAL(NamedTextColor.YELLOW),
  HOSTILE(NamedTextColor.RED),
  BOSS(null);

  private final @Nullable NamedTextColor color;
}
