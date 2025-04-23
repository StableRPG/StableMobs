package org.stablerpg.stablemobs;

import lombok.Getter;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@Getter
public final class StableMobs extends JavaPlugin {

  private static StableMobs singleton;

  public static NamespacedKey getPluginKey(String key) {
    return new NamespacedKey(singleton, key);
  }

  public static Logger logger() {
    return singleton.getLogger();
  }

  private MobManager mobManager;

  @Override
  public void onLoad() {
    singleton = this;
  }

  @Override
  public void onEnable() {
    mobManager = new MobManager(this);
  }

}
