package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Menus.MainMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvClickEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

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
            if (e.getCurrentItem().equals(OtherMaterials.SkillsMenu())) {
                player.openInventory(MainMenu.CreateMenu(player));
                e.setCancelled(true);
            }
        }
    }
}
