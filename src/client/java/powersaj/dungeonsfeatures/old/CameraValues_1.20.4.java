package powersaj.dungeonsfeatures.old;

// LEGACY CODE FROM 1.20.4 TESTING

/*

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class CameraValues {

	public static float targetCameraDistance = 4.0F;

	public static double cameraPositionX = 0;
	public static double cameraPositionY = 0;
	public static double cameraPositionZ = 0;

	public static cameraMode currentCameraMode = cameraMode.VANILLA;

	public static void scrollCameraMode() {
		switch (currentCameraMode) {
			case VANILLA:
				currentCameraMode = cameraMode.OVERHEAD_THIRD_PERSON;
				break;
			case OVERHEAD_THIRD_PERSON:
				//currentCameraMode = cameraMode.DUNGEONS_TOP_DOWN;
				currentCameraMode = cameraMode.VANILLA;
				assert MinecraftClient.getInstance().player != null;
				MinecraftClient.getInstance().player.sendMessage(Text.of("Dungeons top down camera mode is currently disabled."));
				break;
			case DUNGEONS_TOP_DOWN:
				currentCameraMode = cameraMode.VANILLA;
				break;
		}
		scrollCameraDistance();
	}

	public static void scrollCameraDistance() {
		String message = switch (currentCameraMode) {
			case VANILLA -> {
				targetCameraDistance = vanillaValues.thirdPersonDistance;
				yield "Vanilla camera distance: " + vanillaValues.thirdPersonDistance;
			}
			case OVERHEAD_THIRD_PERSON -> {
				targetCameraDistance = overheadThirdPersonValues.thirdPersonDistance;
				yield "Overhead third person camera distance: " + overheadThirdPersonValues.thirdPersonDistance;
			}
			case DUNGEONS_TOP_DOWN -> {
				targetCameraDistance = dungeonsTopDownValues.thirdPersonDistance;
				yield "Dungeons top down camera distance: " + dungeonsTopDownValues.thirdPersonDistance;
			}
		};
		assert MinecraftClient.getInstance().player != null;
		//MinecraftClient.getInstance().player.sendMessage(Text.of(message));
		MinecraftClient.getInstance().player.sendMessage(Text.of("Current Mode: " + currentCameraMode));
	}

	public enum cameraMode {
		VANILLA, OVERHEAD_THIRD_PERSON, DUNGEONS_TOP_DOWN
	}

	public static class cameraModeValues {
		public double x;
		public double y;
		public double z;
		public float pitch;
		public float yaw;
		public float movementSmoothness;
		public float thirdPersonDistance;

		public cameraModeValues(double x, double y, double z, float pitch, float yaw, float movementSmoothness, float thirdPersonDistance) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.pitch = pitch;
			this.yaw = yaw;
			this.movementSmoothness = movementSmoothness;
			this.thirdPersonDistance = thirdPersonDistance;
		}
	}

	public static CameraValues.cameraModeValues overheadThirdPersonValues = new CameraValues.cameraModeValues(0,1.5,0,0,0,0,5.0F);

	public static CameraValues.cameraModeValues dungeonsTopDownValues = new CameraValues.cameraModeValues(0,0,0,0,0,0,14.0F);

	public static CameraValues.cameraModeValues vanillaValues = new CameraValues.cameraModeValues(0,0,0,0,0,0,4.0F);
}
 */
