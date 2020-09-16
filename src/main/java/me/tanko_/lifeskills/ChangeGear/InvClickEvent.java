package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Menus.GatheringPage;
import me.tanko_.lifeskills.Menus.SkillsPage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvClickEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("Life Skill Menu")) {
            if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "" + ChatColor.BOLD + "Skills")) {
                player.openInventory(SkillsPage.CreateMenu(player));
            } else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Gathering")) {
                    player.openInventory(GatheringPage.CreateMenu(player));
            } else {
                e.setCancelled(true);
            }
        }
        if (e.getCurrentItem().equals(OtherMaterials.SkillsMenu())) {
            e.setCancelled(true);
        }
    }
}
