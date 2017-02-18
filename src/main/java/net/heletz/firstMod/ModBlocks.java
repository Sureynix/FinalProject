package net.heletz.firstMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sureynix on 1/19/17.
 */
public final class ModBlocks {
    public static Block firstBlock;
    public static ItemBlock firstItemBlock;
    public static Block trumpBlock;
    public static ItemBlock trumpItemBlock;
    public static void createBlocks() {
        GameRegistry.register(firstBlock = new BasicBlock("first_block").setLightLevel(1.0f));
        GameRegistry.register(firstItemBlock = (ItemBlock) new ItemBlock(firstBlock).setRegistryName(firstBlock.getRegistryName()));
        GameRegistry.register(trumpBlock = new BasicBlock("trump_block").setLightLevel(0.4f));
        GameRegistry.register(trumpItemBlock = (ItemBlock) new ItemBlock(trumpBlock).setRegistryName(trumpBlock.getRegistryName()));
    }
}
