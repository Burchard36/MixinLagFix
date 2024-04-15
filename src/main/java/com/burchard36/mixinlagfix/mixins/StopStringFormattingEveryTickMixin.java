package com.burchard36.mixinlagfix.mixins;

import fuzs.thinair.handler.TickAirChecker;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = TickAirChecker.class, remap = false)
public class StopStringFormattingEveryTickMixin {

    /**
     * @author Dalton
     * @reason I'm seriously so sick of this causing 5tps when just 4 players are on a server. This is doing what should be done, disable this dang mod
     */
    @Overwrite
    public static void onLivingTick(LivingEntity entity) {

    }

}
