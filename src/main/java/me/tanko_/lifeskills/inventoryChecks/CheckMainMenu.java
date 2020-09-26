package me.tanko_.lifeskills.inventoryChecks;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.menus.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.awt.*;

public class CheckMainMenu {

    public static void Check(Player player, InventoryClickEvent e){
        ItemStack item = e.getClickedInventory().getItem(e.getSlot());
        e.setCancelled(true);
        if (item.equals(MenuItems.SkillIcon())) {
            player.openInventory(SkillsPage.CreateMenu(player));
        } else if (item.equals(MenuItems.ProcessingIcon())) {
            player.openInventory(ChoppingMenu.CreateMenu(player));
        } else if (item.equals(MenuItems.GatheringIcon(player))) {
            player.openInventory(GatheringMenu.CreateMenu(player));
        } else if (item.equals(MenuItems.BackButton())) {
            player.openInventory(MainMenu.CreateMenu(player));
        } else if (item.equals(MenuItems.CraftingIcon())) {
            player.openWorkbench(null,true);
        }
    }
}
