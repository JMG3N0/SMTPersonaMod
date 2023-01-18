package net.g3n0.smtpersonamod.block;

import net.g3n0.smtpersonamod.SMTPersonaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SMTPersonaMod.MOD_ID);

    public static final RegistryObject<OreBlock> MACCA_ORE = BLOCKS.register("macca_ore",
            () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).strength(3f)));



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
