package com.lawsmat.prompts.inputs;

import com.lawsmat.prompts.Prompts;
import com.lawsmat.prompts.util.InventoryInput;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Arrays;

public class LoadingInput extends InventoryInput {
    private enum LoadingState {
        IDLE,
        LOADING,
        FAILURE,
        SUCCESS
    }

    private final ArrayList<Integer> circle = new ArrayList<>(Arrays.asList(0,1,2,5,8,7,6,3));

    private int progress = 0;
    private Long delay;
    private LoadingState state;

    public LoadingInput(String loadingText, ItemStack centerItem, Long delay) {
        super(InventoryType.DISPENSER,loadingText);
        this.state = LoadingState.IDLE;
        this.delay = delay;
        getInventory().setItem(4,centerItem);
    }

    public void start(Player p) {
        Prompts.getPlayerRegistry().addPlayer(p,this);
        p.openInventory(getInventory());
        state = LoadingState.LOADING;
        new BukkitRunnable() {
            @Override
            public void run() {
                if(state != LoadingState.LOADING) {
                    cancel();
                }
                getInventory().setItem(circle.get(progress),new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
                nextProgress();
            }
        }.runTaskTimer(Prompts.getPlugin(Prompts.class),0,10);
    }

    public void setProgress(int progress) {
        if(progress > 7 || progress < 0) {
            return;
        }
        this.progress = progress;
    }

    private void nextProgress() {
        if(progress + 1 > 7 || progress < 0) {
            // reset
            setProgress(0);
        }else{
            setProgress(progress + 1);
        }
    }

    private int getLastProgress() {
        if(progress > 7 || progress - 1 < 0) {
            // go all the way back
            return circle.get(circle.size() - 1);
        }else{
            return progress - 1;
        }
    }
}
