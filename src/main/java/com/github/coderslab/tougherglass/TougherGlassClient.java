package com.github.coderslab.tougherglass;

import com.github.coderslab.tougherglass.registry.TougherGlassBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TougherGlassClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_WHITE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_ORANGE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_MAGENTA_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_LIGHT_BLUE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_YELLOW_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_LIME_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_PINK_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_GRAY_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_LIGHT_GRAY_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_CYAN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_PURPLE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_BLUE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_BROWN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_GREEN_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_RED_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_BLACK_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());


    }


}