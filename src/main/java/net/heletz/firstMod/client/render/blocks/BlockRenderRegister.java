package net.heletz.firstMod.client.render.blocks;

import net.heletz.firstMod.Main;
import net.heletz.firstMod.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Moshe on 1/21/2017.
 */
public class BlockRenderRegister {
    public static void registerBlockRenderer () {
        reg(ModBlocks.firstBlock);
        reg(ModBlocks.trumpBlock);
        reg(ModBlocks.trumpOre);
    }
    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.modID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}