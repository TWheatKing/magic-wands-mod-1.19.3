package net.thewheatking.magicwandsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thewheatking.magicwandsmod.MagicWandsMod;
import net.thewheatking.magicwandsmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block MAGICAL_WOOD_BLOCK = registerBlock("magical_wood_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool()), ModItemGroup.MAGICAL_WOOD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MagicWandsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MagicWandsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        MagicWandsMod.LOGGER.info("Registering ModBlocks for " + MagicWandsMod.MOD_ID);
    }
}
