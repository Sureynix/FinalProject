package net.heletz.firstMod;

import net.heletz.firstMod.client.render.armor.ArmorRenderRegister;
import net.heletz.firstMod.client.render.blocks.BlockRenderRegister;
import net.heletz.firstMod.client.render.items.ItemRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Sureynix on 1/15/17.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        Crops.init();
        Seeds.init();

    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        BlockRenderRegister.registerBlockRenderer();
        ItemRenderRegister.reg();
        ArmorRenderRegister.reg();
        Crops.register();
        Seeds.reg();

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
