package com.gabbrov.gabbrovmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.gabbrov.gabbrovmod.GabbrovMod.MODID;
import static com.gabbrov.gabbrovmod.items.ItemRegistry.*;

public class ModCreativeTabs {

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the gabbrovmod namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> GABBROV_TAB = CREATIVE_MODE_TABS.register("gabbrov_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.gabbrovmod.gabbrov_tab"))
            .icon(() -> DIAMANTITE_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(DIAMANTITE_BLOCK_ITEM.get());
                output.accept(DIAMANTITE_ORE_BLOCK_ITEM.get());
                output.accept(DIAMANTITE_ORE_ITEM.get());

            }).build());
}
