package com.beetrootmonkey.feedtheworld.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.beetrootmonkey.feedtheworld.Main.MOD_ID;

public class ModItems {
  public static final Item PIECE_OF_PUMPKIN_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
  public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3F).build()));
  public static final Item PIECE_OF_APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
  public static final Item GOLDEN_APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(8).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 0), 1.0F).alwaysEdible().build()));
  public static final Item PIECE_OF_GOLDEN_APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 50, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0), 1.0F).alwaysEdible().build()));
  public static final Item ENCHANTED_GOLDEN_APPLE_PIE = new GlowingItem(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(8).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 3), 1.0F).alwaysEdible().build()));
  public static final Item PIECE_OF_ENCHANTED_GOLDEN_APPLE_PIE = new GlowingItem(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3), 1.0F).alwaysEdible().build()));
  public static final Item CHORUS_FRUIT_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3F).build()));
  public static final Item PIECE_OF_CHORUS_FRUIT_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
  public static final Item SWEET_BERRY_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.3F).build()));
  public static final Item PIECE_OF_SWEET_BERRY_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3F).build()));
  public static final Item PUMPKIN_PIE_RECIPE = new Item(new Item.Settings().group(ItemGroup.FOOD));
  public static final Item SWEET_BERRY_PIE_RECIPE = new Item(new Item.Settings().group(ItemGroup.FOOD));

  public static void doRegistration() {
    register(PIECE_OF_PUMPKIN_PIE, "piece_of_pumpkin_pie");
    register(APPLE_PIE, "apple_pie");
    register(PIECE_OF_APPLE_PIE, "piece_of_apple_pie");
    register(GOLDEN_APPLE_PIE, "golden_apple_pie");
    register(PIECE_OF_GOLDEN_APPLE_PIE, "piece_of_golden_apple_pie");
    register(ENCHANTED_GOLDEN_APPLE_PIE, "enchanted_golden_apple_pie");
    register(PIECE_OF_ENCHANTED_GOLDEN_APPLE_PIE, "piece_of_enchanted_golden_apple_pie");
    register(CHORUS_FRUIT_PIE, "chorus_fruit_pie");
    register(PIECE_OF_CHORUS_FRUIT_PIE, "piece_of_chorus_fruit_pie");
    register(SWEET_BERRY_PIE, "sweet_berry_pie");
    register(PIECE_OF_SWEET_BERRY_PIE, "piece_of_sweet_berry_pie");
    register(PUMPKIN_PIE_RECIPE, "pumpkin_pie_recipe");
    register(SWEET_BERRY_PIE_RECIPE, "sweet_berry_pie_recipe");
  }

  private static void register(Item item, String path) {
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, path), item);
  }
}
