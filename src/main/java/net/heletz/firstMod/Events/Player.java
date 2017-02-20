package net.heletz.firstMod.Events;

import net.heletz.firstMod.Seeds;
import net.heletz.firstMod.myItems;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Moshe on 2/19/2017.
 */
public class Player {
    @SubscribeEvent
    public void plaerstuff(PlayerEvent event) {
        if (event.getEntityPlayer().isBurning()) {
            event.getEntity().dropItem(myItems.trump_defense_helmet, 20);
            event.getEntity().dropItem(myItems.trump_spade, 20);
            event.getEntity().dropItem(myItems.trump_defense_chestplate, 20);
        }
    }
}
