package net.heletz.firstMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Moshe on 1/27/2017.
 */
public class Recipes {
    public void DonaldTrump () {
        ItemStack x = new ItemStack(myItems.trump_item, 2);
        ItemStack y = new ItemStack(myItems.neon_cat_item, 4);
        GameRegistry.addRecipe(x, new Object[] {
                "XXX",
                "YYY",
                "ZZZ",
                'X', new ItemStack(Blocks.BRICK_BLOCK),
                'Y', new ItemStack(Items.BOOK),
                'Z', new ItemStack(Items.IRON_SWORD)
        });
        GameRegistry.addRecipe(y, new Object[] {
                " X ",
                " Y ",
                " Z ",
                'X', new ItemStack(Blocks.GOLD_BLOCK),
                'Y', new ItemStack(Blocks.BONE_BLOCK),
                'Z', new ItemStack(Items.GOLDEN_SHOVEL)
        }) ;
        GameRegistry.addSmelting(myItems.neon_cat_item, new ItemStack(myItems.trump_item, 4, 0), 1.0f);


    }


}
