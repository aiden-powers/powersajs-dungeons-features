package powersaj.dungeonsfeatures.mixin.client;

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;
import powersaj.dungeonsfeatures.scripts.cameraUtils;

@Mixin(Camera.class)
public class CameraMixin {

    @Unique
    private static final double MOVEMENT_EASE_SPEED = 0.05;

    private double lerp(double start, double end, double t) {
        return start + (end - start) * t;
    }

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
        DungeonsFeaturesValues.unmodifiedCamera.x = (float) x;

        if (DungeonsFeaturesValues.camera.x == null) {
            DungeonsFeaturesValues.camera.x = (float) x;
        }
        if (DungeonsFeaturesValues.cameraTarget.isDetatched) {
            x = DungeonsFeaturesValues.cameraTarget.x;
        }
        DungeonsFeaturesValues.camera.x = (float) lerp(DungeonsFeaturesValues.camera.x, x, MOVEMENT_EASE_SPEED);
        return DungeonsFeaturesValues.camera.x;
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
        DungeonsFeaturesValues.unmodifiedCamera.y = (float) y;

        if (DungeonsFeaturesValues.camera.y == null) {
            DungeonsFeaturesValues.camera.y = (float) y;
        }
        if (DungeonsFeaturesValues.cameraTarget.isDetatched) {
            y = DungeonsFeaturesValues.cameraTarget.y;
        }
        DungeonsFeaturesValues.camera.y = (float) lerp(DungeonsFeaturesValues.camera.y, y, MOVEMENT_EASE_SPEED);
        return DungeonsFeaturesValues.camera.y;
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
        DungeonsFeaturesValues.unmodifiedCamera.z = (float) z;

        if (DungeonsFeaturesValues.camera.z == null) {
            DungeonsFeaturesValues.camera.z = (float) z;
        }
        if (DungeonsFeaturesValues.cameraTarget.isDetatched) {
            z = DungeonsFeaturesValues.cameraTarget.z;
        }
        DungeonsFeaturesValues.camera.z = (float) lerp(DungeonsFeaturesValues.camera.z, z, MOVEMENT_EASE_SPEED);
        return DungeonsFeaturesValues.camera.z;
    }

    @ModifyArg(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
            ),
            index = 0
    )
    private float thirdPersonRotationYaw(float yaw) {
        DungeonsFeaturesValues.unmodifiedCamera.yaw = yaw;

        if (DungeonsFeaturesValues.camera.yaw == null) {
            DungeonsFeaturesValues.camera.yaw = (float) yaw;
        }
        if (DungeonsFeaturesValues.cameraTarget.isDetatched) {
            int cameraRevolutions = cameraUtils.getFullRevolutions(DungeonsFeaturesValues.camera.yaw);
            DungeonsFeaturesValues.cameraTarget.yaw = cameraUtils.toDegrees(DungeonsFeaturesValues.cameraTarget.yaw);
            DungeonsFeaturesValues.cameraTarget.yaw += cameraRevolutions * 360;

            float targetYaw = DungeonsFeaturesValues.cameraTarget.yaw;
            float currentYaw = DungeonsFeaturesValues.camera.yaw;

            float yawDifference = targetYaw - currentYaw;
            yawDifference = ((yawDifference + 180) % 360 + 360) % 360 - 180; // Normalize to [-180, 180]

            yaw = currentYaw + yawDifference;
        }
        DungeonsFeaturesValues.camera.yaw = (float) lerp(DungeonsFeaturesValues.camera.yaw, yaw, MOVEMENT_EASE_SPEED);
        return DungeonsFeaturesValues.camera.yaw;
    }

    @ModifyArg(
            method = "update",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
            ),
            index = 1
    )
    private float thirdPersonRotationPitch(float pitch) {
        DungeonsFeaturesValues.unmodifiedCamera.pitch = pitch;

        if (DungeonsFeaturesValues.camera.pitch == null) {
            DungeonsFeaturesValues.camera.pitch = (float) pitch;
        }
        if (DungeonsFeaturesValues.cameraTarget.isDetatched) {
            pitch = DungeonsFeaturesValues.cameraTarget.pitch;
        }
        DungeonsFeaturesValues.camera.pitch = (float) lerp(DungeonsFeaturesValues.camera.pitch, pitch, MOVEMENT_EASE_SPEED);
        return DungeonsFeaturesValues.camera.pitch;
    }
}