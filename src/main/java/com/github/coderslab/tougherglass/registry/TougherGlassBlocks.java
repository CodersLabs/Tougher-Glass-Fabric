package com.github.coderslab.tougherglass.registry;

import com.github.evoslab.cookiecore.datagen.MainGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;

import static com.github.coderslab.tougherglass.TougherGlass.MOD_ID;

public class TougherGlassBlocks {

    private static final MainGenerator generator = new MainGenerator(MOD_ID);

    public static GlassBlock STRONGER_GLASS_BLOCK;

    public static GlassBlock STRONGER_WHITE_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_ORANGE_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_MAGENTA_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_YELLOW_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_LIME_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_PINK_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_GRAY_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_LIGHT_GRAY_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_CYAN_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_PURPLE_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_BLUE_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_BROWN_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_GREEN_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_RED_STAINED_GLASS_BLOCK;
    public static GlassBlock STRONGER_BLACK_STAINED_GLASS_BLOCK;

    public static void RegistryTougherGlassBlocks(){

        STRONGER_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(Properties.STRONGER_GLASS), "stronger_glass_block","Stronger Glass Block");
        STRONGER_WHITE_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_white_stained_glass_block", "Stronger White Stained Glass Block");
        STRONGER_ORANGE_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_orange_stained_glass_block", "Stronger Orange Stained Glass Block");
        STRONGER_MAGENTA_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_magenta_stained_glass_block", "Stronger Magenta Stained Glass Block");
        STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_light_blue_stained_glass_block", "Stronger Light blue Stained Glass Block");
        STRONGER_YELLOW_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_yellow_stained_glass_block", "Stronger Yellow Stained Glass Block");
        STRONGER_LIME_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_lime_stained_glass_block", "Stronger Lime Stained Glass Block");
        STRONGER_PINK_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_pink_stained_glass_block", "Stronger Pink Stained Glass Block");
        STRONGER_GRAY_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_gray_stained_glass_block", "Stronger Gray Stained Glass Block");
        STRONGER_LIGHT_GRAY_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_light_gray_stained_glass_block", "Stronger Light gray Stained Glass Block");
        STRONGER_CYAN_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_cyan_stained_glass_block", "Stronger Cyan Stained Glass Block");
        STRONGER_PURPLE_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_purple_stained_glass_block", "Stronger Purple Stained Glass Block");
        STRONGER_BLUE_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_blue_stained_glass_block", "Stronger Blue Stained Glass Block");
        STRONGER_BROWN_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_brown_stained_glass_block", "Stronger Brown Stained Glass Block");
        STRONGER_GREEN_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_green_stained_glass_block", "Stronger Green Stained Glass Block");
        STRONGER_RED_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_red_stained_glass_block", "Stronger Red Stained Glass Block");
        STRONGER_BLACK_STAINED_GLASS_BLOCK = generator.block.registerAllSidedBlock(new GlassBlock(TougherGlassBlocks.Properties.STRONGER_GLASS), "stronger_black_stained_glass_block", "Stronger Black Stained Glass Block");

    }

    public static class Properties {
        public static FabricBlockSettings STRONGER_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque();
    }

}
