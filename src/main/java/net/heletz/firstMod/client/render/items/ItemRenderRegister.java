package net.heletz.firstMod.client.render.items;

import net.heletz.firstMod.Main;
import net.heletz.firstMod.myItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Sureynix on 1/15/17.
 */
public class ItemRenderRegister {
    public static void reg() {
        registerItemRenderer(myItems.first_item);
        registerItemRenderer(myItems.neon_cat_item);
        registerItemRenderer(myItems.trump_item);
        registerItemRenderer(myItems.raw_trump);
        registerItemRenderer(myItems.trump_hoe);
        registerItemRenderer(myItems.trump_pickaxe);
        registerItemRenderer(myItems.trump_spade);
        registerItemRenderer(myItems.trump_sword);
        registerItemRenderer(myItems.trump_grenade);
    }
    public static void registerItemRenderer (Item item) {

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
