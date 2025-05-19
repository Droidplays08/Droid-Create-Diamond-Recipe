package net.droidplays08.create_droid_diamond.item;

import net.droidplays08.create_droid_diamond.CreateDroidDiamond;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateDroidDiamond.MODID);

    public static final DeferredItem<Item> SCORIAL_COAL = ITEMS.register("scorial_coal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAUNTED_SCORIAL_COAL = ITEMS.register("haunted_scorial_coal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IMPURE_DIAMOND_CHUNK = ITEMS.register("impure_diamond_chunk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_CHUNK = ITEMS.register("diamond_chunk",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
