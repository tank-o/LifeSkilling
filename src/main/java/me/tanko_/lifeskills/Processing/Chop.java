package me.tanko_.lifeskills.Processing;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.LifeSkills;
import me.tanko_.lifeskills.Lumbering.Lumbering;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.ArrayList;
import java.util.HashMap;


public class Chop {

    public static void Chop(Player player, ItemStack Result){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        HashMap<ItemStack,Integer> ingredients = new HashMap<>();
        if (Result.equals(LumberingMaterials.OakPlank())){
            ingredients.put(LumberingMaterials.OakTimber(),plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlank"));
           RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.JunglePlank())){

        } else if (Result.equals(LumberingMaterials.SprucePlank())){

        } else if (Result.equals(LumberingMaterials.DarkOakPlank())){

        } else if (Result.equals(LumberingMaterials.BirchPlank())){

        } else if (Result.equals(LumberingMaterials.AcaciaPlank())){

        } else if (Result.equals(LumberingMaterials.AcaciaPlywood())){

        } else if (Result.equals(LumberingMaterials.BirchPlywood())){

        } else if (Result.equals(LumberingMaterials.OakPlywood())){

        } else if (Result.equals(LumberingMaterials.JunglePlywood())){

        } else if (Result.equals(LumberingMaterials.SprucePlywood())){

        } else if (Result.equals(LumberingMaterials.DarkOakPlywood())){

        }
    }
    private static void RemoveItems(Player player,HashMap<ItemStack,Integer> ingredients,ItemStack Result){
        LifeSkills plugin = LifeSkills.getPlugin(LifeSkills.class);
        int found = 0;
        HashMap<ItemStack,Integer> itemLocations = new HashMap<>();
        for (int i = 0;i < player.getInventory().getSize();i++){
            for (ItemStack k : ingredients.keySet()){
                System.out.println("Comparing " + k.getItemMeta().getDisplayName() + " and " + player.getInventory().getItem(i).getItemMeta().getDisplayName());
                if ((player.getInventory().getItem(i) != null) && (player.getInventory().getItem(i).isSimilar(k))){
                    player.sendMessage(k.getItemMeta().getDisplayName());
                    if (player.getInventory().getItem(i).getAmount() >= ingredients.get(k)){
                        found = found + 1;
                        player.sendMessage("found an ingredient");
                        itemLocations.put(k,i);
                        if (found == ingredients.size()){
                            for (ItemStack j : itemLocations.keySet()){
                                player.getInventory().getItem(itemLocations.get(j)).setAmount(player.getInventory().getItem(itemLocations.get(j)).getAmount() - ingredients.get(j));
                            }
                            player.getInventory().addItem(Result);
                        }
                    }
                }
            }
        }
    }
}
