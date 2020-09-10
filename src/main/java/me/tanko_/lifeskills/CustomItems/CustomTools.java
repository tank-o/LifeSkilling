package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class CustomTools {

    //Lumbering Items
    //Tools
    public static ItemStack ApprenticeAxe(){
        ItemStack ApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta ApprenticeAxeMeta = ApprenticeAxe.getItemMeta();
        ApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "Master Axe");
        ArrayList<String> ApprenticeAxeLore = new ArrayList<String>();
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 25");
        ApprenticeAxeLore.add(" ");
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ApprenticeAxeMeta.setLore(ApprenticeAxeLore);
        ApprenticeAxe.setItemMeta(ApprenticeAxeMeta);

        return ApprenticeAxe;
    }
    public static ItemStack PRIApprenticeAxe(){
        ItemStack PRIApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta PRIApprenticeAxeMeta = PRIApprenticeAxe.getItemMeta();
        PRIApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> PRIApprenticeAxeLore = new ArrayList<String>();
        PRIApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 50");
        PRIApprenticeAxeLore.add(" ");
        PRIApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        PRIApprenticeAxeMeta.setLore(PRIApprenticeAxeLore);
        PRIApprenticeAxe.setItemMeta(PRIApprenticeAxeMeta);

        return PRIApprenticeAxe;
    }
    public static ItemStack DUOApprenticeAxe(){
        ItemStack DUOApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta DUOApprenticeAxeMeta = DUOApprenticeAxe.getItemMeta();
        DUOApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> DUOApprenticeAxeLore = new ArrayList<String>();
        DUOApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 100");
        DUOApprenticeAxeLore.add(" ");
        DUOApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        DUOApprenticeAxeMeta.setLore(DUOApprenticeAxeLore);
        DUOApprenticeAxe.setItemMeta(DUOApprenticeAxeMeta);

        return DUOApprenticeAxe;
    }
    public static ItemStack TRIApprenticeAxe(){
        ItemStack TRIApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta TRIApprenticeAxeMeta = TRIApprenticeAxe.getItemMeta();
        TRIApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> TRIApprenticeAxeLore = new ArrayList<String>();
        TRIApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 150");
        TRIApprenticeAxeLore.add(" ");
        TRIApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TRIApprenticeAxeMeta.setLore(TRIApprenticeAxeLore);
        TRIApprenticeAxe.setItemMeta(TRIApprenticeAxeMeta);

        return TRIApprenticeAxe;
    }
    public static ItemStack TETApprenticeAxe(){
        ItemStack TETApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta TETApprenticeAxeMeta = TETApprenticeAxe.getItemMeta();
        TETApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD +"Master Axe");
        ArrayList<String> TETApprenticeAxeLore = new ArrayList<String>();
        TETApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 200");
        TETApprenticeAxeLore.add(" ");
        TETApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TETApprenticeAxeMeta.setLore(TETApprenticeAxeLore);
        TETApprenticeAxe.setItemMeta(TETApprenticeAxeMeta);

        return TETApprenticeAxe;
    }
    public static ItemStack PENApprenticeAxe(){
        ItemStack PENApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta PENApprenticeAxeMeta = PENApprenticeAxe.getItemMeta();
        PENApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> PENApprenticeAxeLore = new ArrayList<String>();
        PENApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 240");
        PENApprenticeAxeLore.add(" ");
        PENApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        PENApprenticeAxeMeta.setLore(PENApprenticeAxeLore);
        PENApprenticeAxe.setItemMeta(PENApprenticeAxeMeta);

        return PENApprenticeAxe;
    }
    
    public static ItemStack MasterAxe(){
        ItemStack MasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta MasterAxeMeta = MasterAxe.getItemMeta();
        MasterAxeMeta.setDisplayName(ChatColor.GOLD + "Master Axe");
        ArrayList<String> MasterAxeLore = new ArrayList<String>();
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 40");
        MasterAxeLore.add(" ");
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        MasterAxeMeta.setLore(MasterAxeLore);
        MasterAxe.setItemMeta(MasterAxeMeta);

        return MasterAxe;
    }
    public static ItemStack PRIMasterAxe(){
        ItemStack PRIMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta PRIMasterAxeMeta = PRIMasterAxe.getItemMeta();
        PRIMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> PRIMasterAxeLore = new ArrayList<String>();
        PRIMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 80");
        PRIMasterAxeLore.add(" ");
        PRIMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        PRIMasterAxeMeta.setLore(PRIMasterAxeLore);
        PRIMasterAxe.setItemMeta(PRIMasterAxeMeta);

        return PRIMasterAxe;
    }
    public static ItemStack DUOMasterAxe(){
        ItemStack DUOMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta DUOMasterAxeMeta = DUOMasterAxe.getItemMeta();
        DUOMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> DUOMasterAxeLore = new ArrayList<String>();
        DUOMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 140");
        DUOMasterAxeLore.add(" ");
        DUOMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        DUOMasterAxeMeta.setLore(DUOMasterAxeLore);
        DUOMasterAxe.setItemMeta(DUOMasterAxeMeta);

        return DUOMasterAxe;
    }
    public static ItemStack TRIMasterAxe(){
        ItemStack TRIMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta TRIMasterAxeMeta = TRIMasterAxe.getItemMeta();
        TRIMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> TRIMasterAxeLore = new ArrayList<String>();
        TRIMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 220");
        TRIMasterAxeLore.add(" ");
        TRIMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TRIMasterAxeMeta.setLore(TRIMasterAxeLore);
        TRIMasterAxe.setItemMeta(TRIMasterAxeMeta);

        return TRIMasterAxe;
    }
    public static ItemStack TETMasterAxe(){
        ItemStack TETMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta TETMasterAxeMeta = TETMasterAxe.getItemMeta();
        TETMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD +"Master Axe");
        ArrayList<String> TETMasterAxeLore = new ArrayList<String>();
        TETMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 300");
        TETMasterAxeLore.add(" ");
        TETMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TETMasterAxeMeta.setLore(TETMasterAxeLore);
        TETMasterAxe.setItemMeta(TETMasterAxeMeta);

        return TETMasterAxe;
    }
    public static ItemStack PENMasterAxe(){
        ItemStack PENMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta PENMasterAxeMeta = PENMasterAxe.getItemMeta();
        PENMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Master Axe");
        ArrayList<String> PENMasterAxeLore = new ArrayList<String>();
        PENMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: 400");
        PENMasterAxeLore.add(" ");
        PENMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        PENMasterAxeMeta.setLore(PENMasterAxeLore);
        PENMasterAxe.setItemMeta(PENMasterAxeMeta);

        return PENMasterAxe;
    }
    
}
