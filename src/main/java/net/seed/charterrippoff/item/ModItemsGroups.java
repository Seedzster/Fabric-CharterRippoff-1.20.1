package net.seed.charterrippoff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.seed.charterrippoff.CharterRippoff;
import net.seed.charterrippoff.block.ModBlocks;

public class ModItemsGroups {
    public static final ItemGroup CHARTER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CharterRippoff.MOD_ID, "higherdivinity"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.charterrippoff"))
                    .icon(() -> new ItemStack(ModItems.METAL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.METAL_INGOT);
                        entries.add(ModItems.DIVINE_GOLD_INGOT);
                        entries.add(ModBlocks.DIVINE_GOLD_BLOCK);
                        entries.add(ModBlocks.METAL_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_DIVINE_GOLD_ORE);
                        entries.add(ModBlocks.NETHER_DIVINE_GOLD_ORE);
                        entries.add(ModBlocks.END_STONE_DIVINE_GOLD_ORE);

                    }).build());




    public static void registerItemGroups() {
        CharterRippoff.LOGGER.info("Registering Item Groups for " +CharterRippoff.MOD_ID);
    }
}
