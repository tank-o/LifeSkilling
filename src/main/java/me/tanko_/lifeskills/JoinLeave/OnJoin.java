package me.tanko_.lifeskills.JoinLeave;

import me.tanko_.lifeskills.Data.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String ID = player.getUniqueId().toString();

        if (!PlayerData.getFile().contains(ID)) {
            player.sendMessage("Creating file");
            PlayerData.getFile().createSection(ID);
            PlayerData.getFile().createSection(ID + ".Mastery");
            //Gathering
            PlayerData.getFile().createSection(ID + ".Gathering");
            PlayerData.getFile().createSection(ID + ".Gathering.Level");
            PlayerData.getFile().createSection(ID + ".Gathering.XP");
            PlayerData.getFile().createSection(ID + ".Gathering.XPMulti");
            PlayerData.getFile().set(ID + ".Gathering.Mastery",0);
            PlayerData.getFile().set(ID + ".Gathering.XP",0);
            PlayerData.getFile().set(ID + ".Gathering.Level",0);
            PlayerData.getFile().set(ID + ".Gathering.XPMulti",0);
            //Butchering
            PlayerData.getFile().createSection(ID + ".Gathering.Butchering");
            PlayerData.getFile().createSection(ID + ".Gathering.Butchering.Mastery");
            PlayerData.getFile().createSection(ID + ".Gathering.Butchering.XPMulti");
            PlayerData.getFile().set(ID + ".Gathering.Butchering.Mastery",0);
            PlayerData.getFile().set(ID + ".Gathering.Butchering.XPMulti",0);
            //Lumbering
            PlayerData.getFile().createSection(ID + ".Gathering.Lumbering");
            PlayerData.getFile().createSection(ID + ".Gathering.Lumbering.Mastery");
            PlayerData.getFile().createSection(ID + ".Gathering.Lumbering.XPMulti");
            PlayerData.getFile().set(ID + ".Gathering.Lumbering.Mastery",0);
            PlayerData.getFile().set(ID + ".Gathering.Lumbering.XPMulti",0);
            //Mining
            PlayerData.getFile().createSection(ID + ".Gathering.Mining");
            PlayerData.getFile().createSection(ID + ".Gathering.Mining.Mastery");
            PlayerData.getFile().createSection(ID + ".Gathering.Mining.XPMulti");
            PlayerData.getFile().set(ID + ".Gathering.Mining.Mastery",0);
            PlayerData.getFile().set(ID + ".Gathering.Mining.XPMulti",0);
            //Cooking
            PlayerData.getFile().createSection(ID + ".Cooking");
            PlayerData.getFile().createSection(ID + ".Cooking.Level");
            PlayerData.getFile().createSection(ID + ".Cooking.XP");
            PlayerData.getFile().createSection(ID + ".Cooking.Mastery");
            PlayerData.getFile().createSection(ID + ".Cooking.XPMulti");
            PlayerData.getFile().set(ID + ".Cooking.Level",0);
            PlayerData.getFile().set(ID + ".Cooking.XP",0);
            PlayerData.getFile().set(ID + ".Cooking.Mastery",0);
            PlayerData.getFile().set(ID + ".Cooking.XPMulti",0);
            //Alchemy
            PlayerData.getFile().createSection(ID + ".Alchemy");
            PlayerData.getFile().createSection(ID + ".Alchemy.Level");
            PlayerData.getFile().createSection(ID + ".Alchemy.XP");
            PlayerData.getFile().createSection(ID + ".Alchemy.Mastery");
            PlayerData.getFile().createSection(ID + ".Alchemy.XPMulti");
            PlayerData.getFile().set(ID + ".Alchemy.Level",0);
            PlayerData.getFile().set(ID + ".Alchemy.XP",0);
            PlayerData.getFile().set(ID + ".Alchemy.Mastery",0);
            PlayerData.getFile().set(ID + ".Alchemy.XPMulti",0);
            //Riding
            PlayerData.getFile().createSection(ID + ".Riding");
            PlayerData.getFile().createSection(ID + ".Riding.Level");
            PlayerData.getFile().createSection(ID + ".Riding.XP");
            PlayerData.getFile().createSection(ID + ".Riding.Mastery");
            PlayerData.getFile().createSection(ID + ".Riding.XPMulti");
            PlayerData.getFile().set(ID + ".Riding.Level",0);
            PlayerData.getFile().set(ID + ".Riding.XP",0);
            PlayerData.getFile().set(ID + ".Riding.Mastery",0);
            PlayerData.getFile().set(ID + ".Riding.XPMulti",0);
            //Sailing
            PlayerData.getFile().createSection(ID + ".Sailing");
            PlayerData.getFile().createSection(ID + ".Sailing.Level");
            PlayerData.getFile().createSection(ID + ".Sailing.XP");
            PlayerData.getFile().createSection(ID + ".Sailing.Mastery");
            PlayerData.getFile().createSection(ID + ".Sailing.XPMulti");
            PlayerData.getFile().set(ID + ".Sailing.Level",0);
            PlayerData.getFile().set(ID + ".Sailing.XP",0);
            PlayerData.getFile().set(ID + ".Sailing.Mastery",0);
            PlayerData.getFile().set(ID + ".Sailing.XPMulti",0);

            PlayerData.save();
        }
    }


}

