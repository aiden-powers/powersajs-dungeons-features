package powersaj.dungeonsfeatures.mixin.client;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import powersaj.dungeonsfeatures.DungeonsFeaturesValues;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "getStepHeight", at = @At("HEAD"), cancellable = true)
    private void replaceGetStepHeight(CallbackInfoReturnable<Float> cir) {
        Float entityStepHeight = DungeonsFeaturesValues.entityStepHeight;
        cir.setReturnValue(entityStepHeight);
    }
}