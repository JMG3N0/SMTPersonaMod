package net.g3n0.smtpersonamod.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class OperaMaskItem extends CustomModelArmorItem {

public OperaMaskItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
    super(material,slot,builder);


}



    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment == Enchantments.SHARPNESS;
    }

}
