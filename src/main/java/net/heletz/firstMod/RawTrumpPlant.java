package net.heletz.firstMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Moshe on 2/13/2017.
 */
public class RawTrumpPlant extends BlockCrops {
    public RawTrumpPlant () {
        setRegistryName("raw_trump_crop");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Override
    protected Item getSeed() {
        return Seeds.raw_trump_seed;
    }

    @Override
    protected Item getCrop() {
        return myItems.raw_trump;
    }
}
