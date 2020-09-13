package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.Data.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ChangeArmour implements Listener {
    @EventHandler
    public void ChangeArmour(InventoryClickEvent e){
        int Mastery = 0;
        Player player = (Player) e.getWhoClicked();
        String ID = player.getUniqueId().toString();
        int slotClicked = e.getSlot();
        if ((slotClicked >= 100) && (slotClicked <= 103)){
            ItemStack armour = player.getInventory().getItem(slotClicked);
            Mastery = ItemMastery.ReturnMastery(armour);
        }
        PlayerData.getFile().set(ID + ".Mastery",Mastery);

    }
}
