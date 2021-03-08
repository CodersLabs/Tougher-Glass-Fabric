package com.github.justinplayzz.tougherglass;

import com.github.justinplayzz.tougherglass.registry.TougherGlassBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TougherGlassClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_WHITE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TougherGlassBlocks.STRONGER_ORANGE_STAINED_GLASS_BLOCK, RenderLayer.getTranslucent());

    }

}
