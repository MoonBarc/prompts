package com.lawsmat.prompts;

import org.bukkit.plugin.java.JavaPlugin;

public class Prompts extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Prompts API has loaded.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Prompts API has disabled.");
    }
}
