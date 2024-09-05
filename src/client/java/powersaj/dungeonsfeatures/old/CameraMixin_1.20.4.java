package powersaj.dungeonsfeatures.old;

// LEGACY CODE FROM 1.20.4 TESTING

/*

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;
import powersaj.dungeons_camera.CameraValues;

import static powersaj.dungeons_camera.CameraValues.overheadThirdPersonValues;
import static powersaj.dungeons_camera.CameraValues.targetCameraDistance;

@Mixin(Camera.class)
public class CameraMixin {

	@Unique
	private double currentDistance = 4.0;
	@Unique
	private static final double ZOOM_EASE_SPEED = 0.075;
	@Unique
	private static final double MOVEMENT_EASE_SPEED = 0.075;

	@ModifyConstant(
			method = "update",
			constant = @Constant(doubleValue = 4.0),
			require = 1
	)
	private double modifyClipToSpaceDistance(double original) {
		currentDistance = lerp(currentDistance, targetCameraDistance, ZOOM_EASE_SPEED);
		return currentDistance;
	}

	@ModifyArg(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"), index = 0)
	private double modifyX(double x) {
		if (CameraValues.currentCameraMode == CameraValues.cameraMode.OVERHEAD_THIRD_PERSON) {
			CameraValues.cameraPositionX = lerp(CameraValues.cameraPositionX, x, MOVEMENT_EASE_SPEED);
			return CameraValues.cameraPositionX;
		}
		return x;
	}

	@ModifyArg(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"), index = 1)
	private double modifyY(double y) {
		if (CameraValues.currentCameraMode == CameraValues.cameraMode.OVERHEAD_THIRD_PERSON) {
			CameraValues.cameraPositionY = lerp(CameraValues.cameraPositionY, y, MOVEMENT_EASE_SPEED);
			return CameraValues.cameraPositionY + overheadThirdPersonValues.y;
		}
		return y;
	}

	@ModifyArg(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"), index = 2)
	private double modifyZ(double z) {
		if (CameraValues.currentCameraMode == CameraValues.cameraMode.OVERHEAD_THIRD_PERSON) {
			CameraValues.cameraPositionZ = lerp(CameraValues.cameraPositionZ, z, MOVEMENT_EASE_SPEED);
			return CameraValues.cameraPositionZ;
		}
		return z;
	}


	@Unique
	private double lerp(double start, double end, double t) {
		return start + (end - start) * t;
	}
}

 */