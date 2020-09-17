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
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.AcaciaPlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Birch Plank")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.BirchPlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Oak Plank")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.OakPlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Dark Oak Plank")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.DarkOakPlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Spruce Plank")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.SprucePlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Jungle Plank")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.JunglePlank());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Acacia Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.AcaciaPlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Birch Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.BirchPlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Oak Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.OakPlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Dark Oak Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.DarkOakPlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Spruce Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.SprucePlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Jungle Plywood")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.JunglePlywood());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Scantling")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.Scantling());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Timber Square")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.TimberSquare());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Reinforced Stick")) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.ReinforcedStick());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding")) {
            e.setCancelled(true);
        } else {
            e.setCancelled(true);
        }
    }
}
