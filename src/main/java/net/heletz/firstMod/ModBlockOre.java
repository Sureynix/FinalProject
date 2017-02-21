package net.heletz.firstMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Sureynix on 2/20/17.
 */
public class ModBlockOre extends Block {
    private Item drop;
    private int meta;
    private int least_quantity;
    private int most_quantity;
    protected ModBlockOre (String unlocaizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) {
        super(mat);
        this.drop = drop;
        this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(10.0f);
        this.setResistance(15.0f);
        this.setUnlocalizedName(unlocaizedName);
        this.setRegistryName(unlocaizedName);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    }
    @Override
    public Item getItemDropped (IBlockState blockState, Random random, int fortune) {
        return this.drop;
    }
    @Override
    public int damageDropped (IBlockState blockState) {
        return this.meta;
    }
    @Override
    public int quantityDropped(IBlockState blockState, int fortune, Random random) {
        if (this.least_quantity >= this.most_quantity) {
            return this.least_quantity;
        }
        return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
    }
}
