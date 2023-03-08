package net.abskadabs99.terracottabricks.item;

import net.abskadabs99.terracottabricks.TerracottaBricks;
import net.abskadabs99.terracottabricks.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

@Mod.EventBusSubscriber(modid = TerracottaBricks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TERRACOTTA_BRICKS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TERRACOTTA_BRICKS_TAB = event.registerCreativeModeTab(new ResourceLocation(TerracottaBricks.MOD_ID, "terraccotta_bricks_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.RED_TERRACOTTA_BRICKS.get()))
                        .title(Component.translatable("creativemodetab.terracotta_bricks_tab")));
    }
}
