package net.ranold.rpg.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.world.ServerWorld;

public class RootedEffect extends StatusEffect{

    public RootedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }


    @Override
    public boolean applyUpdateEffect(ServerWorld world, LivingEntity entity, int amplifier) {


        return super.applyUpdateEffect(world, entity, amplifier);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}