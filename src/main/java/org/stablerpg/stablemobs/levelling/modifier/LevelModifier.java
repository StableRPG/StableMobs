package org.stablerpg.stablemobs.levelling.modifier;

import lombok.RequiredArgsConstructor;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.stablerpg.stablemobs.levelling.Hostility;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledMob;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@RequiredArgsConstructor

public enum LevelModifier implements Predicate<AbstractLevelledMob<?>>, BiFunction<Integer, AbstractLevelledMob<?>, Integer> {

  END_MODIFIER(mob -> {
    EntityType type = mob.getMob().getType();
    return type == EntityType.ENDERMAN || type == EntityType.ENDERMITE || type == EntityType.SHULKER;
  }, (level, mob) -> {
    if (mob.getMob().getWorld().getEnvironment() == org.bukkit.World.Environment.THE_END)
      return level << 1;
    return level;
  }),
  NIGHT_MODIFIER(mob -> mob.getHostility() == Hostility.HOSTILE,
    (level, mob) -> {
      World world = mob.getMob().getWorld();
      if (!world.isDayTime() && world.getEnvironment() == World.Environment.NORMAL)
        return level << 1;
      return level;
    }),
  DEPTH_MODIFIER(mob -> true,
    (level, mob) -> {
      int y = mob.getMob().getLocation().getBlockY();
      if (y < 0)
        return level + Math.abs(y / 16);
      else if (y < 64)
        return (int) (level * 1.1);
      return level;
    }),
  DIFFICULTY_MODIFIER((level, mob) ->
    switch (mob.getMob().getWorld().getDifficulty()) {
      case PEACEFUL -> level >> 4;
      case EASY -> level >> 1;
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
