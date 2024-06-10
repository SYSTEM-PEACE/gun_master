package com.syspeace.gun_master.gun_master;

import com.syspeace.gun_master.gun_master.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MasterOfGunsmiths implements ModInitializer {

    public static final String MOD_ID = "gun_master";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        // 在模组初始化时注册自定义物品
        ModItems.registerModItems();
    }
}
