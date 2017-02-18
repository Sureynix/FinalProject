package net.heletz.firstMod.client.render.armor;

import net.heletz.firstMod.ItemModArmor;
import net.heletz.firstMod.Main;
import net.heletz.firstMod.myItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Moshe on 2/16/2017.
 */
public class ArmorRenderRegister {
    public static void reg () {
        registerArmorRenderer(myItems.trump_defense_helmet);
        registerArmorRenderer(myItems.trump_defense_chestplate);
        registerArmorRenderer(myItems.trump_defense_leggings);
        registerArmorRenderer(myItems.trump_defense_boots);
    }
    public static void registerArmorRenderer (ItemModArmor armor) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                armor,
                0,
                new ModelResourceLocation(
                        Main.modID + ":" + armor.getUnlocalizedName().substring(5),
                        "inventory"
                )
        );
    }
}
