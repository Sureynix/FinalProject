package net.heletz.firstMod.items;

import net.minecraft.item.ItemSword;

/**
 * Created by Moshe on 2/17/2017.
 */
public class Sword extends ItemSword {
    public Sword (String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setRegistryName(unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
    }
}
