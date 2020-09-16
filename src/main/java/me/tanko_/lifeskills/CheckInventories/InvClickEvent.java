package me.tanko_.lifeskills.CheckInventories;

import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Menus.GatheringPage;
import me.tanko_.lifeskills.Menus.MainMenu;
import me.tanko_.lifeskills.Menus.LumberingProcessingMenu;
import me.tanko_.lifeskills.Menus.SkillsPage;
import org.bukkit.ChatColor;
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

        } else if (e.getView().getTitle().equalsIgnoreCase("Processing Menu")) {
            CheckProcessing.Check(player,e);
        }
        if (e.getCurrentItem().equals(OtherMaterials.SkillsMenu())) {
            e.setCancelled(true);
        }
    }
}
