package net.seed.charterrippoff.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seed.charterrippoff.CharterRippoff;

public class ModBlocks {
    public static final Block DIVINE_GOLD_BLOCK = registerBlock("divine_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block METAL_BLOCK = registerBlock("metal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DEEPSLATE_DIVINE_GOLD_ORE = registerBlock("deepslate_divine_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block NETHER_DIVINE_GOLD_ORE = registerBlock("nether_divine_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block END_STONE_DIVINE_GOLD_ORE = registerBlock("end_stone_divine_gold_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CharterRippoff.MOD_ID, name), block);
    }

private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(CharterRippoff.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
}

    public static void registerModBlocks() {
        CharterRippoff.LOGGER.info("Registering ModBlocks for " + CharterRippoff.MOD_ID);
    }
}
