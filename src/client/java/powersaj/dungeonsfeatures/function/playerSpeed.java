package powersaj.dungeonsfeatures.function;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

import java.util.Objects;

public class playerSpeed {
    public static void changePlayerClientSpeed(PlayerEntity player, float speed, String type) {
        if (type == null) {
            if (player.getAbilities().flying) {
                type = "flight";
            } else {
                type = "walk";
            }
        }

        if (type.equals("flight")) {
            player.getAbilities().setFlySpeed(0.05f * speed);
        } else {
            Objects.requireNonNull(player.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)).setBaseValue(0.1f * speed);
        }
        player.sendAbilitiesUpdate();
    }

    public static void updatePlayerSpeed(MinecraftClient client) {
        PlayerEntity player = client.player;
        if (player != null) {
            changePlayerClientSpeed(player, DungeonsFeaturesValues.playerSpeed, null);
        }
    }
}
