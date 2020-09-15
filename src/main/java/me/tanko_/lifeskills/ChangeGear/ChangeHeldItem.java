package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.Data.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHeldItem implements Listener {

    @EventHandler
    public void ChangeItem (PlayerChangedMainHandEvent e){
        int LumberingMastery = 0;
        int MiningMastery = 0;
        int ButcheringMastery = 0;
        Player player = e.getPlayer();
        String ID = player.getUniqueId().toString();
        ArrayList<String> Axes = new ArrayList<>();
        Collections.addAll(Axes, CustomTools.ApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.MasterAxe().getItemMeta().getDisplayName(), CustomTools.OneMasterAxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterAxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterAxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterAxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterAxe().getItemMeta().getDisplayName());

        ItemStack tool = player.getInventory().getItemInMainHand();

        for (int i = 0; i < Axes.size();i++) {
            if (tool.getItemMeta().getDisplayName().equals(Axes.get(i))){
                LumberingMastery = ItemMastery.ReturnMastery(tool);
                PlayerData.getFile().set(ID + ".Gathering.Lumbering.Mastery",LumberingMastery);
            }
        }

        PlayerData.save();
    }
}
