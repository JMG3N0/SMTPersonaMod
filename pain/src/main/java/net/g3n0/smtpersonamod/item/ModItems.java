package net.g3n0.smtpersonamod.item;

import net.g3n0.smtpersonamod.SMTPersonaMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMTPersonaMod.MOD_ID);

    public static final RegistryObject<Item> BLUE_BUTTERFLY = ITEMS.register("blue_butterfly",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> PLUME_OF_DUSK = ITEMS.register("plume_of_dusk",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)));

    public static final RegistryObject<Item> BLACK_BUTTERFLY = ITEMS.register("black_butterfly",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> VIOLET_BUTTERFLY = ITEMS.register("violet_butterfly",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> GOLDEN_BUTTERFLY = ITEMS.register("golden_butterfly",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> MACCA_NUGGET = ITEMS.register("macca_nugget",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)));

    public static final RegistryObject<Item> MACCA_COIN = ITEMS.register("macca_coin",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> BLANK_CARD = ITEMS.register("blank_card",
            () -> new Item(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB)) );

    public static final RegistryObject<Item> MARA_PHONE = ITEMS.register("mara_phone",
            () -> new Item(new Item.Properties().stacksTo(1).tab(SMTPersonaMod.MAIN_TAB)));



    public static final RegistryObject<Item> NYARLATHOTEP_SIGIL = ITEMS.register("nyarlathotep_sigil",
            () -> new Item(new Item.Properties().stacksTo(1).tab(SMTPersonaMod.MAIN_TAB)));

    public static final RegistryObject<Item> EVOKER = ITEMS.register("evoker",
            () -> new Item(new Item.Properties().stacksTo(1).tab(SMTPersonaMod.MAIN_TAB)));

    public static final RegistryObject<Item> TAROT_CARD = ITEMS.register("tarot_card",
            () -> new Item(new Item.Properties().stacksTo(1).tab(SMTPersonaMod.MAIN_TAB)));

    public static final RegistryObject<OperaMaskItem> OPERA_MASK = ITEMS.register("opera_mask",
            ()-> new OperaMaskItem(ArmorMaterial.CHAIN, EquipmentSlotType.HEAD,(new Item.Properties().tab(SMTPersonaMod.MAIN_TAB))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
