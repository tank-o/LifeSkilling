package me.tanko_.lifeskills;

import me.tanko_.lifeskills.BlockBreak.BlockBreak;
import me.tanko_.lifeskills.Commands.GiveCommand;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.JoinLeave.OnJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LifeSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        //Events
        getServer().getPluginManager().registerEvents(new BlockBreak(),this);
        getServer().getPluginManager().registerEvents(new OnJoin(),this);
        //Commands
        getCommand("tgive").setExecutor(new GiveCommand());

        //Load config files
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Playerdata
        PlayerData.setup(this);
        PlayerData.getFile().options().copyDefaults(true);
        PlayerData.save();
    }
}
