package com.lawsmat.prompts.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class InventoryInput extends Input {
    private Inventory inventory;
    private InventoryType type;


    public InventoryInput(InventoryType type, String title) {
        this.type = type;
        this.inventory = Bukkit.createInventory(null,type,title);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public InventoryType getType() {
        return type;
    }
}
