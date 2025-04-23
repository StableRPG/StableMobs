package org.stablerpg.stablemobs.levelling.mobs;

import org.bukkit.entity.Mob;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.Nullable;
import org.stablerpg.stablemobs.StableMobs;

import java.util.UUID;

@FunctionalInterface
public interface MobDataHolder<T extends Mob> {

  T getMob();

  default UUID getUniqueId() {
    return getMob().getUniqueId();
  }

  default @Nullable PersistentDataContainer getPersistentDataContainer() {
    return getMob().getPersistentDataContainer();
  }

  // StableMobs start

  default int getSpawnX() {
    PersistentDataContainer container = getPersistentDataContainer();
    if (container == null)
      return 0;
    Integer x = container.get(StableMobs.getPluginKey("spawn-x"), PersistentDataType.INTEGER);
    return x == null ? 0 : x;
  }

  default int getSpawnZ() {
    PersistentDataContainer container = getPersistentDataContainer();
    if (container == null)
      return 0;
    Integer z = container.get(StableMobs.getPluginKey("spawn-z"), PersistentDataType.INTEGER);
    return z == null ? 0 : z;
  }

  // StableMobs end

}
