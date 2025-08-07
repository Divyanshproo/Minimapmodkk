package com.example.minimapmod;

import net.fabricmc.api.ModInitializer;

public class MinimapMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Server-side init (logic only)
        System.out.println("MinimapMod server initialized.");
    }
}