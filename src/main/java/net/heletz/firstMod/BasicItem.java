package net.heletz.firstMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Sureynix on 1/15/17.
 */
public class BasicItem extends Item {
    public BasicItem(String unlocalizedName, CreativeTabs tab) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);

    }
}
