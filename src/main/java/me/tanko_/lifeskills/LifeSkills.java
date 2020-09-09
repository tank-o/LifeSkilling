package me.tanko_.lifeskills;

import me.tanko_.lifeskills.Data.PlayerData;
import org.bukkit.plugin.java.JavaPlugin;

public final class LifeSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        //Load config files
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Playerdata
        PlayerData.setup(this);
        PlayerData.getFile().options().copyDefaults(true);
        PlayerData.save();
    }
}
