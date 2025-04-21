package me.jeremiah.stablemobs.levelling.modifier;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public final class LevelModifier implements BiFunction<Integer, ModifierContext, Integer> {

  private static final double LOG_9 = StrictMath.log(9.0);
  public static final LevelModifier SPAWN_DISTANCE_MODIFIER = new LevelModifier((level, context) -> {
    double x = context.getLevelledMob().getSpawnX();
    double z = context.getLevelledMob().getSpawnZ();
    double log = StrictMath.log(Math.sqrt((x * x) + (z * z)) + 9.0);
    double log9 = log / LOG_9;
    return (int) (level * log9);
  });
  public static final LevelModifier DIFFICULTY_MODIFIER = new LevelModifier((level, context) ->
    switch (context.getLevelledMob().getMob().getWorld().getDifficulty()) {
      case PEACEFUL -> (int) (level * 0.25);
      case EASY -> (int) (level * 0.5);
      case NORMAL -> level;
      case HARD -> level << 1;
    }
  );

  private final BiFunction<Integer, ModifierContext, Integer> modifier;

  @Override
  public Integer apply(Integer level, ModifierContext modifierContext) {
    return modifier.apply(level, modifierContext);
  }

}
