package me.tanko_.lifeskills.inventoryChecks;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.customItems.MiningMaterials;
import me.tanko_.lifeskills.menus.HeatingMenu;
import me.tanko_.lifeskills.menus.ChoppingMenu;
import me.tanko_.lifeskills.menus.MainMenu;
import me.tanko_.lifeskills.processing.Grinding;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CheckGrindingProcessing {
    public static void Check(Player player, InventoryClickEvent e){
        ItemStack item = e.getClickedInventory().getItem(e.getSlot());
        e.setCancelled(true);
        if (item.equals(MenuItems.BackButton())) {
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.StoneSlab())) {
            Grinding.Grind(player, MiningMaterials.StoneSlab());
        }
    }
}
