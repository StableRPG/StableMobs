package org.stablerpg.stablemobs.levelling.mobs;

import lombok.Getter;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.loot.LootTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.stablerpg.stablemobs.levelling.MobType;

import java.util.Collections;
import java.util.Map;

@Getter
public class SimpleMobImpl<T extends Mob> implements SimpleMob<T> {

  private final @NotNull T mob;
  private final @NotNull MobType type;

  protected SimpleMobImpl(@NotNull T mob) {
    this.mob = mob;
    type = MobType.getMobType(mob);
  }

  public @NotNull Map<Attribute, Double> getBaseAttributes() {
    return Collections.emptyMap();
  }

  public @Nullable LootTable getLootTable() {
    return null;
  }


}
