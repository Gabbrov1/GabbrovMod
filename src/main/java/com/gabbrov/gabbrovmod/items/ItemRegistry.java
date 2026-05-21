package com.gabbrov.gabbrovmod.items;

import com.mojang.blaze3d.audio.OggAudioStream;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.gabbrov.gabbrovmod.GabbrovMod.MODID;
import static com.gabbrov.gabbrovmod.blocks.BlockRegistry.DIAMANTITE_BLOCK;
import static com.gabbrov.gabbrovmod.blocks.BlockRegistry.DIAMANTITE_ORE_BLOCK;

public class ItemRegistry {

    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    //Registries
    public static final RegistryObject<Item> DIAMANTITE_BLOCK_ITEM = ITEMS.register("diamantite_block_item", () -> new BlockItem(DIAMANTITE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMANTITE_ORE_BLOCK_ITEM = ITEMS.register("diamantite_ore_item", () -> new BlockItem(DIAMANTITE_ORE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMANTITE_ORE_ITEM = ITEMS.register("diamantite_gem_item", () -> new Item(new Item.Properties()));
}
