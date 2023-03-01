package net.thewheatking.magicwandsmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.thewheatking.magicwandsmod.block.ModBlocks;
import net.thewheatking.magicwandsmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE,
        //        0.7f, 200, "citrine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MAGICAL_WOOD, RecipeCategory.DECORATIONS,
                ModBlocks.MAGICAL_WOOD_BLOCK);

        // JUST AN EXAMPLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_AMETHYST)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.AMETHYST)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.AMETHYST),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AMETHYST))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_AMETHYST)));
    }
}
