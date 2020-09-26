package me.tanko_.lifeskills.events;

import me.tanko_.lifeskills.customItems.OtherMaterials;
import me.tanko_.lifeskills.menus.MainMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class InteractItem implements Listener {

    @EventHandler
    public void InteractItem(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack item = (player.getInventory().getItemInMainHand());
        if ((item != null) && (item.getType() != Material.AIR)){
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                if (item.equals(OtherMaterials.SkillsMenu())) {
                    player.openInventory(MainMenu.CreateMenu(player));
                }
            } else if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                Block block = e.getClickedBlock();

            }
        }
    }
}
