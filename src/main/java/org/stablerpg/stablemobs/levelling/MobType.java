package org.stablerpg.stablemobs.levelling;

import com.google.common.base.Preconditions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.stablerpg.stablemobs.levelling.mobs.AbstractLevelledMob;
import org.stablerpg.stablemobs.levelling.mobs.GenericLevelledMob;
import org.stablerpg.stablemobs.levelling.mobs.LevelledAllay;
import org.stablerpg.stablemobs.levelling.mobs.LevelledArmadillo;
import org.stablerpg.stablemobs.levelling.mobs.LevelledAxolotl;
import org.stablerpg.stablemobs.levelling.mobs.LevelledBat;
import org.stablerpg.stablemobs.levelling.mobs.LevelledBee;
import org.stablerpg.stablemobs.levelling.mobs.LevelledBlaze;
import org.stablerpg.stablemobs.levelling.mobs.LevelledBogged;
import org.stablerpg.stablemobs.levelling.mobs.LevelledBreeze;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCamel;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCat;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCaveSpider;
import org.stablerpg.stablemobs.levelling.mobs.LevelledChicken;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCod;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCow;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCreaking;
import org.stablerpg.stablemobs.levelling.mobs.LevelledCreeper;
import org.stablerpg.stablemobs.levelling.mobs.LevelledDolphin;
import org.stablerpg.stablemobs.levelling.mobs.LevelledDonkey;
import org.stablerpg.stablemobs.levelling.mobs.LevelledDrowned;
import org.stablerpg.stablemobs.levelling.mobs.LevelledEnderman;
import org.stablerpg.stablemobs.levelling.mobs.LevelledEndermite;
import org.stablerpg.stablemobs.levelling.mobs.LevelledEvoker;
import org.stablerpg.stablemobs.levelling.mobs.LevelledFox;
import org.stablerpg.stablemobs.levelling.mobs.LevelledFrog;
import org.stablerpg.stablemobs.levelling.mobs.LevelledGhast;
import org.stablerpg.stablemobs.levelling.mobs.LevelledGiant;
import org.stablerpg.stablemobs.levelling.mobs.LevelledGlowSquid;
import org.stablerpg.stablemobs.levelling.mobs.LevelledGoat;
import org.stablerpg.stablemobs.levelling.mobs.LevelledGuardian;
import org.stablerpg.stablemobs.levelling.mobs.LevelledHoglin;
import org.stablerpg.stablemobs.levelling.mobs.LevelledHorse;
import org.stablerpg.stablemobs.levelling.mobs.LevelledHusk;
import org.stablerpg.stablemobs.levelling.mobs.LevelledIllusioner;
import org.stablerpg.stablemobs.levelling.mobs.LevelledIronGolem;
import org.stablerpg.stablemobs.levelling.mobs.LevelledLlama;
import org.stablerpg.stablemobs.levelling.mobs.LevelledMagmaCube;
import org.stablerpg.stablemobs.levelling.mobs.LevelledMooshroom;
import org.stablerpg.stablemobs.levelling.mobs.LevelledMule;
import org.stablerpg.stablemobs.levelling.mobs.LevelledOcelot;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPanda;
import org.stablerpg.stablemobs.levelling.mobs.LevelledParrot;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPhantom;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPig;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPiglin;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPiglinBrute;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPillager;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPolarBear;
import org.stablerpg.stablemobs.levelling.mobs.LevelledPufferfish;
import org.stablerpg.stablemobs.levelling.mobs.LevelledRabbit;
import org.stablerpg.stablemobs.levelling.mobs.LevelledRavager;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSalmon;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSheep;
import org.stablerpg.stablemobs.levelling.mobs.LevelledShulker;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSilverfish;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSkeleton;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSkeletonHorse;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSlime;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSniffer;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSnowGolem;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSpider;
import org.stablerpg.stablemobs.levelling.mobs.LevelledSquid;
import org.stablerpg.stablemobs.levelling.mobs.LevelledStray;
import org.stablerpg.stablemobs.levelling.mobs.LevelledStrider;
import org.stablerpg.stablemobs.levelling.mobs.LevelledTadpole;
import org.stablerpg.stablemobs.levelling.mobs.LevelledTraderLlama;
import org.stablerpg.stablemobs.levelling.mobs.LevelledTropicalFish;
import org.stablerpg.stablemobs.levelling.mobs.LevelledTurtle;
import org.stablerpg.stablemobs.levelling.mobs.LevelledVex;
import org.stablerpg.stablemobs.levelling.mobs.LevelledVillager;
import org.stablerpg.stablemobs.levelling.mobs.LevelledVindicator;
import org.stablerpg.stablemobs.levelling.mobs.LevelledWanderingTrader;
import org.stablerpg.stablemobs.levelling.mobs.LevelledWitch;
import org.stablerpg.stablemobs.levelling.mobs.LevelledWitherSkeleton;
import org.stablerpg.stablemobs.levelling.mobs.LevelledWolf;
import org.stablerpg.stablemobs.levelling.mobs.LevelledZoglin;
import org.stablerpg.stablemobs.levelling.mobs.LevelledZombie;
import org.stablerpg.stablemobs.levelling.mobs.LevelledZombieHorse;
import org.stablerpg.stablemobs.levelling.mobs.LevelledZombieVillager;
import org.stablerpg.stablemobs.levelling.mobs.bosses.LevelledElderGuardian;
import org.stablerpg.stablemobs.levelling.mobs.bosses.LevelledEnderDragon;
import org.stablerpg.stablemobs.levelling.mobs.bosses.LevelledWarden;
import org.stablerpg.stablemobs.levelling.mobs.bosses.LevelledWither;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public enum MobType {

  GENERIC(GenericLevelledMob.class, EntityType.UNKNOWN), // Meant for mobs that are not yet implemented
  ALLAY(LevelledAllay.class, EntityType.ALLAY),
  ARMADILLO(LevelledArmadillo.class, EntityType.ARMADILLO),
  AXOLOTL(LevelledAxolotl.class, EntityType.AXOLOTL),
  BAT(LevelledBat.class, EntityType.BAT),
  BEE(LevelledBee.class, EntityType.BEE),
  BLAZE(LevelledBlaze.class, EntityType.BLAZE),
  BOGGED(LevelledBogged.class, EntityType.BOGGED),
  BREEZE(LevelledBreeze.class, EntityType.BREEZE),
  CAMEL(LevelledCamel.class, EntityType.CAMEL),
  CAT(LevelledCat.class, EntityType.CAT),
  CAVE_SPIDER(LevelledCaveSpider.class, EntityType.CAVE_SPIDER),
  CHICKEN(LevelledChicken.class, EntityType.CHICKEN),
  COD(LevelledCod.class, EntityType.COD),
  COW(LevelledCow.class, EntityType.COW),
  CREAKING(LevelledCreaking.class, EntityType.CREAKING),
  CREEPER(LevelledCreeper.class, EntityType.CREEPER),
  DOLPHIN(LevelledDolphin.class, EntityType.DOLPHIN),
  DONKEY(LevelledDonkey.class, EntityType.DONKEY),
  DROWNED(LevelledDrowned.class, EntityType.DROWNED),
  ELDER_GUARDIAN(LevelledElderGuardian.class, EntityType.ELDER_GUARDIAN),
  ENDER_DRAGON(LevelledEnderDragon.class, EntityType.ENDER_DRAGON),
  ENDERMAN(LevelledEnderman.class, EntityType.ENDERMAN),
  ENDERMITE(LevelledEndermite.class, EntityType.ENDERMITE),
  EVOKER(LevelledEvoker.class, EntityType.EVOKER),
  FOX(LevelledFox.class, EntityType.FOX),
  FROG(LevelledFrog.class, EntityType.FROG),
  GHAST(LevelledGhast.class, EntityType.GHAST),
  GIANT(LevelledGiant.class, EntityType.GIANT),
  GLOW_SQUID(LevelledGlowSquid.class, EntityType.GLOW_SQUID),
  GOAT(LevelledGoat.class, EntityType.GOAT),
  GUARDIAN(LevelledGuardian.class, EntityType.GUARDIAN),
  HOGLIN(LevelledHoglin.class, EntityType.HOGLIN),
  HORSE(LevelledHorse.class, EntityType.HORSE),
  HUSK(LevelledHusk.class, EntityType.HUSK),
  ILLUSIONER(LevelledIllusioner.class, EntityType.ILLUSIONER),
  IRON_GOLEM(LevelledIronGolem.class, EntityType.IRON_GOLEM),
  LLAMA(LevelledLlama.class, EntityType.LLAMA),
  MAGMA_CUBE(LevelledMagmaCube.class, EntityType.MAGMA_CUBE),
  MOOSHROOM(LevelledMooshroom.class, EntityType.MOOSHROOM),
  MULE(LevelledMule.class, EntityType.MULE),
  OCELOT(LevelledOcelot.class, EntityType.OCELOT),
  PANDA(LevelledPanda.class, EntityType.PANDA),
  PARROT(LevelledParrot.class, EntityType.PARROT),
  PHANTOM(LevelledPhantom.class, EntityType.PHANTOM),
  PIG(LevelledPig.class, EntityType.PIG),
  PIGLIN(LevelledPiglin.class, EntityType.PIGLIN),
  PIGLIN_BRUTE(LevelledPiglinBrute.class, EntityType.PIGLIN_BRUTE),
  PILLAGER(LevelledPillager.class, EntityType.PILLAGER),
  POLAR_BEAR(LevelledPolarBear.class, EntityType.POLAR_BEAR),
  PUFFERFISH(LevelledPufferfish.class, EntityType.PUFFERFISH),
  RABBIT(LevelledRabbit.class, EntityType.RABBIT),
  RAVAGER(LevelledRavager.class, EntityType.RAVAGER),
  SALMON(LevelledSalmon.class, EntityType.SALMON),
  SHEEP(LevelledSheep.class, EntityType.SHEEP),
  SHULKER(LevelledShulker.class, EntityType.SHULKER),
  SILVERFISH(LevelledSilverfish.class, EntityType.SILVERFISH),
  SKELETON(LevelledSkeleton.class, EntityType.SKELETON),
  SKELETON_HORSE(LevelledSkeletonHorse.class, EntityType.SKELETON_HORSE),
  SLIME(LevelledSlime.class, EntityType.SLIME),
  SNIFFER(LevelledSniffer.class, EntityType.SNIFFER),
  SNOW_GOLEM(LevelledSnowGolem.class, EntityType.SNOW_GOLEM),
  SPIDER(LevelledSpider.class, EntityType.SPIDER),
  SQUID(LevelledSquid.class, EntityType.SQUID),
  STRAY(LevelledStray.class, EntityType.STRAY),
  STRIDER(LevelledStrider.class, EntityType.STRIDER),
  TADPOLE(LevelledTadpole.class, EntityType.TADPOLE),
  TRADER_LLAMA(LevelledTraderLlama.class, EntityType.TRADER_LLAMA),
  TROPICAL_FISH(LevelledTropicalFish.class, EntityType.TROPICAL_FISH),
  TURTLE(LevelledTurtle.class, EntityType.TURTLE),
  VEX(LevelledVex.class, EntityType.VEX),
  VILLAGER(LevelledVillager.class, EntityType.VILLAGER),
  VINDICATOR(LevelledVindicator.class, EntityType.VINDICATOR),
  WANDERING_TRADER(LevelledWanderingTrader.class, EntityType.WANDERING_TRADER),
  WARDEN(LevelledWarden.class, EntityType.WARDEN),
  WITCH(LevelledWitch.class, EntityType.WITCH),
  WITHER(LevelledWither.class, EntityType.WITHER),
  WITHER_SKELETON(LevelledWitherSkeleton.class, EntityType.WITHER_SKELETON),
  WOLF(LevelledWolf.class, EntityType.WOLF),
  ZOGLIN(LevelledZoglin.class, EntityType.ZOGLIN),
  ZOMBIE(LevelledZombie.class, EntityType.ZOMBIE),
  ZOMBIE_HORSE(LevelledZombieHorse.class, EntityType.ZOMBIE_HORSE),
  ZOMBIE_VILLAGER(LevelledZombieVillager.class, EntityType.ZOMBIE_VILLAGER);

  private final Class<? extends AbstractLevelledMob<?>> mobClass;
  private final EntityType entityType;

  public AbstractLevelledMob<?> createLevelledMob(Mob mob) {
    try {
      Class<?> interfaceClass = entityType.getEntityClass();
      return mobClass.getConstructor(interfaceClass).newInstance(mob);
    } catch (Exception exception) {
      throw new RuntimeException("Failed to create levelled mob", exception);
    }
  }

  private static final Map<EntityType, MobType> translation;

  static {
    translation = Arrays.stream(values()).collect(Collectors.toUnmodifiableMap(MobType::getEntityType, o -> o));
  }

  public static MobType getMobType(Mob mob) {
    return getMobType(mob.getType());
  }

  private static MobType getMobType(EntityType entityType) {
    Class<? extends Entity> entityClass = entityType.getEntityClass();
    Preconditions.checkState(entityClass != null, "Failed to get MobType for " + entityType.name() + " (EntityClass is null)");
    Preconditions.checkState(Mob.class.isAssignableFrom(entityClass), "Failed to get MobType for " + entityType.name() + " (EntityClass is not a Mob)");

    MobType mobType = translation.get(entityType);
    Preconditions.checkNotNull(mobType, "Failed to get MobType for " + entityType.name() + " (MobType is null)");

    return mobType;
  }

}
