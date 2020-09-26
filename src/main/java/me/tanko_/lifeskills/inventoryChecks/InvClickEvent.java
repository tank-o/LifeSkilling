package me.tanko_.lifeskills.inventoryChecks;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.customItems.OtherMaterials;
import me.tanko_.lifeskills.menus.ChoppingMenu;
import me.tanko_.lifeskills.menus.HeatingMenu;
import me.tanko_.lifeskills.menus.MainMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InvClickEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack item = e.getCurrentItem();
        if (e.getView().getTitle().equalsIgnoreCase("Life Skill Menu")) {
            CheckMainMenu.Check(player,e);
        } else if (e.getView().getTitle().equalsIgnoreCase("Chopping Menu")) {
            CheckLumberingProcessing.Check(player,e);
        }else if (e.getView().getTitle().equalsIgnoreCase("Grinding Menu")) {
            CheckGrindingProcessing.Check(player,e);
        }else if (e.getView().getTitle().equalsIgnoreCase("Heating Menu")) {
            CheckHeatingProcessing.Check(player,e);
        }
        if (e.getCurrentItem() != null) {
            if (item.equals(OtherMaterials.SkillsMenu())) {
                player.openInventory(MainMenu.CreateMenu(player));
                e.setCancelled(true);
            } else if (item.equals(MenuItems.ChoppingIcon())) {
                player.openInventory(ChoppingMenu.CreateMenu(player));
            } else if (item.equals(MenuItems.HeatingIcon())) {
                player.openInventory(HeatingMenu.CreateMenu(player));
            } else if (item.equals(MenuItems.ChoppingIcon())) {
            player.openInventory(ChoppingMenu.CreateMenu(player));
            }
        }
    }
}
