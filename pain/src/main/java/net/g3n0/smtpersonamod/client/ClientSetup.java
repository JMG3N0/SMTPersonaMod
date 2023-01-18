package net.g3n0.smtpersonamod.client;

import net.g3n0.smtpersonamod.SMTPersonaMod;
import net.g3n0.smtpersonamod.client.armor.opera_maskArmor;
import net.g3n0.smtpersonamod.item.ArmorModelRegistry;
import net.g3n0.smtpersonamod.item.CustomModelArmorItem;
import net.g3n0.smtpersonamod.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = SMTPersonaMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        ArmorModelRegistry.registerArmorModel(opera_maskArmor::new, (CustomModelArmorItem) ModItems.OPERA_MASK.get());
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void loadCustomArmorModels(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ArmorModelRegistry.loadArmorModels();
        });
    }
}
