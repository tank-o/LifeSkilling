package me.tanko_.lifeskills.inventoryChecks;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.customItems.LumberingMaterials;
import me.tanko_.lifeskills.menus.GrindingMenu;
import me.tanko_.lifeskills.menus.HeatingMenu;
import me.tanko_.lifeskills.menus.MainMenu;
import me.tanko_.lifeskills.processing.Chop;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CheckLumberingProcessing {

    public static void Check(Player player, InventoryClickEvent e){
        ItemStack item = e.getClickedInventory().getItem(e.getSlot());
        if (item.equals(MenuItems.BackButton())) {
            e.setCancelled(true);
            player.openInventory(MainMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.AcaciaPlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.AcaciaPlank());
        }else if (item.equals(MenuItems.BirchPlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.BirchPlank());
        }else if (item.equals(MenuItems.OakPlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.OakPlank());
        }else if (item.equals(MenuItems.DarkOakPlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.DarkOakPlank());
        }else if (item.equals(MenuItems.SprucePlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.SprucePlank());
        }else if (item.equals(MenuItems.JunglePlank())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.JunglePlank());
        }else if (item.equals(MenuItems.AcaciaPlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.AcaciaPlywood());
        }else if (item.equals(MenuItems.BirchPlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.BirchPlywood());
        }else if (item.equals(MenuItems.OakPlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.OakPlywood());
        }else if (item.equals(MenuItems.DarkOakPlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.DarkOakPlywood());
        }else if (item.equals(MenuItems.SprucePlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.SprucePlywood());
        }else if (item.equals(MenuItems.JunglePlywood())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.JunglePlywood());
        }else if (item.equals(MenuItems.Scantling())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.Scantling());
        }else if (item.equals(MenuItems.TimberSquare())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.TimberSquare());
        }else if (item.equals(MenuItems.ReinforcedStick())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.ReinforcedStick());
        }else if (item.equals(MenuItems.LumberManosStone())) {
            e.setCancelled(true);
            Chop.Chop(player, LumberingMaterials.LumberManosStone());
        }else if (item.equals(MenuItems.GrindingIcon())) {
            e.setCancelled(true);
            player.openInventory(GrindingMenu.CreateMenu(player));
        }else if (item.equals(MenuItems.HeatingIcon())) {
            player.openInventory(HeatingMenu.CreateMenu(player));
            e.setCancelled(true);
        } else {
            e.setCancelled(true);
        }
    }
}
