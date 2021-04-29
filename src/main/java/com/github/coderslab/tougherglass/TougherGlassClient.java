package com.github.coderslab.tougherglass;

import com.github.coderslab.tougherglass.init.TougherGlassBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TougherGlassClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_WHITE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_ORANGE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_MAGENTA_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_LIGHT_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_LIME_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_LIGHT_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_PURPLE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_BROWN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_RED_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.REINFORCED_BLACK_STAINED_GLASS, RenderLayer.getTranslucent());
    }
}