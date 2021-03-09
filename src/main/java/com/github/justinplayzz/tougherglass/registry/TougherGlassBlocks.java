package com.github.justinplayzz.tougherglass.registry;

import com.github.justinplayzz.tougherglass.json.MainGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.justinplayzz.tougherglass.TougherGlass.MOD_ID;

public class TougherGlassBlocks {

    private static final MainGenerator generator = new MainGenerator(MOD_ID);

    public static GlassBlock STRONGER_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_glass_block","");
    public static GlassBlock STRONGER_WHITE_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_white_glass_block", "");
    public static GlassBlock STRONGER_ORANGE_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_orange_glass_block", "");
    public static GlassBlock STRONGER_MAGENTA_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_magenta_glass_block", "");
    public static GlassBlock STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_light_blue_glass_block", "");
    public static GlassBlock STRONGER_YELLOW_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_yellow_glass_block", "");
    public static GlassBlock STRONGER_LIME_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_lime_glass_block", "");
    public static GlassBlock STRONGER_PINK_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_pink_glass_block", "");
    public static GlassBlock STRONGER_GRAY_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_gray_glass_block", "");
    public static GlassBlock STRONGER_LIGHT_GRAY_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_light_gray_glass_block", "");
    public static GlassBlock STRONGER_CYAN_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_cyan_glass_block", "");
    public static GlassBlock STRONGER_PURPLE_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_purple_glass_block", "");
    public static GlassBlock STRONGER_BLUE_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_blue_glass_block", "");
    public static GlassBlock STRONGER_BROWN_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_brown_glass_block", "");
    public static GlassBlock STRONGER_GREEN_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_green_glass_block", "");
    public static GlassBlock STRONGER_RED_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_red_glass_block", "");
    public static GlassBlock STRONGER_BLACK_STAINED_GLASS_BLOCK = generator.block.registerBlandBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_black_glass_block", "");

    public static void RegistryTougherGlassBlocks(){}

    public static class Properties {
        public static FabricBlockSettings STRONGER_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque();
    }

}
