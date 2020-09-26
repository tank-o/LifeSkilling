package me.tanko_.lifeskills.events;

import me.tanko_.lifeskills.customItems.OtherMaterials;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemDropEvent implements Listener {

    @EventHandler
    public void DropItem(PlayerDropItemEvent e){
        Player player = e.getPlayer();
        String Menu = OtherMaterials.SkillsMenu().getItemMeta().getDisplayName();
        if (e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(Menu)){
            e.setCancelled(true);
        }
    }
}
