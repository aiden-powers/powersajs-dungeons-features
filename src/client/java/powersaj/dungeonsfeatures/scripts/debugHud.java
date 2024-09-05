package powersaj.dungeonsfeatures.scripts;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.text.Text;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

import java.util.Objects;

public class debugHud {
    public static void debugHudRender(DrawContext context, RenderTickCounter tickDeltaManager) {
        MinecraftClient client = MinecraftClient.getInstance();
        context.drawText(client.textRenderer, Text.of("Powersaj's Dungeons Features Debug"), 10, 10, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of("DungeonsFeaturesValues.entityStepHeight: " + Objects.requireNonNull(client.getCameraEntity()).getStepHeight()), 10, 20, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of("DungeonsFeaturesValues.playerSpeed: " + DungeonsFeaturesValues.playerSpeed), 10, 30, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of("DungeonsFeaturesValues.clientCameraDirectionOffsetX: " + DungeonsFeaturesValues.clientCameraDirectionOffsetX), 10, 40, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of("DungeonsFeaturesValues.clientCameraDirectionOffsetY: " + DungeonsFeaturesValues.clientCameraDirectionOffsetY), 10, 50, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of("DungeonsFeaturesValues.clientCameraDirectionOffsetZ: " + DungeonsFeaturesValues.clientCameraDirectionOffsetZ), 10, 60, 0xFFFFFFFF, true);
    }
}
