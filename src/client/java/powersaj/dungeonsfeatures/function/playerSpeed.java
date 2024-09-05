package powersaj.dungeonsfeatures.function;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

import java.util.Objects;

public class playerSpeed {
    /**
     * @param player The player object to change the speed of
     * @param speed The speed to set the player to
     * @param type The type of speed to change (flight or walk)
     */
    public static void changePlayerClientSpeed(PlayerEntity player, float speed, String type) {
        if (type == null) if (player.getAbilities().flying) type = "flight"; else type = "walk";
        if (type.equals("flight")) player.getAbilities().setFlySpeed(0.05f * speed);
        Objects.requireNonNull(player.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)).setBaseValue(0.1f * speed);
        player.sendAbilitiesUpdate();
    }
    /**
     * @param client The MinecraftClient object to update the player speed of.
     * @see DungeonsFeaturesValues#playerSpeed
     */
    public static void updatePlayerSpeed(MinecraftClient client) {
        PlayerEntity player = client.player;
        if (player != null) changePlayerClientSpeed(player, DungeonsFeaturesValues.playerSpeed, null);
    }
}
