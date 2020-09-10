package me.tanko_.lifeskills.CustomItems;

import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class CustomArmour {
    public static ItemStack MasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta MasterHelmetMeta = (LeatherArmorMeta) MasterHelmet.getItemMeta();
        MasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet");
        MasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterHelmetLore = new ArrayList<String>();
        MasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.Base"));
        return MasterHelmet;
    }
    public static ItemStack MasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta MasterChestPlateMeta = (LeatherArmorMeta) MasterChestPlate.getItemMeta();
        MasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master ChestPlate");
        MasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterChestPlateLore = new ArrayList<String>();
        MasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.Base"));
        return MasterChestPlate;
    }
    public static ItemStack MasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta MasterLeggingsMeta = (LeatherArmorMeta) MasterLeggings.getItemMeta();
        MasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings");
        MasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterLeggingsLore = new ArrayList<String>();
        MasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.Base"));
        return MasterLeggings;
    }
    public static ItemStack MasterBoots(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta MasterBootsMeta = (LeatherArmorMeta) MasterBoots.getItemMeta();
        MasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots");
        MasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterBootsLore = new ArrayList<String>();
        MasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.Base"));
        return MasterBoots;
        
    }
    public static ItemStack OneMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneMasterHelmetMeta = (LeatherArmorMeta) OneMasterHelmet.getItemMeta();
        OneMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪");
        OneMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterHelmetLore = new ArrayList<String>();
        OneMasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.1Star"));
        return OneMasterHelmet;
    }
    public static ItemStack OneMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneMasterChestPlateMeta = (LeatherArmorMeta) OneMasterChestPlate.getItemMeta();
        OneMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪");
        OneMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterChestPlateLore = new ArrayList<String>();
        OneMasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.1Star"));
        return OneMasterChestPlate;
    }
    public static ItemStack OneMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneMasterLeggingsMeta = (LeatherArmorMeta) OneMasterLeggings.getItemMeta();
        OneMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪");
        OneMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterLeggingsLore = new ArrayList<String>();
        OneMasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.1Star"));
        return OneMasterLeggings;
    }
    public static ItemStack OneMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneMasterBootsMeta = (LeatherArmorMeta) OneMasterBoots.getItemMeta();
        OneMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪");
        OneMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterBootsLore = new ArrayList<String>();
        OneMasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.1Star"));
        return OneMasterBoots;
    }
    public static ItemStack TwoMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoMasterHelmetMeta = (LeatherArmorMeta) TwoMasterHelmet.getItemMeta();
        TwoMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪");
        TwoMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterHelmetLore = new ArrayList<String>();
        TwoMasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.2Star"));
        return TwoMasterHelmet;
    }
    public static ItemStack TwoMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoMasterChestPlateMeta = (LeatherArmorMeta) TwoMasterChestPlate.getItemMeta();
        TwoMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪✪");
        TwoMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterChestPlateLore = new ArrayList<String>();
        TwoMasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.2Star"));
        return TwoMasterChestPlate;
    }
    public static ItemStack TwoMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoMasterLeggingsMeta = (LeatherArmorMeta) TwoMasterLeggings.getItemMeta();
        TwoMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪");
        TwoMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterLeggingsLore = new ArrayList<String>();
        TwoMasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.2Star"));
        return TwoMasterLeggings;
    }
    public static ItemStack TwoMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoMasterBootsMeta = (LeatherArmorMeta) TwoMasterBoots.getItemMeta();
        TwoMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪");
        TwoMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterBootsLore = new ArrayList<String>();
        TwoMasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.2Star"));
        return TwoMasterBoots;
    }
    public static ItemStack ThreeMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeMasterHelmetMeta = (LeatherArmorMeta) ThreeMasterHelmet.getItemMeta();
        ThreeMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪");
        ThreeMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterHelmetLore = new ArrayList<String>();
        ThreeMasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.3Star"));
        return ThreeMasterHelmet;
    }
    public static ItemStack ThreeMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeMasterChestPlateMeta = (LeatherArmorMeta) ThreeMasterChestPlate.getItemMeta();
        ThreeMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪✪✪");
        ThreeMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterChestPlateLore = new ArrayList<String>();
        ThreeMasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.3Star"));
        return ThreeMasterChestPlate;
    }
    public static ItemStack ThreeMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeMasterLeggingsMeta = (LeatherArmorMeta) ThreeMasterLeggings.getItemMeta();
        ThreeMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪");
        ThreeMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterLeggingsLore = new ArrayList<String>();
        ThreeMasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.3Star"));
        return ThreeMasterLeggings;
    }
    public static ItemStack ThreeMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeMasterBootsMeta = (LeatherArmorMeta) ThreeMasterBoots.getItemMeta();
        ThreeMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪");
        ThreeMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterBootsLore = new ArrayList<String>();
        ThreeMasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.3Star"));
        return ThreeMasterBoots;
    }
    public static ItemStack FourMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourMasterHelmetMeta = (LeatherArmorMeta) FourMasterHelmet.getItemMeta();
        FourMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪✪");
        FourMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterHelmetLore = new ArrayList<String>();
        FourMasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.4Star"));
        return FourMasterHelmet;
    }
    public static ItemStack FourMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourMasterChestPlateMeta = (LeatherArmorMeta) FourMasterChestPlate.getItemMeta();
        FourMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master ChestPlate ✪✪✪✪");
        FourMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterChestPlateLore = new ArrayList<String>();
        FourMasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.4Star"));
        return FourMasterChestPlate;
    }
    public static ItemStack FourMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourMasterLeggingsMeta = (LeatherArmorMeta) FourMasterLeggings.getItemMeta();
        FourMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪✪");
        FourMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterLeggingsLore = new ArrayList<String>();
        FourMasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.4Star"));
        return FourMasterLeggings;
    }
    public static ItemStack FourMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourMasterBootsMeta = (LeatherArmorMeta) FourMasterBoots.getItemMeta();
        FourMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪✪");
        FourMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterBootsLore = new ArrayList<String>();
        FourMasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.4Star"));
        return FourMasterBoots;
    }
    public static ItemStack FiveMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveMasterHelmetMeta = (LeatherArmorMeta) FiveMasterHelmet.getItemMeta();
        FiveMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪✪✪");
        FiveMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterHelmetLore = new ArrayList<String>();
        FiveMasterHelmetLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.5Star"));
        return FiveMasterHelmet;
    }
    public static ItemStack FiveMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveMasterChestPlateMeta = (LeatherArmorMeta) FiveMasterChestPlate.getItemMeta();
        FiveMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master ChestPlate ✪✪✪✪✪");
        FiveMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterChestPlateLore = new ArrayList<String>();
        FiveMasterChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.5Star"));
        return FiveMasterChestPlate;
    }
    public static ItemStack FiveMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveMasterLeggingsMeta = (LeatherArmorMeta) FiveMasterLeggings.getItemMeta();
        FiveMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪✪✪");
        FiveMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterLeggingsLore = new ArrayList<String>();
        FiveMasterLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.5Star"));
        return FiveMasterLeggings;
    }
    public static ItemStack FiveMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveMasterBootsMeta = (LeatherArmorMeta) FiveMasterBoots.getItemMeta();
        FiveMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪✪✪");
        FiveMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterBootsLore = new ArrayList<String>();
        FiveMasterBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.5Star"));
        return FiveMasterBoots;
    }
    public static ItemStack ApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ApprenticeHelmetMeta = (LeatherArmorMeta) ApprenticeHelmet().getItemMeta();
        ApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet");
        ApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> ApprenticeHelmetLore = new ArrayList<String>();
        ApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery:" + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.Base"));
        return ApprenticeHelmet;
    }
    public static ItemStack ApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeChestPlate = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ApprenticeChestPlateMeta = (LeatherArmorMeta) ApprenticeChestPlate().getItemMeta();
        ApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice ChestPlate");
        ApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> ApprenticeChestPlateLore = new ArrayList<String>();
        ApprenticeChestPlateLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.Base"));
        return ApprenticeChestPlate;
    }
    public static ItemStack ApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeLeggings = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ApprenticeLeggingsMeta = (LeatherArmorMeta) ApprenticeLeggings().getItemMeta();
        ApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings");
        ApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> ApprenticeLeggingsLore = new ArrayList<String>();
        ApprenticeLeggingsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.Base"));
        return ApprenticeLeggings;
    }
    public static ItemStack ApprenticeBoots(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeBoots = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ApprenticeBootsMeta = (LeatherArmorMeta) ApprenticeBoots().getItemMeta();
        ApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots");
        ApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> ApprenticeBootsLore = new ArrayList<String>();
        ApprenticeBootsLore.add(ChatColor.GRAY + "" + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.Base"));
        return ApprenticeBoots;
    }
}
