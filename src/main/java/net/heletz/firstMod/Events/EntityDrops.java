package net.heletz.firstMod.Events;

import net.heletz.firstMod.myItems;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Moshe on 2/19/2017.
 */
public class EntityDrops {
    @SubscribeEvent
    public void changeDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityChicken) {
            event.getDrops().clear();
            event.getEntity().dropItem(myItems.trump_grenade, 1);
        }
        if (event.getEntity() instanceof EntityCow) {
            event.getDrops().clear();
            event.getEntity().dropItem(myItems.trump_defense_leggings, 1);
        }
        if (event.getEntity() instanceof EntityBat) {
            event.getEntity().dropItem(myItems.trump_hoe, 1);
        }
    }
}
