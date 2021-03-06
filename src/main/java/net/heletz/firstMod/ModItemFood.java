package net.heletz.firstMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Moshe on 1/29/2017.
 */
public class ModItemFood extends ItemFood {
    private PotionEffect[] effects;
    public ModItemFood (String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.effects = effects;
    }
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        for(int i = 0; i < effects.length; i++) {

            if (!world.isRemote && effects[i] != null && effects[i].getPotion().getIdFromPotion(effects[i].getPotion()) > 0) {
                player.addPotionEffect(new PotionEffect(this.effects[i]));
            }
        }
    }
}
