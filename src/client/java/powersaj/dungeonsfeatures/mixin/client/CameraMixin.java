package powersaj.dungeonsfeatures.mixin.client;

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

@Mixin(Camera.class)
public class CameraMixin {

    @ModifyArg(method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;moveBy(FFF)V"
            ),
            index = 0
    )
    private float thirdPersonZoom(float f) {
        // Default minecraft is (4F * modifier)
        return f + DungeonsFeaturesValues.clientThirdPersonCameraZoom;
    }

    @ModifyArg(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
            ),
            index = 0
    )
    private double thirdPersonOffsetX(double x) {
        //TODO: add lerping or something to smooth out the camera movement
        return x + DungeonsFeaturesValues.clientCameraDirectionOffsetX;
    }

    @ModifyArg(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
            ),
            index = 1
    )
    private double thirdPersonOffsetY(double y) {
        //TODO: add lerping or something to smooth out the camera movement
        return y + DungeonsFeaturesValues.clientCameraDirectionOffsetY;
    }

    @ModifyArg(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
            ),
            index = 2
    )
    private double thirdPersonOffsetZ(double z) {
        //TODO: add lerping or something to smooth out the camera movement
        return z + DungeonsFeaturesValues.clientCameraDirectionOffsetZ;
    }

}