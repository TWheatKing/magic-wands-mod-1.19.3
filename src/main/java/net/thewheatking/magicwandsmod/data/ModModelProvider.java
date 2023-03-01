package net.thewheatking.magicwandsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.item.Item;
import net.thewheatking.magicwandsmod.block.ModBlocks;
import net.thewheatking.magicwandsmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_AMETHYST_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.MAGICAL_WOOD_LOG).log(ModBlocks.MAGICAL_WOOD_LOG).wood(ModBlocks.MAGICAL_WOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG).log(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG).wood(ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGICAL_WOOD_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MAGICAL_WOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICAL_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_MAGICAL_WOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_MAGICAL_WOOD, Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.AMETHYST_ORE), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.DEEPSLATE_AMETHYST_ORE), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_BLOCK), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_LOG), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_LEAVES), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_PLANKS), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_SAPLING), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.MAGICAL_WOOD_WOOD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.STRIPPED_MAGICAL_WOOD_LOG), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.STRIPPED_MAGICAL_WOOD_WOOD), Models.GENERATED);

    }
}
