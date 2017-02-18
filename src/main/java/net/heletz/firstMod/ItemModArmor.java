package net.heletz.firstMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Moshe on 2/16/2017.
 */
public class ItemModArmor extends ItemArmor {

    public ItemModArmor (String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == myItems.trump_defense_helmet) {
        effectPlayer(player, Potion.getPotionFromResourceLocation("night_vision"), 0);
        effectPlayer(player, Potion.getPotionFromResourceLocation("fire_resistance"), 0);
        }
    }
    private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
        if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
            player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
        }
    }
}
