package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CustomTools {


    public static ItemStack ManosAxe(){
        ItemStack ManosAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta ManosAxeMeta = ManosAxe.getItemMeta();
        ManosAxeMeta.setDisplayName(ChatColor.GOLD + "Master Axe");
        ArrayList<String> ManosAxeLore = new ArrayList<String>();
        ManosAxeLore.add(ChatColor.GRAY + "Mastery: 50");
        ManosAxeLore.add(" ");
        ManosAxeLore.add(ChatColor.GRAY + "Gathering XP Boost: 5%");
        ManosAxeMeta.setLore(ManosAxeLore);
        ManosAxe.setItemMeta(ManosAxeMeta);

        return ManosAxe;
    }
}
