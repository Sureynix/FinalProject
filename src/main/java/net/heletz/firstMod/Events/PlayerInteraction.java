package net.heletz.firstMod.Events;

import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Moshe on 2/19/2017.
 */
public class PlayerInteraction {
    @SubscribeEvent
    public void interactions (PlayerInteractEvent event) {
        if (event.getEntityPlayer().isAirBorne) {
            event.getEntityPlayer().worldObj.spawnEntityInWorld(new EntitySnowball(event.getEntityPlayer().worldObj, event.getEntityPlayer()));
        }
    }
}
