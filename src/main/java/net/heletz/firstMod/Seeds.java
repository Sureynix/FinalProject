package net.heletz.firstMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Moshe on 2/14/2017.
 */
public class Seeds {
    public static Item raw_trump_seed = new ItemSeeds(Crops.raw_trump_crop, Blocks.FARMLAND)
            .setRegistryName("raw_trump_seed")
            .setUnlocalizedName("raw_trump_seed")
            .setCreativeTab(CreativeTabs.MISC);
    public static void init() {
        GameRegistry.register(raw_trump_seed);
    }
    public static void reg () {
        registerRenderItem(raw_trump_seed);
    }
    public static void registerRenderItem (Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item,
                0,
                new ModelResourceLocation(
                        Main.modID + ":" + item.getUnlocalizedName().substring(5),
                        "inventory"
                )
        );
    }
}