package net.heletz.firstMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Sureynix on 1/15/17.
 */
@Mod(modid = Main.modID, name = Main.modName, version = Main.Version)
public class Main {
    @SidedProxy(clientSide = "net.heletz.firstMod.ClientProxy", serverSide = "net.heletz.firstMod.ServerProxy")
    public static CommonProxy proxy;
    public static final String modID = "first_mod";
    public static final String modName = "Moshe's First Mod";
    public static final String Version = "1.0";

    @Mod.Instance
    public static Main instance = new Main();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        Recipes x = new Recipes();
        x.DonaldTrump();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}
