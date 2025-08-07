package com.example.minimapmod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static KeyBinding toggleMinimap;

    public static void register() {
        toggleMinimap = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.minimap.toggle",
            GLFW.GLFW_KEY_M,
            "category.minimap"
        ));
    }
}