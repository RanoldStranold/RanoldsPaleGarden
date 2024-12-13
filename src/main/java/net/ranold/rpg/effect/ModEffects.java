package net.ranold.rpg.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.ranold.rpg.RanoldsPaleGarden;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> ROOTED = registerStatusEffect("rooted",
        new RootedEffect(StatusEffectCategory.NEUTRAL, 0xe78725)
                    .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED,
                                Identifier.of(RanoldsPaleGarden.MOD_ID,"rooted"),-0.25f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(RanoldsPaleGarden.MOD_ID, name), statusEffect);
    }

    public static void registerEffects(){
        RanoldsPaleGarden.LOGGER.info("Registering Mod Effects for" + RanoldsPaleGarden.MOD_ID);
    }
}
