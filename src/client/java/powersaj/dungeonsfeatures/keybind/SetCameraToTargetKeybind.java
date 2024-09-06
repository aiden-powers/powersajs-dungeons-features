package powersaj.dungeonsfeatures.keybind;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

public class SetCameraToTargetKeybind {
    private static final KeyBinding setCameraToTarget = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.dungeonsfeatures.setTarget",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_M,
            "category.dungeonsfeatures.debug"
    ));

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (setCameraToTarget.wasPressed()) {
                DungeonsFeaturesValues.cameraTarget.unmodifiedCameraToTarget();
                assert client.player != null;
                client.player.sendMessage(Text.of("Camera set to target"), false);
            }
        });
    }
}