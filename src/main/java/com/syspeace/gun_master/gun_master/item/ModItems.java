package com.syspeace.gun_master.gun_master.item;

import com.syspeace.gun_master.gun_master.MasterOfGunsmiths;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class ModItems {

    public static final Item test_3d = ModItems.reg_Item("test_3d",new Item(new Item.Properties()));


    // 定义注册物品到游戏的物品注册表的方法
    public static Item reg_Item(String name, Item item) {
        MasterOfGunsmiths.LOGGER.debug("正在注册物品:"+name);
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MasterOfGunsmiths.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MasterOfGunsmiths.LOGGER.debug("MasterOfGunsmiths正在注册Items，MOD_ID:" + MasterOfGunsmiths.MOD_ID);
    }
}
