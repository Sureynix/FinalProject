package net.heletz.firstMod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sureynix on 1/15/17.
 */
public class CommonProxy {

    public void preInit (FMLPreInitializationEvent event) {
        myItems.createItems();
        ModBlocks.createBlocks();
    }
    public void init (FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new Generation(), 0);
    }
    public void postInit (FMLPostInitializationEvent event) {

    }

}
