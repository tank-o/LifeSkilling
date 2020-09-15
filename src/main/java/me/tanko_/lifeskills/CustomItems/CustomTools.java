package me.tanko_.lifeskills.CustomItems;

import me.tanko_.lifeskills.ChangeGear.ItemMastery;
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
        ApprenticeAxeMeta.setUnbreakable(true);
        ApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "Apprentice Axe");
        ArrayList<String> ApprenticeAxeLore = new ArrayList<String>();
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(ApprenticeAxe)));
        ApprenticeAxeLore.add(" ");
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ApprenticeAxeMeta.setLore(ApprenticeAxeLore);
        ApprenticeAxe.setItemMeta(ApprenticeAxeMeta);

        return ApprenticeAxe;
    }
    public static ItemStack OneApprenticeAxe(){
        ItemStack OneApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta OneApprenticeAxeMeta = OneApprenticeAxe.getItemMeta();
        OneApprenticeAxeMeta.setUnbreakable(true);
        OneApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪ Apprentice Axe");
        ArrayList<String> OneApprenticeAxeLore = new ArrayList<String>();
        OneApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(OneApprenticeAxe)));
        OneApprenticeAxeLore.add(" ");
        OneApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        OneApprenticeAxeMeta.setLore(OneApprenticeAxeLore);
        OneApprenticeAxe.setItemMeta(OneApprenticeAxeMeta);

        return OneApprenticeAxe;
    }
    public static ItemStack TwoApprenticeAxe(){
        ItemStack TwoApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta TwoApprenticeAxeMeta = TwoApprenticeAxe.getItemMeta();
        TwoApprenticeAxeMeta.setUnbreakable(true);
        TwoApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪ Apprentice Axe");
        ArrayList<String> TwoApprenticeAxeLore = new ArrayList<String>();
        TwoApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(TwoApprenticeAxe)));
        TwoApprenticeAxeLore.add(" ");
        TwoApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TwoApprenticeAxeMeta.setLore(TwoApprenticeAxeLore);
        TwoApprenticeAxe.setItemMeta(TwoApprenticeAxeMeta);

        return TwoApprenticeAxe;
    }
    public static ItemStack ThreeApprenticeAxe(){
        ItemStack ThreeApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta ThreeApprenticeAxeMeta = ThreeApprenticeAxe.getItemMeta();
        ThreeApprenticeAxeMeta.setUnbreakable(true);
        ThreeApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪ Apprentice Axe");
        ArrayList<String> ThreeApprenticeAxeLore = new ArrayList<String>();
        ThreeApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(ThreeApprenticeAxe)));
        ThreeApprenticeAxeLore.add(" ");
        ThreeApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ThreeApprenticeAxeMeta.setLore(ThreeApprenticeAxeLore);
        ThreeApprenticeAxe.setItemMeta(ThreeApprenticeAxeMeta);

        return ThreeApprenticeAxe;
    }
    public static ItemStack FourApprenticeAxe(){
        ItemStack FourApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta FourApprenticeAxeMeta = FourApprenticeAxe.getItemMeta();
        FourApprenticeAxeMeta.setUnbreakable(true);
        FourApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD +"✪✪✪✪ Apprentice Axe");
        ArrayList<String> FourApprenticeAxeLore = new ArrayList<String>();
        FourApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(FourApprenticeAxe)));
        FourApprenticeAxeLore.add(" ");
        FourApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FourApprenticeAxeMeta.setLore(FourApprenticeAxeLore);
        FourApprenticeAxe.setItemMeta(FourApprenticeAxeMeta);

        return FourApprenticeAxe;
    }
    public static ItemStack FiveApprenticeAxe(){
        ItemStack FiveApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta FiveApprenticeAxeMeta = FiveApprenticeAxe.getItemMeta();
        FiveApprenticeAxeMeta.setUnbreakable(true);
        FiveApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪✪ Apprentice Axe");
        ArrayList<String> FiveApprenticeAxeLore = new ArrayList<String>();
        FiveApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(FiveApprenticeAxe)));
        FiveApprenticeAxeLore.add(" ");
        FiveApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FiveApprenticeAxeMeta.setLore(FiveApprenticeAxeLore);
        FiveApprenticeAxe.setItemMeta(FiveApprenticeAxeMeta);

        return FiveApprenticeAxe;
    }
    
    public static ItemStack MasterAxe(){
        ItemStack MasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta MasterAxeMeta = MasterAxe.getItemMeta();
        MasterAxeMeta.setUnbreakable(true);
        MasterAxeMeta.setDisplayName(ChatColor.GOLD + "Master Axe");
        ArrayList<String> MasterAxeLore = new ArrayList<String>();
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(MasterAxe)));
        MasterAxeLore.add(" ");
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        MasterAxeMeta.setLore(MasterAxeLore);
        MasterAxe.setItemMeta(MasterAxeMeta);

        return MasterAxe;
    }
    public static ItemStack OneMasterAxe(){
        ItemStack OneMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta OneMasterAxeMeta = OneMasterAxe.getItemMeta();
        OneMasterAxeMeta.setUnbreakable(true);
        OneMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪ Master Axe");
        ArrayList<String> OneMasterAxeLore = new ArrayList<String>();
        OneMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(OneMasterAxe)));
        OneMasterAxeLore.add(" ");
        OneMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        OneMasterAxeMeta.setLore(OneMasterAxeLore);
        OneMasterAxe.setItemMeta(OneMasterAxeMeta);

        return OneMasterAxe;
    }
    public static ItemStack TwoMasterAxe(){
        ItemStack TwoMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta TwoMasterAxeMeta = TwoMasterAxe.getItemMeta();
        TwoMasterAxeMeta.setUnbreakable(true);
        TwoMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪ Master Axe");
        ArrayList<String> TwoMasterAxeLore = new ArrayList<String>();
        TwoMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(TwoMasterAxe)));
        TwoMasterAxeLore.add(" ");
        TwoMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TwoMasterAxeMeta.setLore(TwoMasterAxeLore);
        TwoMasterAxe.setItemMeta(TwoMasterAxeMeta);

        return TwoMasterAxe;
    }
    public static ItemStack ThreeMasterAxe(){
        ItemStack ThreeMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta ThreeMasterAxeMeta = ThreeMasterAxe.getItemMeta();
        ThreeMasterAxeMeta.setUnbreakable(true);
        ThreeMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪ Master Axe");
        ArrayList<String> ThreeMasterAxeLore = new ArrayList<String>();
        ThreeMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + (ItemMastery.ReturnMastery(ThreeMasterAxe)));
        ThreeMasterAxeLore.add(" ");
        ThreeMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        ThreeMasterAxeMeta.setLore(ThreeMasterAxeLore);
        ThreeMasterAxe.setItemMeta(ThreeMasterAxeMeta);

        return ThreeMasterAxe;
    }
    public static ItemStack FourMasterAxe(){
        ItemStack FourMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta FourMasterAxeMeta = FourMasterAxe.getItemMeta();
        FourMasterAxeMeta.setUnbreakable(true);
        FourMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD +"✪✪✪✪ Master Axe");
        ArrayList<String> FourMasterAxeLore = new ArrayList<String>();
        FourMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + ItemMastery.ReturnMastery(FourMasterAxe));
        FourMasterAxeLore.add(" ");
        FourMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FourMasterAxeMeta.setLore(FourMasterAxeLore);
        FourMasterAxe.setItemMeta(FourMasterAxeMeta);

        return FourMasterAxe;
    }
    public static ItemStack FiveMasterAxe(){
        ItemStack FiveMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta FiveMasterAxeMeta = FiveMasterAxe.getItemMeta();
        FiveMasterAxeMeta.setUnbreakable(true);
        FiveMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪✪ Master Axe");
        ArrayList<String> FiveMasterAxeLore = new ArrayList<String>();
        FiveMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + ItemMastery.ReturnMastery(FiveMasterAxe));
        FiveMasterAxeLore.add(" ");
        FiveMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FiveMasterAxeMeta.setLore(FiveMasterAxeLore);
        FiveMasterAxe.setItemMeta(FiveMasterAxeMeta);

        return FiveMasterAxe;
    }
    
}
