package com.lawsmat.prompts;

import com.lawsmat.prompts.util.PlayerRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class Prompts extends JavaPlugin {
    private static PlayerRegistry r;

    @Override
    public void onEnable() {
        getLogger().info("Prompts API has loaded.");
        r = new PlayerRegistry();
    }

    @Override
    public void onDisable() {
        getLogger().info("Prompts API has disabled.");
    }

    public static PlayerRegistry getPlayerRegistry() {
        return r;
    }
}
