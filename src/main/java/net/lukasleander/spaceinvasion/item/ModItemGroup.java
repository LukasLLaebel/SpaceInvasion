package net.lukasleander.spaceinvasion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lukasleander.spaceinvasion.SpaceInvasion;
import net.lukasleander.spaceinvasion.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    // defining itemgroups
    public static ItemGroup SPACEMETAL;
    public static ItemGroup SPACESTONES;

    // registering the different types of itemgroups
    public static void registerItemGroup() {
        SPACEMETAL = FabricItemGroup.builder(new Identifier(SpaceInvasion.MOD_ID, "spacemetal"))
                .displayName(Text.translatable("itemgroup.spacemetal"))
                .icon(() -> new ItemStack(ModItems.BLUECRYSTAL)).build();
        SPACESTONES = FabricItemGroup.builder(new Identifier(SpaceInvasion.MOD_ID, "spacestone"))
                .displayName(Text.translatable("itemgroup.spacestone"))
                .icon(() -> new ItemStack(ModBlocks.SPACESTONE)).build();
    }

}
