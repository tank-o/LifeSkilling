package me.tanko_.lifeskills.Processing;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.CustomItems.OtherMaterials;
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
            ingredients.put(LumberingMaterials.OakTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.JunglePlank())){
            ingredients.put(LumberingMaterials.JungleTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.SprucePlank())){
            ingredients.put(LumberingMaterials.SpruceTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.DarkOakPlank())){
            ingredients.put(LumberingMaterials.DarkOakTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.BirchPlank())){
            ingredients.put(LumberingMaterials.BirchTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.AcaciaPlank())){
            ingredients.put(LumberingMaterials.AcaciaTimber(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.AcaciaPlywood())){
            ingredients.put(LumberingMaterials.AcaciaPlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.BirchPlywood())){
            ingredients.put(LumberingMaterials.BirchPlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.OakPlywood())){
            ingredients.put(LumberingMaterials.OakPlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.JunglePlywood())){
            ingredients.put(LumberingMaterials.JunglePlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.SprucePlywood())){
            ingredients.put(LumberingMaterials.SprucePlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.DarkOakPlywood())){
            ingredients.put(LumberingMaterials.DarkOakPlank(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.ReinforcedStick())){
            ingredients.put(LumberingMaterials.TimberSquare(),30);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.Scantling())){
            ingredients.put(LumberingMaterials.Log(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.TimberSquare())){
            ingredients.put(LumberingMaterials.Scantling(),10);
            RemoveItems(player,ingredients,Result);
        } else if (Result.equals(LumberingMaterials.LumberManosStone())){
            ingredients.put(OtherMaterials.ManosFragment(),10);
            ingredients.put(LumberingMaterials.LumberCore(),1);
            RemoveItems(player,ingredients,Result);
        }
    }
    private static void RemoveItems(Player player,HashMap<ItemStack,Integer> ingredients,ItemStack Result){
        LifeSkills plugin = LifeSkills.getPlugin(LifeSkills.class);
        int found = 0;
        HashMap<ItemStack,Integer> itemLocations = new HashMap<>();
        for (int i = 0;i < player.getInventory().getSize();i++){
            for (ItemStack k : ingredients.keySet()){
                if ((player.getInventory().getItem(i) != null) && (player.getInventory().getItem(i).isSimilar(k))){
                    if (player.getInventory().getItem(i).getAmount() >= ingredients.get(k)){
                        found = found + 1;
                        itemLocations.put(k,i);
                        if (found == ingredients.size()){
                            for (ItemStack j : itemLocations.keySet()){
                                player.getInventory().getItem(itemLocations.get(j)).setAmount(player.getInventory().getItem(itemLocations.get(j)).getAmount() - ingredients.get(j));
                            }
                            player.getInventory().addItem(Result);
                        }
                    } else {
                        player.sendMessage(ChatColor.RED + "You do not have enough materials to craft this");
                    }
                }
            }
        }
    }
}
