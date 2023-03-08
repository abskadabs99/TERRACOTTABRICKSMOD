package net.abskadabs99.terracottabricks.item;

import net.abskadabs99.terracottabricks.TerracottaBricks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, TerracottaBricks.MOD_ID);


    //register items like this
   // public static final RegistryObject<Item> EXAMPLETHING = ITEMS.register("examplething",
            //() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
