package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.CustomItems.MiningMaterials;
import me.tanko_.lifeskills.Menus.GrindingProcessingMenu;
import me.tanko_.lifeskills.Menus.LumberingProcessingMenu;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.Processing.Heating;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CheckHeatingProcessing {

    public static void Check(Player player, InventoryClickEvent e){
        if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD + "Back")) {
            e.setCancelled(true);
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Iron Fragment")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.IronFragment());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Copper Fragment")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.CopperFragment());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Gold Fragment")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.GoldFragment());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Iron Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.IronIngot());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Copper Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.CopperIngot());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.BLUE + "" + ChatColor.BOLD + "Gold Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.GoldIngot());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Refined Iron Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.RefinedIron());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Refined Copper Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.RefinedCopper());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Refined Scraps")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.MixedRefinedScrap());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Mixed Refined Ingot")) {
            e.setCancelled(true);
            Heating.Heat(player, MiningMaterials.RefinedIngot());
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding")) {
            player.openInventory(GrindingProcessingMenu.CreateMenu(player));
            e.setCancelled(true);
        }else if (e.getClickedInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Chopping")) {
            player.openInventory(LumberingProcessingMenu.CreateMenu(player));
            e.setCancelled(true);
        }else {
            e.setCancelled(true);
        }
    }
}
