package org.stablerpg.stablemobs.levelling.mobs;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.stablerpg.stablemobs.StableMobs;
import org.stablerpg.stablemobs.levelling.MobType;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

public interface SimpleMob<T extends Mob> {

  @NotNull T getMob();

  @NotNull MobType getType();

  default @NotNull UUID getUniqueId() {
    return getMob().getUniqueId();
  }

  // Basic start

  default double getHealth() {
    return getMob().getHealth();
  }

  default boolean isDead() {
    return getMob().isDead();
  }

  default void customName(Component component) {
    getMob().customName(component);
  }

  default void setLootTable(LootTable lootTable) {
    getMob().setLootTable(lootTable);
  }

  // Basic end

  // PersistentData start

  default @NotNull PersistentDataContainer getPersistentDataContainer() {
    return getMob().getPersistentDataContainer();
  }

  default <P, C> void setPersistentData(@NotNull NamespacedKey key, @NotNull PersistentDataType<P, C> type, @NotNull C value) {
    getPersistentDataContainer().set(key, type, value);
  }

  default void removePersistentData(@NotNull NamespacedKey key) {
    getPersistentDataContainer().remove(key);
  }

  default <P, C> boolean hasPersistentData(NamespacedKey key, PersistentDataType<P, C> type) {
    return getPersistentDataContainer().has(key, type);
  }

  default boolean hasPersistentData(NamespacedKey key) {
    return getPersistentDataContainer().has(key);
  }

  default <P, C> @Nullable C getPersistentData(NamespacedKey key, PersistentDataType<P, C> type) {
    return getPersistentDataContainer().get(key, type);
  }

  default <P, C> C getPersistentDataOrDefault(NamespacedKey key, PersistentDataType<P, C> type, C defaultValue) {
    return getPersistentDataContainer().getOrDefault(key, type, defaultValue);
  }

  default Set<NamespacedKey> getPersistentDataKeys() {
    return getPersistentDataContainer().getKeys();
  }

  // PersistentData end

  // Attributes start

  default @Nullable AttributeInstance getAttribute(@NotNull Attribute attribute) {
    return getMob().getAttribute(attribute);
  }

  default double getAttributeBaseValue(@NotNull Attribute attribute) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return 0;
    }
    return instance.getBaseValue();
  }

  default void setAttributeBaseValue(@NotNull Attribute attribute, double value) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return;
    }
    instance.setBaseValue(value);
  }

  default Collection<AttributeModifier> getAttributeModifiers(@NotNull Attribute attribute) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return Collections.emptySet();
    }
    return instance.getModifiers();
  }

  default @Nullable AttributeModifier getAttributeModifier(@NotNull Attribute attribute, @NotNull Key key) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return null;
    }
    return instance.getModifier(key);
  }

  default void removeAttributeModifier(@NotNull Attribute attribute, @NotNull Key key) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return;
    }
    instance.removeModifier(key);
  }

  default void addAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier modifier) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return;
    }
    instance.addModifier(modifier);
  }

  default void addTemporaryAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier modifier) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return;
    }
    instance.addTransientModifier(modifier);
  }

  default void removeAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier modifier) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return;
    }
    instance.removeModifier(modifier);
  }

  default double getAttributeValue(@NotNull Attribute attribute) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return 0;
    }
    return instance.getValue();
  }

  default double getAttributeDefaultValue(@NotNull Attribute attribute) {
    AttributeInstance instance = getAttribute(attribute);
    if (instance == null) {
      String attributeName = attribute.getKey().asMinimalString();
      String type = getType().name();
      StableMobs.logger().warning("Attribute " + attributeName + " is not registered for mob " + type);
      return 0;
    }
    return instance.getDefaultValue();
  }

  // Attributes end

  // StableMobs start

  default int getSpawnX() {
    return getPersistentDataOrDefault(StableMobs.getPluginKey("spawn-x"), PersistentDataType.INTEGER, 0);
  }

  default int getSpawnZ() {
    return getPersistentDataOrDefault(StableMobs.getPluginKey("spawn-z"), PersistentDataType.INTEGER, 0);
  }

  // StableMobs end

}
