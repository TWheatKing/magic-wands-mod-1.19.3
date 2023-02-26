package net.thewheatking.magicwandsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thewheatking.magicwandsmod.MagicWandsMod;

public class ModItems {
    public static final Item MAGICAL_WOOD = registerItem("magical_wood",
            new Item(new FabricItemSettings()));
    public static final Item ANCIENT_MAGICAL_WOOD = registerItem("ancient_magical_wood",
            new Item(new FabricItemSettings()));
    public static final Item DARK_MAGICAL_WOOD = registerItem("dark_magical_wood",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagicWandsMod.MOD_ID, name), item);
    }

    public static void  addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, MAGICAL_WOOD);
        addToItemGroup(ItemGroups.INGREDIENTS, ANCIENT_MAGICAL_WOOD);
        addToItemGroup(ItemGroups.INGREDIENTS, DARK_MAGICAL_WOOD);

        addToItemGroup(ModItemGroup.MAGICAL_WOOD, MAGICAL_WOOD);
        addToItemGroup(ModItemGroup.MAGICAL_WOOD, ANCIENT_MAGICAL_WOOD);
        addToItemGroup(ModItemGroup.MAGICAL_WOOD, DARK_MAGICAL_WOOD);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        MagicWandsMod.LOGGER.info("Registering Mod Items for " + MagicWandsMod.MOD_ID);

        addItemsToItemGroup();
    }
}
