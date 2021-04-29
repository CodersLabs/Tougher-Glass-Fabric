package com.github.coderslab.tougherglass;

import com.github.coderslab.tougherglass.init.TougherGlassBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class TougherGlass implements ModInitializer {
    public static final String MOD_ID = "tougherglass";

    @Override
    public void onInitialize() {
        TougherGlassBlocks.init();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
