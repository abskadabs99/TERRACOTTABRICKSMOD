package net.abskadabs99.terracottabricks.block;

import net.abskadabs99.terracottabricks.TerracottaBricks;
import net.abskadabs99.terracottabricks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TerracottaBricks.MOD_ID);
// terracotta bricks
    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks"
    , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks"
            , () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject <Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
