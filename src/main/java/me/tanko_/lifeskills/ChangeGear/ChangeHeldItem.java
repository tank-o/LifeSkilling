package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.Mining.Mining;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHeldItem implements Listener {

    @EventHandler
    public void ChangeItem (PlayerItemHeldEvent e){
        int LumberingMastery = 0;
        int MiningMastery = 0;
        int ButcheringMastery = 0;
        Player player = e.getPlayer();
        String ID = player.getUniqueId().toString();
        ArrayList<String> ButcherKnives = new ArrayList<>();
        ArrayList<String> Axes = new ArrayList<>();
        ArrayList<String> Pickaxes = new ArrayList<>();

        Collections.addAll(Axes, CustomTools.ApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.MasterAxe().getItemMeta().getDisplayName(), CustomTools.OneMasterAxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterAxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterAxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterAxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterAxe().getItemMeta().getDisplayName());

        Collections.addAll(Pickaxes, CustomTools.ApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticePickaxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticePickaxe().getItemMeta().getDisplayName(),
                CustomTools.MasterPickaxe().getItemMeta().getDisplayName(), CustomTools.OneMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterPickaxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterPickaxe().getItemMeta().getDisplayName());

        Collections.addAll(ButcherKnives, CustomTools.ApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.OneApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.FourApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.MasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.OneMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.TwoMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.ThreeMasterButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.FourMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.FiveMasterButcherKnife().getItemMeta().getDisplayName());

        int toolslot =  e.getNewSlot();
        ItemStack tool = player.getInventory().getItem(toolslot);

        PlayerData.getFile().set(ID + ".Gathering.Lumbering.Mastery",LumberingMastery);PlayerData.save();
        PlayerData.getFile().set(ID + ".Gathering.Butchering.Mastery",ButcheringMastery);PlayerData.save();
        PlayerData.getFile().set(ID + ".Gathering.Mining.Mastery",MiningMastery);PlayerData.save();
        PlayerData.save();
        for (int i = 0; i < Axes.size();i++) {
            if (tool != null) {
                if (tool.getItemMeta().getDisplayName().equals(Axes.get(i))) {
                    LumberingMastery = ItemMastery.ReturnMastery(tool.getItemMeta().getDisplayName());
                    PlayerData.getFile().set(ID + ".Gathering.Lumbering.Mastery", LumberingMastery);
                    PlayerData.save();
                    return;
                }
            }
        }
        player.sendMessage("Checking Butcher Knives");
        for (int i = 0; i < ButcherKnives.size();i++) {
            if (tool != null) {
                if (tool.getItemMeta().getDisplayName().equals(ButcherKnives.get(i))) {
                    ButcheringMastery = ItemMastery.ReturnMastery(tool.getItemMeta().getDisplayName());
                    PlayerData.getFile().set(ID + ".Gathering.Butchering.Mastery", ButcheringMastery);
                    PlayerData.save();
                    return;
                }
            }
        }
        player.sendMessage("Checking Pickaxes");
        for (int i = 0; i < Pickaxes.size();i++) {
            if (tool != null) {
                if (tool.getItemMeta().getDisplayName().equals(Pickaxes.get(i))) {
                    MiningMastery = ItemMastery.ReturnMastery(tool.getItemMeta().getDisplayName());
                    PlayerData.getFile().set(ID + ".Gathering.Mining.Mastery", MiningMastery);
                    PlayerData.save();
                    return;
                }
            }
        }
    }
}
