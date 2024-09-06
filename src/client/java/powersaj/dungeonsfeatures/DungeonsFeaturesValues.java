package powersaj.dungeonsfeatures;

public class DungeonsFeaturesValues {
    public static Float entityStepHeight = 1.25F;
    public static Float playerSpeed = 1.25F;
    public static Float clientThirdPersonCameraZoom = 0F;

    public static class cameraTarget {
        public static Boolean isDetatched = false;
        public static Float x = 1F;
        public static Float y = 1F;
        public static Float z = 1F;
        public static Float pitch = 1F;
        public static Float yaw = 1F;

        public static void unmodifiedCameraToTarget() {
            x = unmodifiedCamera.x;
            y = unmodifiedCamera.y;
            z = unmodifiedCamera.z;
            pitch = unmodifiedCamera.pitch;
            yaw = unmodifiedCamera.yaw;
        }
    }

    public static class camera{
        public static Float x;
        public static Float y;
        public static Float z;
        public static Float pitch;
        public static Float yaw;
    }

    public static class unmodifiedCamera{
        public static Float x;
        public static Float y;
        public static Float z;
        public static Float pitch;
        public static Float yaw;
    }
}
