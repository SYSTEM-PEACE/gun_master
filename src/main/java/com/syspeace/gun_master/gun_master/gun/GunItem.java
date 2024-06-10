package com.syspeace.gun_master.gun_master.gun;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;


public abstract class GunItem extends Item implements FabricItem
{

    public GunItem(Properties properties) {
        super(properties);
    }
}