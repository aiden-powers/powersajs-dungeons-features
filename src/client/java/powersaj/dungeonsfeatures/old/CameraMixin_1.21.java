package powersaj.dungeonsfeatures.old;

// LEGACY CODE FROM 1.21 TESTING

/*

import dungeons.codebase.DungeonsValues;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Camera.class)
public class CameraMixin {

	@ModifyArg(method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;moveBy(FFF)V"
			),
			index = 0
	)
	private float modifyMoveByF(float f) {
		// Modify the value of f as needed
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			return f * 1.25F;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			return f * 2.00F;
		}
		return f; // Example modification
	}

	@ModifyArg(
			method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
			),
			index = 0
	)
	private double modifyX(double x) {
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			DungeonsValues.easeCameraX(x, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraX + DungeonsValues.cameraX) / 2;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			DungeonsValues.easeCameraX(x, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraX + DungeonsValues.cameraX) / 2;
		}
		DungeonsValues.cameraX = x;
		return x;
	}

	@ModifyArg(
			method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
			),
			index = 1
	)
	private double modifyY(double y) {
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			DungeonsValues.easeCameraY(y, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return ((DungeonsValues.cameraY + DungeonsValues.cameraY) / 2) + 1.25;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			DungeonsValues.easeCameraY(y, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraY + DungeonsValues.cameraY) / 2;
		}
		DungeonsValues.cameraY = y;
		return y;
	}

	@ModifyArg(
			method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
			),
			index = 2
	)

	private double modifyZ(double z) {
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			DungeonsValues.easeCameraZ(z, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraZ + DungeonsValues.cameraZ) / 2;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			DungeonsValues.easeCameraZ(z, 0.05); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraZ + DungeonsValues.cameraZ) / 2;
		}
		DungeonsValues.cameraZ = z;
		return z;
	}

	@ModifyArg(
			method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
			),
			index = 0
	)
	private float modifyYaw(float yaw) {
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			DungeonsValues.easeCameraYaw(yaw, 0.05f); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return (DungeonsValues.cameraYaw + DungeonsValues.cameraYaw) / 2;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			return DungeonsValues.DUNGEONS_TOP_DOWN_Yaw;
		}
		return yaw;
	}

	@ModifyArg(
			method = "update",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
			),
			index = 1
	)
	private float modifyPitch(float pitch) {
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.OVERHEAD_THIRD_PERSON) {
			DungeonsValues.easeCameraPitch(pitch, 0.05f); // Adjust easing factor as needed, higher values will make the camera follow the player more closely
			return ((DungeonsValues.cameraPitch + DungeonsValues.cameraPitch) / 2) + DungeonsValues.OVERHEAD_THIRD_PERSON_Pitch;
		}
		if (DungeonsValues.dungeonCameraType == DungeonsValues.dungeonCameraTypeset.DUNGEONS_TOP_DOWN) {
			return DungeonsValues.DUNGEONS_TOP_DOWN_Pitch;
		}
		return pitch;
	}
}

 */