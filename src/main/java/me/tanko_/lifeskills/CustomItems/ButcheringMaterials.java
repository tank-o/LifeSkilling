package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
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
        ItemStack LambMeat = new ItemStack(Material.MUTTON);
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
        ItemStack Pork = new ItemStack(Material.PORKCHOP);
        ItemMeta PorkMeta = Pork.getItemMeta();
        PorkMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Pork");
        PorkMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        PorkMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> PorkLore = new ArrayList<>();
        PorkLore.add("");
        PorkLore.add(ChatColor.GRAY + "Use this in cooking recipes");
        PorkLore.add("");;
        PorkLore.add(ChatColor.WHITE + "COMMON");
        PorkMeta.setLore(PorkLore);
        Pork.setItemMeta(PorkMeta);
        return Pork;
    }
    public static ItemStack SacredBone(){
        ItemStack SacredBone = new ItemStack(Material.BONE);
        ItemMeta SacredBoneMeta = SacredBone.getItemMeta();
        SacredBoneMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sacred Bone");
        ArrayList<String> SacredBoneLore = new ArrayList<>();
        SacredBoneLore.add("");
        SacredBoneLore.add(ChatColor.GRAY + "Use this in crafting recipes");
        SacredBoneLore.add("");;
        SacredBoneLore.add(ChatColor.GOLD + "LEGENDARY");
        SacredBoneMeta.setLore(SacredBoneLore);
        SacredBone.setItemMeta(SacredBoneMeta);
        return SacredBone;
    }
    
}
