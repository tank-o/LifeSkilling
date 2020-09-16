package me.tanko_.lifeskills.OtherEvents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {


    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player player = e.getEntity();
        e.setKeepInventory(true);
    }
}
