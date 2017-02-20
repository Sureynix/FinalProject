package net.heletz.firstMod.Events;

import net.heletz.firstMod.myItems;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraftforge.event.entity.ThrowableImpactEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Moshe on 2/19/2017.
 */
public class ItemThrown {
    @SubscribeEvent
    public void detectThrowImpact(ThrowableImpactEvent event) {
        if (event.getEntity() instanceof EntityEgg) {
            event.getEntity().dropItem(myItems.trump_sword, 2);
            event.getEntity().dropItem(myItems.trump_defense_boots, 3);
            event.getEntity().dropItem(myItems.trump_pickaxe, 1);
        }
    }
}
