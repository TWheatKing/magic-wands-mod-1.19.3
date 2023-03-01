package net.thewheatking.magicwandsmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thewheatking.magicwandsmod.MagicWandsMod;
import net.thewheatking.magicwandsmod.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup MAGICAL_WOOD;
    public static ItemGroup MAGIC_WANDS_MOD;

    public static void registerItemGroups() {
        MAGICAL_WOOD = FabricItemGroup.builder(new Identifier(MagicWandsMod.MOD_ID, "magical_wood"))
                .displayName(Text.translatable("itemgroup.magical_wood"))
                .icon(() -> new ItemStack(ModItems.MAGICAL_WOOD)).build();
        MAGIC_WANDS_MOD = FabricItemGroup.builder(new Identifier(MagicWandsMod.MOD_ID, "magic_wands_mod"))
                .displayName(Text.translatable("itemgroup.magic_wands_mod"))
                .icon(() -> new ItemStack(ModItems.ANCIENT_MAGICAL_WOOD)).build();
    }
}
