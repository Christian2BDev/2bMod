package com.heckvision.tbmod.client;

import com.heckvision.tbmod.TbMod;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class drawOverlayHUD implements HudRenderCallback {
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {

        TextRenderer tr = MinecraftClient.getInstance().textRenderer;
        if (TbMod.TIMMIE_CROSSHAIR) {
            drawContext.fill(drawContext.getScaledWindowWidth() / 2 - drawContext.getScaledWindowWidth() / 5, drawContext.getScaledWindowHeight() / 2 - drawContext.getScaledWindowHeight() / 5, drawContext.getScaledWindowWidth() / 2 + drawContext.getScaledWindowWidth() / 5, drawContext.getScaledWindowHeight() / 2 + drawContext.getScaledWindowHeight() / 5, 0xffffffff);
            drawContext.drawTextWithShadow(tr, "Timmie is een monkey", drawContext.getScaledWindowWidth() / 2 - tr.getWidth("Timgb11 is een monkey") / 2, drawContext.getScaledWindowHeight() / 2 - tr.fontHeight/2, -1);
        }

        if (TbMod.ENDERNODE_TRACKER){
            int posx = 100;
            int posy = 100;
            int scale = 1;
            drawContext.getMatrices().push();
            drawContext.getMatrices().scale(scale,scale,scale);
            //stuff here
            drawContext.getMatrices().pop();

        }
    }
}
