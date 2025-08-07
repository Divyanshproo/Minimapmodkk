package com.example.minimapmod;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MinimapRenderer implements HudRenderCallback {

    private static final Identifier MINIMAP_TEXTURE = new Identifier("minimapmod", "textures/minimap_overlay.png");

    @Override
    public void onHudRender(MatrixStack matrices, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.options.hudHidden || client.player == null) return;

        int x = 10;
        int y = 10;

        client.getTextureManager().bindTexture(MINIMAP_TEXTURE);
        DrawableHelper.drawTexture(matrices, x, y, 0, 0, 64, 64, 64, 64);
    }

    public static void init() {
        HudRenderCallback.EVENT.register(new MinimapRenderer());
    }
}