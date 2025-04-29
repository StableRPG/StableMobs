package org.stablerpg.stablemobs.levelling.modifier;

import lombok.AllArgsConstructor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.stablerpg.stablemobs.StableMobs;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledMob;
import org.stablerpg.stablemobs.util.MathUtil;

import java.util.function.Consumer;
import java.util.function.Predicate;

@AllArgsConstructor
public enum MobModifier implements Predicate<AbstractLevelledMob<?>>, Consumer<AbstractLevelledMob<?>> {

  HEALTH_MODIFIER(mob -> {
    int level = mob.getLevel();
    double health = mob.getHealth();
    double maxHealth = mob.getAttributeValue(Attribute.MAX_HEALTH);
    double ratio = health / maxHealth;
    System.out.println(MathUtil.log(level, 5));
    AttributeModifier modifier = new AttributeModifier(StableMobs.getPluginKey("levelled_health"), MathUtil.log(level, 5), AttributeModifier.Operation.ADD_SCALAR);
    mob.replaceAttributeModifier(Attribute.MAX_HEALTH, modifier);
    maxHealth = mob.getAttributeValue(Attribute.MAX_HEALTH);
    mob.getMob().setHealth(ratio * maxHealth);
  });

  private final Predicate<AbstractLevelledMob<?>> predicate;
  private final Consumer<AbstractLevelledMob<?>> modifier;

  MobModifier(Consumer<AbstractLevelledMob<?>> modifier) {
    this(context -> true, modifier);
  }

  @Override
  public boolean test(AbstractLevelledMob<?> modifierContext) {
    return predicate.test(modifierContext);
  }

  @Override
  public void accept(AbstractLevelledMob<?> mob) {
    modifier.accept(mob);
  }

}
