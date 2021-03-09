package com.github.justinplayzz.tougherglass.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.justinplayzz.tougherglass.TougherGlass.MOD_ID;

public class TougherGlassBlocks {

    public static final GlassBlock STRONGER_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final GlassBlock STRONGER_WHITE_STAINED_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_WHITE_STAINED_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_WHITE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final GlassBlock STRONGER_ORANGE_STAINED_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_ORANGE_STAINED_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_ORANGE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final GlassBlock STRONGER_MAGENTA_STAINED_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_MAGENTA_STAINED_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_MAGENTA_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final GlassBlock STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final GlassBlock STRONGER_YELLOW_STAINED_GLASS_BLOCK = new GlassBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque());
    public static final BlockItem STRONGER_YELLOW_STAINED_GLASS_BLOCK_ITEM = new BlockItem(STRONGER_YELLOW_STAINED_GLASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));




    public static void RegistryTougherGlassBlocks(){

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stronger_glass_block"), STRONGER_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_glass_block"), STRONGER_GLASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stronger_white_stained_glass_block"), STRONGER_WHITE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_white_stained_glass_block"), STRONGER_WHITE_STAINED_GLASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stronger_orange_stained_glass_block"), STRONGER_ORANGE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_orange_stained_glass_block"), STRONGER_ORANGE_STAINED_GLASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stronger_magenta_stained_glass_block"), STRONGER_MAGENTA_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_magenta_stained_glass_block"), STRONGER_MAGENTA_STAINED_GLASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stronger_light_blue_stained_glass_block"), STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_light_blue_stained_glass_block"), STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stronger_yellow_stained_glass_block"), STRONGER_YELLOW_STAINED_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stronger_yellow_stained_glass_block"), STRONGER_YELLOW_STAINED_GLASS_BLOCK_ITEM);
    }

}
