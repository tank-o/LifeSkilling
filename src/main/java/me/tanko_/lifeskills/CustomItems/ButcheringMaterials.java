package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ButcheringMaterials {

    public static ItemStack WolfMeat(){
        ItemStack WolfMeat = new ItemStack(Material.BEEF);
        ItemMeta WolfMeatMeta = WolfMeat.getItemMeta();
        WolfMeatMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Wolf Meat");
        ArrayList<String> WolfMeatLore = new ArrayList<>();
        WolfMeatLore.add("");
        WolfMeatLore.add(ChatColor.GRAY + "Use this in cooking recipes");
        WolfMeatLore.add("");;
        WolfMeatLore.add(ChatColor.WHITE + "COMMON");
        WolfMeatMeta.setLore(WolfMeatLore);
        WolfMeat.setItemMeta(WolfMeatMeta);
        return WolfMeat;
    }
    public static ItemStack LambMeat(){
        ItemStack LambMeat = new ItemStack(Material.BEEF);
        ItemMeta LambMeatMeta = LambMeat.getItemMeta();
        LambMeatMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lamb Meat");
        ArrayList<String> LambMeatLore = new ArrayList<>();
        LambMeatLore.add("");
        LambMeatLore.add(ChatColor.GRAY + "Use this in cooking recipes");
        LambMeatLore.add("");;
        LambMeatLore.add(ChatColor.WHITE + "COMMON");
        LambMeatMeta.setLore(LambMeatLore);
        LambMeat.setItemMeta(LambMeatMeta);
        return LambMeat;
    }
    public static ItemStack Pork(){
        ItemStack Pork = new ItemStack(Material.BEEF);
        ItemMeta PorkMeta = Pork.getItemMeta();
        PorkMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Pork");
        ArrayList<String> PorkLore = new ArrayList<>();
        PorkLore.add("");
        PorkLore.add(ChatColor.GRAY + "Use this in cooking recipes");
        PorkLore.add("");;
        PorkLore.add(ChatColor.WHITE + "COMMON");
        PorkMeta.setLore(PorkLore);
        Pork.setItemMeta(PorkMeta);
        return Pork;
    }
}
