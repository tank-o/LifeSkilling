package me.tanko_.lifeskills.JoinLeave;

import me.tanko_.lifeskills.Data.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

    @EventHandler
    public void OnBlockBreak(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String ID = player.getUniqueId().toString();

        if (!PlayerData.getFile().contains(ID)) {
            PlayerData.getFile().createSection(ID);
            //Butchering
            PlayerData.getFile().createSection(ID + ".Butchering");
            PlayerData.getFile().createSection(ID + ".Butchering.Level");
            PlayerData.getFile().createSection(ID + ".Butchering.XP");
            PlayerData.getFile().createSection(ID + ".Butchering.Mastery");
            PlayerData.getFile().set(ID + ".Butchering.Level",0);
            PlayerData.getFile().set(ID + ".Butchering.XP",0);
            PlayerData.getFile().set(ID + ".Butchering.Mastery",0);
            //Lumbering
            PlayerData.getFile().createSection(ID + ".Lumbering");
            PlayerData.getFile().createSection(ID + ".Lumbering.Level");
            PlayerData.getFile().createSection(ID + ".Lumbering.XP");
            PlayerData.getFile().createSection(ID + ".Lumbering.Mastery");
            PlayerData.getFile().set(ID + ".Lumbering.Level",0);
            PlayerData.getFile().set(ID + ".Lumbering.XP",0);
            PlayerData.getFile().set(ID + ".Lumbering.Mastery",0);
            //Mining
            PlayerData.getFile().createSection(ID + ".Mining");
            PlayerData.getFile().createSection(ID + ".Mining.Level");
            PlayerData.getFile().createSection(ID + ".Mining.XP");
            PlayerData.getFile().createSection(ID + ".Mining.Mastery");
            PlayerData.getFile().set(ID + ".Mining.Level",0);
            PlayerData.getFile().set(ID + ".Mining.XP",0);
            PlayerData.getFile().set(ID + ".Mining.Mastery",0);
            //Cooking
            PlayerData.getFile().createSection(ID + ".Cooking");
            PlayerData.getFile().createSection(ID + ".Cooking.Level");
            PlayerData.getFile().createSection(ID + ".Cooking.XP");
            PlayerData.getFile().createSection(ID + ".Cooking.Mastery");
            PlayerData.getFile().set(ID + ".Cooking.Level",0);
            PlayerData.getFile().set(ID + ".Cooking.XP",0);
            PlayerData.getFile().set(ID + ".Cooking.Mastery",0);
            //Alchemy
            PlayerData.getFile().createSection(ID + ".Alchemy");
            PlayerData.getFile().createSection(ID + ".Alchemy.Level");
            PlayerData.getFile().createSection(ID + ".Alchemy.XP");
            PlayerData.getFile().createSection(ID + ".Alchemy.Mastery");
            PlayerData.getFile().set(ID + ".Alchemy.Level",0);
            PlayerData.getFile().set(ID + ".Alchemy.XP",0);
            PlayerData.getFile().set(ID + ".Alchemy.Mastery",0);
            //Riding
            PlayerData.getFile().createSection(ID + ".Riding");
            PlayerData.getFile().createSection(ID + ".Riding.Level");
            PlayerData.getFile().createSection(ID + ".Riding.XP");
            PlayerData.getFile().createSection(ID + ".Riding.Mastery");
            PlayerData.getFile().set(ID + ".Riding.Level",0);
            PlayerData.getFile().set(ID + ".Riding.XP",0);
            PlayerData.getFile().set(ID + ".Riding.Mastery",0);
            //Sailing
            PlayerData.getFile().createSection(ID + ".Sailing");
            PlayerData.getFile().createSection(ID + ".Sailing.Level");
            PlayerData.getFile().createSection(ID + ".Sailing.XP");
            PlayerData.getFile().createSection(ID + ".Sailing.Mastery");
            PlayerData.getFile().set(ID + ".Sailing.Level",0);
            PlayerData.getFile().set(ID + ".Sailing.XP",0);
            PlayerData.getFile().set(ID + ".Sailing.Mastery",0);
        }
    }


}

