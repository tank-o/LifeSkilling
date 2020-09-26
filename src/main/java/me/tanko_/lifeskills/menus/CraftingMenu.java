package me.tanko_.lifeskills.menus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class CraftingMenu {

    public static CraftingInventory CreateMenu(Player player) {
        CraftingInventory crafting = (CraftingInventory) Bukkit.createInventory(player, InventoryType.WORKBENCH);

        return crafting;
    }

}
