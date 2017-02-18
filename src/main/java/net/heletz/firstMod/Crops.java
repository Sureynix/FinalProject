package net.heletz.firstMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Moshe on 2/13/2017.
 */
public class Crops {
    public static Block raw_trump_crop;

    public static void init () {
        raw_trump_crop = new RawTrumpPlant();
        raw_trump_crop.setUnlocalizedName("raw_trump_crop");
    }
    public static void register () {
        regBlock(raw_trump_crop);
    }
    public static void regBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.modID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
