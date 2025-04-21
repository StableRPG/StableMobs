package me.jeremiah.stablemobs.levelling.modifier;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.jeremiah.stablemobs.levelling.mobs.AbstractLevelledMob;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ModifierContext {

  private final AbstractLevelledMob<?> levelledMob;

  @RequiredArgsConstructor
  public static class Builder {

    private final AbstractLevelledMob<?> levelledMob;

    public ModifierContext build() {
      return new ModifierContext(levelledMob);
    }

  }

}
