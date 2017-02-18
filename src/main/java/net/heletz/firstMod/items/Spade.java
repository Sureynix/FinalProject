package net.heletz.firstMod.items;

import net.minecraft.item.ItemSpade;

/**
 * Created by Moshe on 2/17/2017.
 */
public class Spade extends ItemSpade {
    public Spade (String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setRegistryName(unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
    }
}
