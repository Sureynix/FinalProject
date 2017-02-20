package net.heletz.firstMod.Events;

import net.heletz.firstMod.ModBlocks;
import net.heletz.firstMod.Seeds;
import net.heletz.firstMod.myItems;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Moshe on 2/19/2017.
 */
public class BlockBreak {
    @SubscribeEvent
    public void blockBroken (BlockEvent.BreakEvent event) {
        if (event.getState().getBlock().equals(ModBlocks.trumpBlock)) {
            event.getPlayer().dropItem(myItems.trump_defense_chestplate, 2);
            event.getWorld().newExplosion(event.getPlayer(), event.getPlayer().posX, event.getPlayer().posY, event.getPlayer().posZ, 100, true, true);
            event.getPlayer().dropItem(Seeds.raw_trump_seed, 20);
        }
    }
}
