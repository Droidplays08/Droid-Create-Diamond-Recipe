package net.droidplays08.droid_create_diamond_recipe.block;

import net.droidplays08.droid_create_diamond_recipe.Droid_Create_Diamond_Recipe;
import net.droidplays08.droid_create_diamond_recipe.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Droid_Create_Diamond_Recipe.MOD_ID);

    public static final RegistryObject<Block> HEATED_LAVA_COAL_BLOCK = registerBlock("heated_lava_coal_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.COAL_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(2.5F,6.0F)));
    public static final RegistryObject<Block> UNPROCESSED_LAVA_COAL_BLOCK = registerBlock("unprocessed_lava_coal_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.COAL_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(2.5F,6.0F)));
    public static final RegistryObject<Block> COMPRESSED_LAVA_COAL_BLOCK = registerBlock("compressed_lava_coal_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.COAL_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F,6.5F)));
    public static final RegistryObject<Block> HEATED_SCORIAL_COAL_BLOCK = registerBlock("heated_scorial_coal_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.COAL_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(2.5F,6.0F)));
    public static final RegistryObject<Block> SCORIAL_COAL_BLOCK = registerBlock("scorial_coal_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.COAL_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(2.5F,6.0F)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
