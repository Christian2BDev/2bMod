package com.heckvision.tbmod.client;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;

public class drawHUD extends Screen {
    protected drawHUD(Text title) {
        super(title);

    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        int x = context.getScaledWindowWidth();
        int centerx = context.getScaledWindowWidth()/2;
        int y = context.getScaledWindowHeight();
        int centery = context.getScaledWindowHeight()/2;
//        //background
//        context.fill((int) (centerx - (x*0.3)),(int) (centery - (y*0.4)) ,(int) (centerx + (x*0.3)), (int) (centery + (y*0.4)),0xff000000);
//
//        //content
//        context.drawHorizontalLine((int) (centerx - (x*0.3)), (int) (centerx + (x*0.3)), (int) (centery - (y *0.35)), 0xffffffff);
//
//        context.fill((int) (centerx - (x*0.3)),(int) (centery - (x*0.2)) ,(int) (centerx + (x*0.3)), (int) (centery + (x*0.2)),0xff000000);

//        context.fill(centerx-200,centery-100,centerx+200, centery+100, 0xff000000);
        context.fill(context.getScaledWindowWidth() / 2 - width / 2, context.getScaledWindowHeight() / 2 - height / 2, width, height, 0xff000000);
        context.drawCenteredTextWithShadow(textRenderer,"2B Mod", context.getScaledWindowWidth() / 2 - width / 2 +   textRenderer.getWidth("2B Mod")/2 , context.getScaledWindowHeight() / 2 - height / 2 ,0xffffff);

//        context.getMatrices().push();

//        context.getMatrices().scale((float) context.getScaledWindowWidth() /960, (float) context.getScaledWindowHeight() /600, 1);
//        int x = context.getScaledWindowWidth();
//        int centerx = context.getScaledWindowWidth()/2;
//        int y = context.getScaledWindowHeight();
//        int centery = context.getScaledWindowHeight()/2;
//        context.drawCenteredTextWithShadow(textRenderer,"2B Mod", centerx , (int) (centery - (y *0.45)),0xffffff);
//        context.fill(centerx-200,centery-100,centerx+200, centery+100, 0xff000000);
//        context.getMatrices().pop();
//        super.render(context, mouseX, mouseY, delta);

    }
}
