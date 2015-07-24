package com.lionzxy.ytmod;

import com.lionzxy.ytmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by nikit_000 on 24.07.2015.
 */
@Mod(modid = YTVersion.MODID, name = YTVersion.NAME, version = YTVersion.NAME)
public class YouTubeMod {

    @SidedProxy(clientSide = "com.lionzxy.ytmod.proxy.ClientProxy", serverSide = "com.lionzxy.ytmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.println("Я пупырка");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
