package powersaj.dungeonsfeatures.scripts;

public class cameraUtils {
    public static float toDegrees(float degreesAdditive) {
        // degreesAdditive is more than 360, but still degrees, so we need to convert it to 0-360
        while (degreesAdditive > 360) {
            degreesAdditive -= 360;
        }
        // degreesAdditive is less than 0, but still degrees, so we need to convert it to 0-360
        while (degreesAdditive < 0) {
            degreesAdditive += 360;
        }
        return degreesAdditive;
    }

    public static int getFullRevolutions(float yaw) {
        return (int) (yaw / 360);
    }
}
