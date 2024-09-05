package powersaj.dungeonsfeatures;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import powersaj.dungeonsfeatures.function.playerSpeed;

import java.util.Objects;

public class PowersajsDungeonsFeaturesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(playerSpeed::updatePlayerSpeed);

		HudRenderCallback.EVENT.register((context, tickDeltaManager) -> {
			MinecraftClient client = MinecraftClient.getInstance();

			// Render the mod name
			context.drawText(client.textRenderer, Text.of("Powersaj's Dungeons Features Debug"), 10, 10, 0xFFFFFFFF, true);

			// Render the player's step height
			String clientStepHeight = "DungeonsFeaturesValues.entityStepHeight: " + Objects.requireNonNull(client.getCameraEntity()).getStepHeight();
			context.drawText(client.textRenderer, Text.of(clientStepHeight), 10, 20, 0xFFFFFFFF, true);

			// Render the player's movement speed
			String clientMovementSpeed = "DungeonsFeaturesValues.playerSpeed: " + DungeonsFeaturesValues.playerSpeed;
			context.drawText(client.textRenderer, Text.of(clientMovementSpeed), 10, 30, 0xFFFFFFFF, true);

		});
	}
}