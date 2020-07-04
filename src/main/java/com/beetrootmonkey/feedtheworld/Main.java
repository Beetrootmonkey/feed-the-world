package com.beetrootmonkey.feedtheworld;

import com.beetrootmonkey.feedtheworld.block.ModBlocks;
import com.beetrootmonkey.feedtheworld.event.EventHandling;
import com.beetrootmonkey.feedtheworld.item.ModItems;
import com.beetrootmonkey.feedtheworld.recipe.ModRecipes;
import net.fabricmc.api.ModInitializer;

import java.util.Random;

public class Main implements ModInitializer {

  public static final String MOD_ID = "feedtheworld";
  public static final Random RANDOM = new Random();

  @Override
  public void onInitialize() {
    ModRecipes.doRegistration();
    ModItems.doRegistration();
    ModBlocks.doRegistration();
    EventHandling.doRegistration();
  }
}
