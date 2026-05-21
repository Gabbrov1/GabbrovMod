package com.gabbrov.gabbrovmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.server.command.ModIdArgument;

import static com.gabbrov.gabbrovmod.GabbrovMod.MODID;

public class BlockRegistry {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);


    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Block> DIAMANTITE_BLOCK = BLOCKS.register(
            "diamantite_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE))
    );

    public static final RegistryObject<Block> DIAMANTITE_ORE_BLOCK = BLOCKS.register(
            "diamantite_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE))
    );


}
