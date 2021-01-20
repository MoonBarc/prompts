package com.lawsmat.prompts.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryEvents implements Listener {
    @EventHandler
    public void inventoryInteract(InventoryClickEvent e) {
        if(e.getSlotType() != InventoryType.SlotType.CONTAINER) {
            e.setCancelled(true);
            return;
        }
        if(e.isShiftClick()) {
            e.setCancelled(true);
            return;
        }
        if(e.getAction() != InventoryAction.PICKUP_ONE && e.getAction() != InventoryAction.PLACE_ONE) {
            e.setCancelled(true);
            return;
        }
        if(e.getAction() == InventoryAction.PICKUP_ONE) {
            if(e.getSlot() != 10) {
                e.setCancelled(true);
                return;
            }
        }
        if(e.getAction() == InventoryAction.PLACE_ONE) {
            if(e.getSlot() != 16) {
                e.setCancelled(true);
                return;
            }else{
                e.getWhoClicked().sendMessage(ChatColor.GREEN + "Confirmed. Deleting progress >:)");
            }
        }
    }
}
