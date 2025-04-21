package me.jeremiah.stablemobs;

import me.jeremiah.stablemobs.levelling.MobType;
import me.jeremiah.stablemobs.levelling.mobs.AbstractLevelledMob;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityRemoveEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MobManager implements Listener {

  private final MobTracker tracker = new MobTracker();

  MobManager(StableMobs plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
    Bukkit.getScheduler().runTaskTimer(plugin, () -> {
      int tick = Bukkit.getCurrentTick();
      Set<AbstractLevelledMob<?>> toRemove = new HashSet<>();
      for (AbstractLevelledMob<?> mob : tracker.getMobs()) {
        if (mob.getMob().isDead()) {
          toRemove.add(mob);
          continue;
        }
        mob.tick(tick);
      }
      for (AbstractLevelledMob<?> mob : toRemove)
        tracker.removeMob(mob);
    }, 10, 10);
  }


  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onEntitySpawn(EntitySpawnEvent event) {
    if (!(event.getEntity() instanceof Mob mob))
      return;
    tracker.addMob(mob);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onEntityDeath(EntityDeathEvent event) {
    if (!(event.getEntity() instanceof Mob mob))
      return;
    tracker.removeMob(mob);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onEntityDespawn(EntityRemoveEvent event) {
    if (!(event.getEntity() instanceof Mob mob))
      return;
    tracker.removeMob(mob);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onServerLoad(ChunkLoadEvent event) {
    for (Entity entity : event.getChunk().getEntities())
      if (entity instanceof Mob mob)
        tracker.addMob(mob);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onWorldLoad(WorldLoadEvent event) {
    for (Mob mob : event.getWorld().getEntitiesByClass(Mob.class))
      tracker.addMob(mob);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void onWorldUnload(WorldUnloadEvent event) {
    for (Mob mob : event.getWorld().getEntitiesByClass(Mob.class))
      tracker.removeMob(mob);
  }

  private static final class MobTracker {

    private final Set<AbstractLevelledMob<?>> mobs;
    private final Map<UUID, AbstractLevelledMob<?>> uuidConversion;

    private MobTracker() {
      mobs = new HashSet<>();
      uuidConversion = new HashMap<>();
    }

    public void addMob(Mob mob) {
      MobType type = MobType.getMobType(mob);
      AbstractLevelledMob<?> levelledMob = type.createLevelledMob(mob);
      addMob(levelledMob);
    }

    public void addMob(AbstractLevelledMob<?> mob) {
      if (!mobs.add(mob))
        return;
      uuidConversion.put(mob.getUniqueId(), mob);
      mob.updateLevel();
    }

    public void removeMob(AbstractLevelledMob<?> mob) {
      mobs.remove(mob);
      uuidConversion.remove(mob.getUniqueId());
    }

    public void removeMob(Mob mob) {
      removeMob(mob.getUniqueId());
    }

    public void removeMob(UUID uniqueId) {
      AbstractLevelledMob<?> mob = uuidConversion.remove(uniqueId);
      if (mob != null)
        mobs.remove(mob);
    }

    public @Nullable AbstractLevelledMob<?> getMob(UUID uniqueId) {
      return uuidConversion.get(uniqueId);
    }

    public @NotNull Set<AbstractLevelledMob<?>> getMobs() {
      return Collections.unmodifiableSet(mobs);
    }

  }

}
