package me.tanko_.lifeskills.Processing;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Chop {

    public static void Chop(Player player, ItemStack Result){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (Result.equals(LumberingMaterials.OakPlank())){
           RemoveItems(player,LumberingMaterials.OakTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlank"),Result);
        } else if (Result.equals(LumberingMaterials.JunglePlank())){
            RemoveItems(player,LumberingMaterials.JungleTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.JunglePlank"),Result);
        } else if (Result.equals(LumberingMaterials.SprucePlank())){
            RemoveItems(player,LumberingMaterials.SpruceTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.SprucePlank"),Result);
        } else if (Result.equals(LumberingMaterials.DarkOakPlank())){
            RemoveItems(player,LumberingMaterials.DarkOakTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.DarkOakPlank"),Result);
        } else if (Result.equals(LumberingMaterials.BirchPlank())){
            RemoveItems(player,LumberingMaterials.BirchTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.BirchPlank"),Result);
        } else if (Result.equals(LumberingMaterials.AcaciaPlank())){
            RemoveItems(player,LumberingMaterials.AcaciaTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.AcaciaPlank"),Result);
        } else if (Result.equals(LumberingMaterials.AcaciaPlywood())){
            RemoveItems(player,LumberingMaterials.AcaciaPlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.AcaciaPlywood"),Result);
        } else if (Result.equals(LumberingMaterials.BirchPlywood())){
            RemoveItems(player,LumberingMaterials.BirchPlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.BirchPlywood"),Result);
        } else if (Result.equals(LumberingMaterials.OakPlywood())){
            RemoveItems(player,LumberingMaterials.OakPlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlywood"),Result);
        } else if (Result.equals(LumberingMaterials.JunglePlywood())){
            RemoveItems(player,LumberingMaterials.JunglePlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.JunglePlywood"),Result);
        } else if (Result.equals(LumberingMaterials.SprucePlywood())){
            RemoveItems(player,LumberingMaterials.SprucePlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.SprucePlywood"),Result);
        } else if (Result.equals(LumberingMaterials.DarkOakPlywood())){
            RemoveItems(player,LumberingMaterials.DarkOakPlank(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.DarkOakPlywood"),Result);
        }
    }
    private static void RemoveItems(Player player,ItemStack item,int amount,ItemStack Result){
        for (int i = 0;i < player.getInventory().getSize(); i++){
            if (player.getInventory().getItem(i) != null) {
                if (player.getInventory().getItem(i).isSimilar(item)) {
                    if (player.getInventory().getItem(i).getAmount() >= amount) {
                        player.getInventory().getItem(i).setAmount(player.getInventory().getItem(i).getAmount() - amount);
                        player.getInventory().addItem(Result);
                        return;
                    }
                }
            }
        }
    }
}
