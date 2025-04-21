package me.jeremiah.stablemobs.levelling.mobs;

import me.jeremiah.stablemobs.levelling.Hostility;
import org.bukkit.entity.Illusioner;
import org.jetbrains.annotations.NotNull;

public class LevelledIllusioner extends BaseLevelledMob<@NotNull Illusioner> {

  public LevelledIllusioner(@NotNull Illusioner mob) {
    super(mob);
  }

  @Override
  public @NotNull String getName() {
    return "Illusioner";
  }

  @Override
  public int getBaseLevel() {
    return 20;
  }

  @Override
  public @NotNull Hostility getHostility() {
    return Hostility.HOSTILE;
  }

} 