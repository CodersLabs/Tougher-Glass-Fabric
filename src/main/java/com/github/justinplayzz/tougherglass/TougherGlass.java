package com.github.justinplayzz.tougherglass;

import com.github.justinplayzz.tougherglass.registry.TougherGlassBlocks;
import net.fabricmc.api.ModInitializer;

public class TougherGlass implements ModInitializer {

    public static final String MOD_ID = "tougherglass";

    @Override
    public void onInitialize() {

        new TougherGlassBlocks();
        TougherGlassBlocks.RegistryTougherGlassBlocks();

    }

}
