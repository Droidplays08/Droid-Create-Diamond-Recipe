package net.droidplays08.droid_create_diamond_recipe.item;

import net.droidplays08.droid_create_diamond_recipe.Droid_Create_Diamond_Recipe;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Droid_Create_Diamond_Recipe.MOD_ID);

    public static final RegistryObject<Item> SCORIAL_COAL = Items.register("scorial_coal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAUNTED_SCORIAL_COAL = Items.register("haunted_scorial_coal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_DIAMOND_CHUNK = Items.register("impure_diamond_chunk",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CHUNK = Items.register("diamond_chunk",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
