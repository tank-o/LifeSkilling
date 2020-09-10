package me.tanko_.lifeskills.ChangeGear;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ChangeArmour implements Listener {
    @EventHandler
    public void ChangeArmour(InventoryClickEvent e){
        int Mastery = 0;
        Player player = (Player) e.getWhoClicked();
        int slotClicked = e.getSlot();
        if ((slotClicked >= 100) && (slotClicked <= 103)){


        }

    }
}
