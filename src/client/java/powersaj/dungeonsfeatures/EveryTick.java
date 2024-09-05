package powersaj.dungeonsfeatures;

import net.minecraft.client.MinecraftClient;

public class EveryTick {
    public static void everyTick(MinecraftClient minecraftClient) {

        // Debug, spin the camera offsets around
        DungeonsFeaturesValues.clientCameraDirectionOffsetX = (float) Math.sin(System.currentTimeMillis() / 1000.0);
        DungeonsFeaturesValues.clientCameraDirectionOffsetY = (float) Math.cos(System.currentTimeMillis() / 750.0);
        DungeonsFeaturesValues.clientCameraDirectionOffsetZ = (float) Math.cos(System.currentTimeMillis() / 1000.0);
    }
}
