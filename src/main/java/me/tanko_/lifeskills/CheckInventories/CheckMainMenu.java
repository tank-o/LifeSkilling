package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.Menus.GatheringPage;
import me.tanko_.lifeskills.Menus.LumberingProcessingMenu;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.Menus.SkillsPage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CheckMainMenu {

    public static void Check(Player player, InventoryClickEvent e){
        if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "" + ChatColor.BOLD + "Skills")) {
            player.openInventory(SkillsPage.CreateMenu(player));
        } else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "" + ChatColor.BOLD + "Processing")) {
            player.openInventory(LumberingProcessingMenu.CreateMenu(player));
        } else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Gathering")) {
            player.openInventory(GatheringPage.CreateMenu(player));
        } else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD + "Back")) {
            player.openInventory(MainMenu.CreateMenu(player));
        }else {
            e.setCancelled(true);
        }
    }
}
