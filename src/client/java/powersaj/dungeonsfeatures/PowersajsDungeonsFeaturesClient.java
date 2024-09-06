package powersaj.dungeonsfeatures;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import powersaj.dungeonsfeatures.function.playerSpeed;
import powersaj.dungeonsfeatures.scripts.debugHud;
import powersaj.dungeonsfeatures.keybind.CameraTargetToggleKeybind;
import powersaj.dungeonsfeatures.keybind.SetCameraToTargetKeybind;

public class PowersajsDungeonsFeaturesClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(playerSpeed::updatePlayerSpeed);
		ClientTickEvents.END_CLIENT_TICK.register(EveryTick::everyTick);
		HudRenderCallback.EVENT.register(debugHud::debugHudRender);

		CameraTargetToggleKeybind.register();
		SetCameraToTargetKeybind.register();
	}
}