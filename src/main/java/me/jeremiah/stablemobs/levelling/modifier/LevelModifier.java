package me.jeremiah.stablemobs.levelling.modifier;

import lombok.RequiredArgsConstructor;
import me.jeremiah.stablemobs.levelling.Hostility;
import me.jeremiah.stablemobs.levelling.mobs.AbstractLevelledMob;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@RequiredArgsConstructor

public enum LevelModifier implements Predicate<AbstractLevelledMob<?>>, BiFunction<Integer, AbstractLevelledMob<?>, Integer> {

  NIGHT_MODIFIER(mob -> mob.getHostility() == Hostility.HOSTILE,
    (level, mob) -> {
      if (mob.getMob().getWorld().isDayTime())
        return level;
      return level << 1;
    }),
  DIFFICULTY_MODIFIER((level, mob) ->
    switch (mob.getMob().getWorld().getDifficulty()) {
      case PEACEFUL -> (int) (level * 0.25);
      case EASY -> (int) (level * 0.5);
      case NORMAL -> level;
      case HARD -> level << 1;
    }
  ),
  SPAWN_DISTANCE_MODIFIER((level, mob) -> {
    double x = mob.getSpawnX();
    double z = mob.getSpawnZ();
    double log = StrictMath.log(Math.sqrt((x * x) + (z * z)) + 9.0);
    double log9 = log / StrictMath.log(9.0);
    return (int) (level * log9);
  });

  private final Predicate<AbstractLevelledMob<?>> predicate;
  private final BiFunction<Integer, AbstractLevelledMob<?>, Integer> modifier;

  LevelModifier(BiFunction<Integer, AbstractLevelledMob<?>, Integer> modifier) {
    this(context -> true, modifier);
  }

  @Override
  public boolean test(AbstractLevelledMob<?> modifierContext) {
    return predicate.test(modifierContext);
  }

  @Override
  public Integer apply(Integer level, AbstractLevelledMob<?> modifierContext) {
    return modifier.apply(level, modifierContext);
  }

}
