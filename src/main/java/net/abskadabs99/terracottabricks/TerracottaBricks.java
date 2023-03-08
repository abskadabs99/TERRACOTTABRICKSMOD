package net.abskadabs99.terracottabricks;

import com.mojang.logging.LogUtils;
import net.abskadabs99.terracottabricks.block.ModBlocks;
import net.abskadabs99.terracottabricks.item.ModCreativeModeTabs;
import net.abskadabs99.terracottabricks.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TerracottaBricks.MOD_ID)
public class TerracottaBricks
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "terracottabricks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public TerracottaBricks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
    if(event.getTab() == ModCreativeModeTabs.TERRACOTTA_BRICKS_TAB) {
       // event.accept(ModItems.EXAMPLETHING);
        event.accept(ModBlocks.BLACK_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.BROWN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.CYAN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.GRAY_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.GREEN_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.LIME_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.PINK_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.RED_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.WHITE_TERRACOTTA_BRICKS);
        event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
    }
        if(event.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ModBlocks.BLACK_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.BROWN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.CYAN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.GRAY_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.GREEN_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.LIME_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.PINK_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.RED_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.WHITE_TERRACOTTA_BRICKS);
            event.accept(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
    }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
