package net.g3n0.smtpersonamod.world;

import javax.annotation.Nonnull;

import net.g3n0.smtpersonamod.SMTPersonaMod;
import net.g3n0.smtpersonamod.events.loot.Butterfly_Drop_Addition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SMTPersonaMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public  static void biomeLoadingEvents(final BiomeLoadingEvent event) {
       // ModOreGeneration.generateOres(event);
    }

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new Butterfly_Drop_Addition.Serializer().setRegistryName(new ResourceLocation(SMTPersonaMod.MOD_ID,"butterfly_in_grass"))

        );
    }
}

