package net.g3n0.smtpersonamod.item;

import net.minecraft.block.DispenserBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class OperaMaskItem extends CustomModelArmorItem {

public OperaMaskItem(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
    super(material,slot,builder);


}



    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment == Enchantments.ALL_DAMAGE_PROTECTION;
    }

}
