package me.tanko_.lifeskills.processing;

import me.tanko_.lifeskills.customItems.MiningMaterials;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;


public class Grinding {

    public static void Grind(Player player, ItemStack Result){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        HashMap<ItemStack,Integer> ingredients = new HashMap<>();
        if (Result.equals(MiningMaterials.StoneSlab())){
            ingredients.put(MiningMaterials.RoughStone(),64);
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
