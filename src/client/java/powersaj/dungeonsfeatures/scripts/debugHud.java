package powersaj.dungeonsfeatures.scripts;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.text.Text;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

import java.text.DecimalFormat;
import java.util.Objects;

public class debugHud {
    public static void debugHudRender(DrawContext context, RenderTickCounter tickDeltaManager) {
        MinecraftClient client = MinecraftClient.getInstance();
        int HorizontalOffset = 225;

        String title = "Powersaj's Dungeons Features Debug";
        String entityStepHeight = "entityStepHeight: " + Objects.requireNonNull(client.getCameraEntity()).getStepHeight();
        String playerSpeed = "playerSpeed: " + DungeonsFeaturesValues.playerSpeed;
        String cameraTargetIsDetatched = "cameraTarget.isDetatched: " + DungeonsFeaturesValues.cameraTarget.isDetatched;

        String cameraDebugTitle = "Camera Debug";
        String cameraTargetPitch = "cameraTarget.pitch: " + new DecimalFormat("#.##").format(DungeonsFeaturesValues.cameraTarget.pitch);
        String cameraTargetYaw = "cameraTarget.yaw: " + new DecimalFormat("#.##").format(DungeonsFeaturesValues.cameraTarget.yaw) + " D: " + new DecimalFormat("#.##").format(cameraUtils.toDegrees(DungeonsFeaturesValues.cameraTarget.yaw));
        String cameraPitch = "camera.pitch: " + new DecimalFormat("#.##").format(DungeonsFeaturesValues.camera.pitch);
        String cameraYaw = "camera.yaw: " + new DecimalFormat("#.##").format(DungeonsFeaturesValues.camera.yaw) + " D: " + new DecimalFormat("#.##").format(cameraUtils.toDegrees(DungeonsFeaturesValues.camera.yaw));

        context.drawText(client.textRenderer, Text.of(title), HorizontalOffset, 10, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(entityStepHeight), HorizontalOffset, 20, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(playerSpeed), HorizontalOffset, 30, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(cameraTargetIsDetatched), HorizontalOffset, 40, 0xFFFFFFFF, true);

        context.drawText(client.textRenderer, Text.of(cameraDebugTitle), HorizontalOffset, 60, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(cameraTargetPitch), HorizontalOffset, 70, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(cameraTargetYaw), HorizontalOffset, 80, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(cameraPitch), HorizontalOffset, 90, 0xFFFFFFFF, true);
        context.drawText(client.textRenderer, Text.of(cameraYaw), HorizontalOffset, 100, 0xFFFFFFFF, true);
    }
}