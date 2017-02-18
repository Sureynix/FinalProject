package net.heletz.firstMod.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by Moshe on 2/17/2017.
 */
public class Pickaxe extends ItemPickaxe {
    public Pickaxe (String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setRegistryName(unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
    }
}
