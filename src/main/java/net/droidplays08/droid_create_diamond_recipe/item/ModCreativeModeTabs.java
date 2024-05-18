package net.droidplays08.droid_create_diamond_recipe.item;

import net.droidplays08.droid_create_diamond_recipe.Droid_Create_Diamond_Recipe;
import net.droidplays08.droid_create_diamond_recipe.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> Creative_Mode_Tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Droid_Create_Diamond_Recipe.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = Creative_Mode_Tabs.register("droid_create_diamond_recipe_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SCORIAL_COAL.get()))
                    .title(Component.translatable("creativetab.droid_create_diamond_recipe_tab"))
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
        Creative_Mode_Tabs.register(eventBus);
    }
}
