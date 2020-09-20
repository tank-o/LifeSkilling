package me.tanko_.lifeskills.OtherEvents;

import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Menus.MainMenu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InteractItem implements Listener {

    @EventHandler
    public void InteractItem(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack item = (player.getInventory().getItemInMainHand());
        if ((item != null) && (item.getType() != Material.AIR)){
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                ItemMeta itemMeta = item.getItemMeta();
                if (itemMeta.getDisplayName().equals(OtherMaterials.SkillsMenu().getItemMeta().getDisplayName())) {
                    player.openInventory(MainMenu.CreateMenu(player));
                }
            }
        }
    }
}
