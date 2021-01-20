package com.lawsmat.prompts.util;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PlayerInventory {
    private Inventory i;
    private Player p;
    private InputType e;

    public PlayerInventory(Inventory inv, Player player, InputType type) {
        this.i = inv;
        this.p = player;
        this.e = type;
    }

    public Inventory getInventory() {
        return i;
    }

    public InputType getInputType() {
        return e;
    }

    public Player getPlayer() {
        return p;
    }
}
