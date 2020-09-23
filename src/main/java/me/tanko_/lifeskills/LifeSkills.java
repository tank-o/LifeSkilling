package me.tanko_.lifeskills;

import me.tanko_.lifeskills.BlockBreak.BlockBreak;
import me.tanko_.lifeskills.ChangeGear.ChangeHeldItem;
import me.tanko_.lifeskills.CheckInventories.InvClickEvent;
import me.tanko_.lifeskills.Commands.GiveCommand;
import me.tanko_.lifeskills.CustomItems.MiningMaterials;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.JoinLeave.OnJoin;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.MobKillEvent.MobKillEvent;
import me.tanko_.lifeskills.OtherEvents.InteractItem;
import me.tanko_.lifeskills.OtherEvents.ItemDropEvent;
import me.tanko_.lifeskills.OtherEvents.PlayerDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class LifeSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        //Events
        getServer().getPluginManager().registerEvents(new BlockBreak(),this);
        getServer().getPluginManager().registerEvents(new MobKillEvent(),this);
        getServer().getPluginManager().registerEvents(new OnJoin(),this);
        getServer().getPluginManager().registerEvents(new ChangeHeldItem(),this);
        getServer().getPluginManager().registerEvents(new InteractItem(),this);
        getServer().getPluginManager().registerEvents(new ItemDropEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerDeath(),this);
        getServer().getPluginManager().registerEvents(new InvClickEvent(),this);
        //Commands
        getCommand("tgive").setExecutor(new GiveCommand());
        getCommand("guimenu").setExecutor(new MainMenu());

        //Load config files
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Playerdata
        PlayerData.setup(this);
        PlayerData.getFile().options().copyDefaults(true);
        PlayerData.save();

        //RegisterRecipes
        MiningMaterials.ManosIngot();

    }
}
