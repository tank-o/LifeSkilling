package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.Processing.Chop;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CheckProcessing {

    public static void Check(Player player, InventoryClickEvent e){
        if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD + "Back")) {
            e.setCancelled(true);
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Acacia Plank")) {
            Chop.Chop(player, LumberingMaterials.AcaciaPlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Birch Plank")) {
            Chop.Chop(player, LumberingMaterials.BirchPlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Oak Plank")) {
            Chop.Chop(player, LumberingMaterials.OakPlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Dark Oak Plank")) {
            Chop.Chop(player, LumberingMaterials.DarkOakPlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Spruce Plank")) {
            Chop.Chop(player, LumberingMaterials.SprucePlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Jungle Plank")) {
            Chop.Chop(player, LumberingMaterials.JunglePlank());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Acacia Plywood")) {
            Chop.Chop(player, LumberingMaterials.AcaciaPlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Birch Plywood")) {
            Chop.Chop(player, LumberingMaterials.BirchPlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Oak Plywood")) {
            Chop.Chop(player, LumberingMaterials.OakPlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Dark Oak Plywood")) {
            Chop.Chop(player, LumberingMaterials.DarkOakPlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Spruce Plywood")) {
            Chop.Chop(player, LumberingMaterials.SprucePlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Jungle Plywood")) {
            Chop.Chop(player, LumberingMaterials.JunglePlywood());
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding")) {
            e.setCancelled(true);
        } else {
            e.setCancelled(true);
        }
    }
}
