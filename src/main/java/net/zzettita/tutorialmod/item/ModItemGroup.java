package net.zzettita.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zzettita.tutorialmod.TutorialMod;

public class ModItemGroup {
    private static String path;
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID,"tanzanite"), () -> new ItemStack(ModItems.TANZANITE)); // el ()-> solo proporciona el item en concreto que aparecera como simbolo


}
