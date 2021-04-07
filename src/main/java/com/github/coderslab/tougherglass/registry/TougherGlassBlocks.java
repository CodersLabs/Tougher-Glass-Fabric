package com.github.coderslab.tougherglass.registry;

import com.github.evoslab.cookiecore.datagen.MainGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;

import static com.github.coderslab.tougherglass.TougherGlass.MOD_ID;

public class TougherGlassBlocks {

    private static final MainGenerator generator = new MainGenerator(MOD_ID);

    public static GlassBlock REINFORCED_GLASS;

    public static StainedGlassBlock REINFORCED_WHITE_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_ORANGE_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_MAGENTA_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_LIGHT_BLUE_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_YELLOW_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_LIME_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_PINK_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_GRAY_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_LIGHT_GRAY_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_CYAN_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_PURPLE_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_BLUE_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_BROWN_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_GREEN_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_RED_STAINED_GLASS;
    public static StainedGlassBlock REINFORCED_BLACK_STAINED_GLASS;

    public static void init(){

        REINFORCED_GLASS = generator.block.registerAllSidedBlock(new GlassBlock(Properties.REINFORCED_GLASS), "reinforced_glass","Reinforced Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_WHITE_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.WHITE, Properties.REINFORCED_GLASS), "reinforced_white_stained_glass", "Reinforced White Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_ORANGE_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.ORANGE, Properties.REINFORCED_GLASS), "reinforced_orange_stained_glass", "Reinforced Orange Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_MAGENTA_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.MAGENTA, Properties.REINFORCED_GLASS), "reinforced_magenta_stained_glass", "Reinforced Magenta Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_LIGHT_BLUE_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.LIGHT_BLUE, Properties.REINFORCED_GLASS), "reinforced_light_blue_stained_glass", "Reinforced Light blue Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_YELLOW_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.YELLOW, Properties.REINFORCED_GLASS), "reinforced_yellow_stained_glass", "Reinforced Yellow Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_LIME_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.LIME, Properties.REINFORCED_GLASS), "reinforced_lime_stained_glass", "Reinforced Lime Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_PINK_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.PINK, Properties.REINFORCED_GLASS), "reinforced_pink_stained_glass", "Reinforced Pink Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_GRAY_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.GRAY, Properties.REINFORCED_GLASS), "reinforced_gray_stained_glass", "Reinforced Gray Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_LIGHT_GRAY_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.LIGHT_GRAY, Properties.REINFORCED_GLASS), "reinforced_light_gray_stained_glass", "Reinforced Light gray Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_CYAN_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.CYAN, Properties.REINFORCED_GLASS), "reinforced_cyan_stained_glass", "Reinforced Cyan Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_PURPLE_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.PURPLE, Properties.REINFORCED_GLASS), "reinforced_purple_stained_glass", "Reinforced Purple Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_BLUE_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.BLUE, Properties.REINFORCED_GLASS), "reinforced_blue_stained_glass", "Reinforced Blue Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_BROWN_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.BROWN, Properties.REINFORCED_GLASS), "reinforced_brown_stained_glass", "Reinforced Brown Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_GREEN_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.GREEN, Properties.REINFORCED_GLASS), "reinforced_green_stained_glass", "Reinforced Green Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_RED_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.RED, Properties.REINFORCED_GLASS), "reinforced_red_stained_glass", "Reinforced Red Stained Glass Block", ItemGroup.BUILDING_BLOCKS);
        REINFORCED_BLACK_STAINED_GLASS = generator.block.registerAllSidedBlock(new StainedGlassBlock(DyeColor.BLACK, Properties.REINFORCED_GLASS), "reinforced_black_stained_glass", "Reinforced Black Stained Glass Block", ItemGroup.BUILDING_BLOCKS);

    }

    public static class Properties {
        public static FabricBlockSettings REINFORCED_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).strength(1F, 1200.0F).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).nonOpaque();
    }

}
