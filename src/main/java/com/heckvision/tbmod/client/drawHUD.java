package com.heckvision.tbmod.client;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.awt.*;

public class drawHUD extends Screen {
    protected drawHUD(Text title) {
        super(title);

    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        //nav
        context.fill(context.getScaledWindowWidth() / 2 - width / 2, context.getScaledWindowHeight() / 2 - height / 2, width, height, 0xff000000);
        context.drawCenteredTextWithShadow(textRenderer,"2B Mod", context.getScaledWindowWidth() / 2 - width / 2 +   textRenderer.getWidth("2B Mod")/2 , context.getScaledWindowHeight() / 2 - height / 2 + context.getScaledWindowHeight()/25  - textRenderer.fontHeight ,0xffffff);
        context.drawCenteredTextWithShadow(textRenderer,"Made by Christian2B", context.getScaledWindowWidth() / 2 - width / 2 +   textRenderer.getWidth("Made by Christian2B")/2 , context.getScaledWindowHeight() / 2 - height / 2 + context.getScaledWindowHeight()/25,0xffffff);

        //buttons
        int start_text_width = textRenderer.getWidth("Made by Christian2B");
        int boxwidth = (context.getScaledWindowWidth() - start_text_width - context.getScaledWindowWidth()/20) / 7;
        for (int i = 0; i < 7; i++) {
            context.fill( start_text_width + i*boxwidth + context.getScaledWindowWidth()/50, context.getScaledWindowHeight() / 2 - height / 2,start_text_width + (i+1)* boxwidth, context.getScaledWindowHeight() / 2 - height / 2 + context.getScaledWindowHeight()/10, Color.DARK_GRAY.getRGB());
            // startpoint : textwidth(Made by Christian2B) + i*(width)
            // width : screen width - textwidth(Made by Christian2B) /7
        }
        context.drawHorizontalLine(context.getScaledWindowWidth() / 2 - width / 2, width,  context.getScaledWindowHeight() / 2 - height / 2 + context.getScaledWindowHeight()/10, 0xffffffff );
    }
}
