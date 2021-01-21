package com.lawsmat.prompts.util;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerRegistry {
    private HashMap<Player,InventoryInput> map;

    public HashMap<Player, InventoryInput> getMap() {
        return map;
    }

    public void addPlayer(Player p, InventoryInput i) {
        map.put(p,i);
    }

    public InventoryInput getInventory(Player p) {
        return map.get(p);
    }

    public void removePlayer(Player p) {
        map.remove(p);
    }
}
