package powersaj.dungeonsfeatures.keybind;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

public class CameraTargetToggleKeybind {
    private static final KeyBinding cameraTargetToggle = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.dungeonsfeatures.camera_target_toggle",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_N,
            "category.dungeonsfeatures.debug"
    ));

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (cameraTargetToggle.wasPressed()) {
                DungeonsFeaturesValues.cameraTarget.isDetatched = !DungeonsFeaturesValues.cameraTarget.isDetatched;
                assert client.player != null;
                client.player.sendMessage(Text.of("Camera target is now " + (DungeonsFeaturesValues.cameraTarget.isDetatched ? "detatched" : "attached")), false);
            }
        });
    }
}