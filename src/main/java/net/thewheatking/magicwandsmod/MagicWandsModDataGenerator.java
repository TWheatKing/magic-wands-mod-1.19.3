package net.thewheatking.magicwandsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.thewheatking.magicwandsmod.data.ModLootTableGenerator;
import net.thewheatking.magicwandsmod.data.ModModelProvider;
import net.thewheatking.magicwandsmod.data.ModRecipeGenerator;

public class MagicWandsModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
	}
}
