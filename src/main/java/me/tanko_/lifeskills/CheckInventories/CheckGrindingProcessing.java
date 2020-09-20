package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.CustomItems.MiningMaterials;
import me.tanko_.lifeskills.Menus.GrindingProcessingMenu;
import me.tanko_.lifeskills.Menus.HeatingProcessingMenu;
import me.tanko_.lifeskills.Menus.LumberingProcessingMenu;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.Processing.Chop;
import me.tanko_.lifeskills.Processing.Grinding;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CheckGrindingProcessing {

    public static void Check(Player player, InventoryClickEvent e){
        if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD + "Back")) {
            e.setCancelled(true);
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Stone Slab")) {
            e.setCancelled(true);
            Grinding.Grind(player, MiningMaterials.StoneSlab());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Chopping")) {
            player.openInventory(LumberingProcessingMenu.CreateMenu(player));
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Heating")) {
            player.openInventory(HeatingProcessingMenu.CreateMenu(player));
            e.setCancelled(true);
        }else {
            e.setCancelled(true);
        }
    }
}
