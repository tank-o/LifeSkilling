package me.tanko_.lifeskills.inventoryChecks;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.customItems.MiningMaterials;
import me.tanko_.lifeskills.menus.GrindingMenu;
import me.tanko_.lifeskills.menus.ChoppingMenu;
import me.tanko_.lifeskills.menus.MainMenu;
import me.tanko_.lifeskills.processing.Heating;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CheckHeatingProcessing {

    public static void Check(Player player, InventoryClickEvent e){
        ItemStack item = e.getClickedInventory().getItem(e.getSlot());
        e.setCancelled(true);
        if (item.equals(MenuItems.BackButton())) {
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.IronFragment())) {
            Heating.Heat(player, MiningMaterials.IronFragment());
        }else if (item.equals(MenuItems.CopperFragment())) {
            Heating.Heat(player, MiningMaterials.CopperFragment());
        }else if (item.equals(MenuItems.GoldFragment())){
            Heating.Heat(player, MiningMaterials.GoldFragment());
        }else if (item.equals(MenuItems.IronIngot())) {
            Heating.Heat(player, MiningMaterials.IronIngot());
        }else if (item.equals(MenuItems.CopperIngot())) {
            Heating.Heat(player, MiningMaterials.CopperIngot());
        }else if (item.equals(MenuItems.GoldIngot())) {
            Heating.Heat(player, MiningMaterials.GoldIngot());
        }else if (item.equals(MenuItems.RefinedIron())) {
            Heating.Heat(player, MiningMaterials.RefinedIron());
        }else if (item.equals(MenuItems.RefinedCopper())) {
            Heating.Heat(player, MiningMaterials.RefinedCopper());
        }else if (item.equals(MenuItems.MixedRefinedScrap())) {
            Heating.Heat(player, MiningMaterials.MixedRefinedScrap());
        }else if (item.equals(MenuItems.RefinedIngot())) {
            Heating.Heat(player, MiningMaterials.RefinedIngot());
        }else if (item.equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding")) {
            player.openInventory(GrindingMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.ChoppingIcon())) {
            player.openInventory(ChoppingMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.GrindingIcon())) {
            player.openInventory(GrindingMenu.CreateMenu(player));
        }
    }
}
