package net.droidplays08.create_droid_diamond.item;

import net.droidplays08.create_droid_diamond.CreateDroidDiamond;
import net.droidplays08.create_droid_diamond.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateDroidDiamond.MODID);

    public static final Supplier<CreativeModeTab> CREATE_DROID_DIAMOND = CREATIVE_MODE_TAB.register("create_droid_diamond_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DIAMOND_CHUNK.get()))
                    .title(Component.translatable("creativetab.create_droid_diamond_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HEATED_LAVA_COAL_BLOCK.get());
                        output.accept(ModBlocks.UNPROCESSED_LAVA_COAL_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_LAVA_COAL_BLOCK.get());
                        output.accept(ModBlocks.HEATED_SCORIAL_COAL_BLOCK.get());
                        output.accept(ModBlocks.SCORIAL_COAL_BLOCK.get());
                        output.accept(ModItems.SCORIAL_COAL.get());
                        output.accept(ModItems.HAUNTED_SCORIAL_COAL.get());
                        output.accept(ModItems.IMPURE_DIAMOND_CHUNK.get());
                        output.accept(ModItems.DIAMOND_CHUNK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
