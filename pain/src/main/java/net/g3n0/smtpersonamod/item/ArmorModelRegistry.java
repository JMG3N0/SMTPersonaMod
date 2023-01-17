package net.g3n0.smtpersonamod.item;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import com.google.common.collect.ImmutableMap;

import net.g3n0.smtpersonamod.SMTPersonaMod;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorModelRegistry {
    public static final Marker ARMORMODEL = MarkerManager.getMarker("ARMORMODEL");
    private static final ArmorModelRegistry INSTANCE = new ArmorModelRegistry();

    private Map<IModelFactory, CustomModelArmorItem[]> armorModelFactories = new ConcurrentHashMap<>();
    private Map<CustomModelArmorItem, BipedModel<?>> armorModels;

    public static void registerArmorModel(IModelFactory modelFactory, CustomModelArmorItem... armorItems) {
        INSTANCE.armorModelFactories.put(modelFactory, armorItems);
    }

    public static void loadArmorModels() {
        if (INSTANCE.armorModels == null) {
            ImmutableMap.Builder<CustomModelArmorItem, BipedModel<?>> builder = ImmutableMap.builder();
            INSTANCE.armorModelFactories.forEach((modelFactory, items) -> {
                BipedModel<?> model = modelFactory.create(0.0F);
                for (CustomModelArmorItem item : items) {
                    builder.put(item, model);
                }
            });
            INSTANCE.armorModels = builder.build();
            for (Item item : ForgeRegistries.ITEMS) {
                if (item instanceof CustomModelArmorItem && !INSTANCE.armorModels.containsKey(item)) {
                    SMTPersonaMod.getLogger().error(ARMORMODEL, "No armor model registered for {}", ForgeRegistries.ITEMS.getKey(item));

                }
            }
        }
    }

    public static BipedModel<?> getModel(CustomModelArmorItem item) {
        return INSTANCE.armorModels.get(item);
    }

    public interface IModelFactory {
        public BipedModel<?> create(float modelSize);
    }
}
