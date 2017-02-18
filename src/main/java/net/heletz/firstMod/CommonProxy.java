package net.heletz.firstMod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Sureynix on 1/15/17.
 */
public class CommonProxy {

    public void preInit (FMLPreInitializationEvent event) {
        myItems.createItems();
        ModBlocks.createBlocks();
    }
    public void init (FMLInitializationEvent event) {

    }
    public void postInit (FMLPostInitializationEvent event) {

    }

}
