package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
    public CustomSword() {
        super(ExampleMod.myToolMaterial);
        this.setRegistryName("epee_feu");
        this.setUnlocalizedName("epee_feu");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
