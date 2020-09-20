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
        MasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.Base"));
        MasterHelmetLore.add("");;
        MasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        MasterHelmetMeta.setLore(MasterHelmetLore);
        MasterHelmet.setItemMeta(MasterHelmetMeta);
        return MasterHelmet;
    }
    public static ItemStack MasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta MasterChestPlateMeta = (LeatherArmorMeta) MasterChestPlate.getItemMeta();
        MasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate");
        MasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterChestPlateLore = new ArrayList<String>();
        MasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.Base"));
        MasterChestPlateLore.add("");;
        MasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        MasterChestPlateMeta.setLore(MasterChestPlateLore);
        MasterChestPlate.setItemMeta(MasterChestPlateMeta);
        return MasterChestPlate;
    }
    public static ItemStack MasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta MasterLeggingsMeta = (LeatherArmorMeta) MasterLeggings.getItemMeta();
        MasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings");
        MasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterLeggingsLore = new ArrayList<String>();
        MasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.Base"));
        MasterLeggingsLore.add("");;
        MasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        MasterLeggingsMeta.setLore(MasterLeggingsLore);
        MasterLeggings.setItemMeta(MasterLeggingsMeta);
        return MasterLeggings;
    }
    public static ItemStack MasterBoots(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta MasterBootsMeta = (LeatherArmorMeta) MasterBoots.getItemMeta();
        MasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots");
        MasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> MasterBootsLore = new ArrayList<String>();
        MasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.Base"));
        MasterBootsLore.add("");;
        MasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        MasterBootsMeta.setLore(MasterBootsLore);
        MasterBoots.setItemMeta(MasterBootsMeta);
        return MasterBoots;
        
    }
    public static ItemStack OneMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneMasterHelmetMeta = (LeatherArmorMeta) OneMasterHelmet.getItemMeta();
        OneMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪");
        OneMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterHelmetLore = new ArrayList<String>();
        OneMasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.1Star"));
        OneMasterHelmetLore.add("");;
        OneMasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        OneMasterHelmetMeta.setLore(OneMasterHelmetLore);
        OneMasterHelmet.setItemMeta(OneMasterHelmetMeta);
        return OneMasterHelmet;
    }
    public static ItemStack OneMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta OneMasterChestPlateMeta = (LeatherArmorMeta) OneMasterChestPlate.getItemMeta();
        OneMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪");
        OneMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterChestPlateLore = new ArrayList<String>();
        OneMasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.1Star"));
        OneMasterChestPlateLore.add("");;
        OneMasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        OneMasterChestPlateMeta.setLore(OneMasterChestPlateLore);
        OneMasterChestPlate.setItemMeta(OneMasterChestPlateMeta);
        return OneMasterChestPlate;
    }
    public static ItemStack OneMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta OneMasterLeggingsMeta = (LeatherArmorMeta) OneMasterLeggings.getItemMeta();
        OneMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪");
        OneMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterLeggingsLore = new ArrayList<String>();
        OneMasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.1Star"));
        OneMasterLeggingsLore.add("");;
        OneMasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        OneMasterLeggingsMeta.setLore(OneMasterLeggingsLore);
        OneMasterLeggings.setItemMeta(OneMasterLeggingsMeta);
        return OneMasterLeggings;
    }
    public static ItemStack OneMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta OneMasterBootsMeta = (LeatherArmorMeta) OneMasterBoots.getItemMeta();
        OneMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪");
        OneMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> OneMasterBootsLore = new ArrayList<String>();
        OneMasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.1Star"));
        OneMasterBootsLore.add("");;
        OneMasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        OneMasterBootsMeta.setLore(OneMasterBootsLore);
        OneMasterBoots.setItemMeta(OneMasterBootsMeta);
        return OneMasterBoots;
    }
    public static ItemStack TwoMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoMasterHelmetMeta = (LeatherArmorMeta) TwoMasterHelmet.getItemMeta();
        TwoMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪");
        TwoMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterHelmetLore = new ArrayList<String>();
        TwoMasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.2Star"));
        TwoMasterHelmetLore.add("");;
        TwoMasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        TwoMasterHelmetMeta.setLore(TwoMasterHelmetLore);
        TwoMasterHelmet.setItemMeta(TwoMasterHelmetMeta);
        return TwoMasterHelmet;
    }
    public static ItemStack TwoMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta TwoMasterChestPlateMeta = (LeatherArmorMeta) TwoMasterChestPlate.getItemMeta();
        TwoMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪✪");
        TwoMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterChestPlateLore = new ArrayList<String>();
        TwoMasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.2Star"));
        TwoMasterChestPlateLore.add("");;
        TwoMasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        TwoMasterChestPlateMeta.setLore(TwoMasterChestPlateLore);
        TwoMasterChestPlate.setItemMeta(TwoMasterChestPlateMeta);
        return TwoMasterChestPlate;
    }
    public static ItemStack TwoMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta TwoMasterLeggingsMeta = (LeatherArmorMeta) TwoMasterLeggings.getItemMeta();
        TwoMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪");
        TwoMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterLeggingsLore = new ArrayList<String>();
        TwoMasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.2Star"));
        TwoMasterLeggingsLore.add("");;
        TwoMasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        TwoMasterLeggingsMeta.setLore(TwoMasterLeggingsLore);
        TwoMasterLeggings.setItemMeta(TwoMasterLeggingsMeta);
        return TwoMasterLeggings;
    }
    public static ItemStack TwoMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta TwoMasterBootsMeta = (LeatherArmorMeta) TwoMasterBoots.getItemMeta();
        TwoMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪");
        TwoMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> TwoMasterBootsLore = new ArrayList<String>();
        TwoMasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.2Star"));
        TwoMasterBootsLore.add("");;
        TwoMasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        TwoMasterBootsMeta.setLore(TwoMasterBootsLore);
        TwoMasterBoots.setItemMeta(TwoMasterBootsMeta);
        return TwoMasterBoots;
    }
    public static ItemStack ThreeMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeMasterHelmetMeta = (LeatherArmorMeta) ThreeMasterHelmet.getItemMeta();
        ThreeMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪");
        ThreeMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterHelmetLore = new ArrayList<String>();
        ThreeMasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.3Star"));
        ThreeMasterHelmetLore.add("");;
        ThreeMasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        ThreeMasterHelmetMeta.setLore(ThreeMasterHelmetLore);
        ThreeMasterHelmet.setItemMeta(ThreeMasterHelmetMeta);
        return ThreeMasterHelmet;
    }
    public static ItemStack ThreeMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta ThreeMasterChestPlateMeta = (LeatherArmorMeta) ThreeMasterChestPlate.getItemMeta();
        ThreeMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master Chestplate ✪✪✪");
        ThreeMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterChestPlateLore = new ArrayList<String>();
        ThreeMasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.3Star"));
        ThreeMasterChestPlateLore.add("");;
        ThreeMasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        ThreeMasterChestPlateMeta.setLore(ThreeMasterChestPlateLore);
        ThreeMasterChestPlate.setItemMeta(ThreeMasterChestPlateMeta);
        return ThreeMasterChestPlate;
    }
    public static ItemStack ThreeMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta ThreeMasterLeggingsMeta = (LeatherArmorMeta) ThreeMasterLeggings.getItemMeta();
        ThreeMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪");
        ThreeMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterLeggingsLore = new ArrayList<String>();
        ThreeMasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.3Star"));
        ThreeMasterLeggingsLore.add("");;
        ThreeMasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        ThreeMasterLeggingsMeta.setLore(ThreeMasterLeggingsLore);
        ThreeMasterLeggings.setItemMeta(ThreeMasterLeggingsMeta);
        return ThreeMasterLeggings;
    }
    public static ItemStack ThreeMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta ThreeMasterBootsMeta = (LeatherArmorMeta) ThreeMasterBoots.getItemMeta();
        ThreeMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪");
        ThreeMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> ThreeMasterBootsLore = new ArrayList<String>();
        ThreeMasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.3Star"));
        ThreeMasterBootsLore.add("");;
        ThreeMasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        ThreeMasterBootsMeta.setLore(ThreeMasterBootsLore);
        ThreeMasterBoots.setItemMeta(ThreeMasterBootsMeta);
        return ThreeMasterBoots;
    }
    public static ItemStack FourMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourMasterHelmetMeta = (LeatherArmorMeta) FourMasterHelmet.getItemMeta();
        FourMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪✪");
        FourMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterHelmetLore = new ArrayList<String>();
        FourMasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.4Star"));
        FourMasterHelmetLore.add("");;
        FourMasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FourMasterHelmetMeta.setLore(FourMasterHelmetLore);
        FourMasterHelmet.setItemMeta(FourMasterHelmetMeta);
        return FourMasterHelmet;
    }
    public static ItemStack FourMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta FourMasterChestPlateMeta = (LeatherArmorMeta) FourMasterChestPlate.getItemMeta();
        FourMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master ChestPlate ✪✪✪✪");
        FourMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterChestPlateLore = new ArrayList<String>();
        FourMasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.4Star"));
        FourMasterChestPlateLore.add("");;
        FourMasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FourMasterChestPlateMeta.setLore(FourMasterChestPlateLore);
        FourMasterChestPlate.setItemMeta(FourMasterChestPlateMeta);
        return FourMasterChestPlate;
    }
    public static ItemStack FourMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta FourMasterLeggingsMeta = (LeatherArmorMeta) FourMasterLeggings.getItemMeta();
        FourMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪✪");
        FourMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterLeggingsLore = new ArrayList<String>();
        FourMasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.4Star"));
        FourMasterLeggingsLore.add("");;
        FourMasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FourMasterLeggingsMeta.setLore(FourMasterLeggingsLore);
        FourMasterLeggings.setItemMeta(FourMasterLeggingsMeta);
        return FourMasterLeggings;
    }
    public static ItemStack FourMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta FourMasterBootsMeta = (LeatherArmorMeta) FourMasterBoots.getItemMeta();
        FourMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪✪");
        FourMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> FourMasterBootsLore = new ArrayList<String>();
        FourMasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.4Star"));
        FourMasterBootsLore.add("");;
        FourMasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FourMasterBootsMeta.setLore(FourMasterBootsLore);
        FourMasterBoots.setItemMeta(FourMasterBootsMeta);
        return FourMasterBoots;
    }
    public static ItemStack FiveMasterHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveMasterHelmetMeta = (LeatherArmorMeta) FiveMasterHelmet.getItemMeta();
        FiveMasterHelmetMeta.setDisplayName(ChatColor.GOLD + "Master Helmet ✪✪✪✪✪");
        FiveMasterHelmetMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterHelmetLore = new ArrayList<String>();
        FiveMasterHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Helmet.Mastery.5Star"));
        FiveMasterHelmetLore.add("");;
        FiveMasterHelmetLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FiveMasterHelmetMeta.setLore(FiveMasterHelmetLore);
        FiveMasterHelmet.setItemMeta(FiveMasterHelmetMeta);
        return FiveMasterHelmet;
    }
    public static ItemStack FiveMasterChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta FiveMasterChestPlateMeta = (LeatherArmorMeta) FiveMasterChestPlate.getItemMeta();
        FiveMasterChestPlateMeta.setDisplayName(ChatColor.GOLD + "Master ChestPlate ✪✪✪✪✪");
        FiveMasterChestPlateMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterChestPlateLore = new ArrayList<String>();
        FiveMasterChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Chestplate.Mastery.5Star"));
        FiveMasterChestPlateLore.add("");;
        FiveMasterChestPlateLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FiveMasterChestPlateMeta.setLore(FiveMasterChestPlateLore);
        FiveMasterChestPlate.setItemMeta(FiveMasterChestPlateMeta);
        return FiveMasterChestPlate;
    }
    public static ItemStack FiveMasterLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta FiveMasterLeggingsMeta = (LeatherArmorMeta) FiveMasterLeggings.getItemMeta();
        FiveMasterLeggingsMeta.setDisplayName(ChatColor.GOLD + "Master Leggings ✪✪✪✪✪");
        FiveMasterLeggingsMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterLeggingsLore = new ArrayList<String>();
        FiveMasterLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Leggings.Mastery.5Star"));
        FiveMasterLeggingsLore.add("");;
        FiveMasterLeggingsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FiveMasterLeggingsMeta.setLore(FiveMasterLeggingsLore);
        FiveMasterLeggings.setItemMeta(FiveMasterLeggingsMeta);
        return FiveMasterLeggings;
    }
    public static ItemStack FiveMasterBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta FiveMasterBootsMeta = (LeatherArmorMeta) FiveMasterBoots.getItemMeta();
        FiveMasterBootsMeta.setDisplayName(ChatColor.GOLD + "Master Boots ✪✪✪✪✪");
        FiveMasterBootsMeta.setColor(Color.ORANGE);
        ArrayList<String> FiveMasterBootsLore = new ArrayList<String>();
        FiveMasterBootsLore.add("");;
        FiveMasterBootsLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY");
        FiveMasterBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Master.Boots.Mastery.5Star"));
        FiveMasterBootsMeta.setLore(FiveMasterBootsLore);
        FiveMasterBoots.setItemMeta(FiveMasterBootsMeta);
        return FiveMasterBoots;
    }
    public static ItemStack ApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ApprenticeHelmetMeta = (LeatherArmorMeta) ApprenticeHelmet.getItemMeta();
        ApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet");
        ApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> ApprenticeHelmetLore = new ArrayList<String>();
        ApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.Base"));
        ApprenticeHelmetLore.add("");;
        ApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ApprenticeHelmetMeta.setLore(ApprenticeHelmetLore);
        ApprenticeHelmet.setItemMeta(ApprenticeHelmetMeta);
        return ApprenticeHelmet;
    }
    public static ItemStack ApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta ApprenticeChestPlateMeta = (LeatherArmorMeta) ApprenticeChestPlate.getItemMeta();
        ApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice ChestPlate");
        ApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> ApprenticeChestPlateLore = new ArrayList<String>();
        ApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.Base"));
        ApprenticeChestPlateLore.add("");
        ApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ApprenticeChestPlateMeta.setLore(ApprenticeChestPlateLore);
        ApprenticeChestPlate.setItemMeta(ApprenticeChestPlateMeta);
        return ApprenticeChestPlate;
    }
    public static ItemStack ApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta ApprenticeLeggingsMeta = (LeatherArmorMeta) ApprenticeLeggings.getItemMeta();
        ApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings");
        ApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> ApprenticeLeggingsLore = new ArrayList<String>();
        ApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.Base"));
        ApprenticeLeggingsLore.add("");;
        ApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ApprenticeLeggingsMeta.setLore(ApprenticeLeggingsLore);
        ApprenticeLeggings.setItemMeta(ApprenticeLeggingsMeta);
        return ApprenticeLeggings;
    }
    public static ItemStack ApprenticeBoots(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta ApprenticeBootsMeta = (LeatherArmorMeta) ApprenticeBoots.getItemMeta();
        ApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots");
        ApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> ApprenticeBootsLore = new ArrayList<String>();
        ApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.Base"));
        ApprenticeBootsLore.add("");;
        ApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ApprenticeBootsMeta.setLore(ApprenticeBootsLore);
        ApprenticeBoots.setItemMeta(ApprenticeBootsMeta);
        return ApprenticeBoots;

    }
    public static ItemStack OneApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta OneApprenticeHelmetMeta = (LeatherArmorMeta) OneApprenticeHelmet.getItemMeta();
        OneApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet ✪");
        OneApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> OneApprenticeHelmetLore = new ArrayList<String>();
        OneApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.1Star"));
        OneApprenticeHelmetLore.add("");;
        OneApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        OneApprenticeHelmetMeta.setLore(OneApprenticeHelmetLore);
        OneApprenticeHelmet.setItemMeta(OneApprenticeHelmetMeta);
        return OneApprenticeHelmet;
    }
    public static ItemStack OneApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta OneApprenticeChestPlateMeta = (LeatherArmorMeta) OneApprenticeChestPlate.getItemMeta();
        OneApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice Chestplate ✪");
        OneApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> OneApprenticeChestPlateLore = new ArrayList<String>();
        OneApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.1Star"));
        OneApprenticeChestPlateLore.add("");;
        OneApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        OneApprenticeChestPlateMeta.setLore(OneApprenticeChestPlateLore);
        OneApprenticeChestPlate.setItemMeta(OneApprenticeChestPlateMeta);
        return OneApprenticeChestPlate;
    }
    public static ItemStack OneApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta OneApprenticeLeggingsMeta = (LeatherArmorMeta) OneApprenticeLeggings.getItemMeta();
        OneApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings ✪");
        OneApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> OneApprenticeLeggingsLore = new ArrayList<String>();
        OneApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.1Star"));
        OneApprenticeLeggingsLore.add("");;
        OneApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        OneApprenticeLeggingsMeta.setLore(OneApprenticeLeggingsLore);
        OneApprenticeLeggings.setItemMeta(OneApprenticeLeggingsMeta);
        return OneApprenticeLeggings;
    }
    public static ItemStack OneApprenticeBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta OneApprenticeBootsMeta = (LeatherArmorMeta) OneApprenticeBoots.getItemMeta();
        OneApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots ✪");
        OneApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> OneApprenticeBootsLore = new ArrayList<String>();
        OneApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.1Star"));
        OneApprenticeBootsLore.add("");;
        OneApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        OneApprenticeBootsMeta.setLore(OneApprenticeBootsLore);
        OneApprenticeBoots.setItemMeta(OneApprenticeBootsMeta);
        return OneApprenticeBoots;
    }
    public static ItemStack TwoApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta TwoApprenticeHelmetMeta = (LeatherArmorMeta) TwoApprenticeHelmet.getItemMeta();
        TwoApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet ✪✪");
        TwoApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> TwoApprenticeHelmetLore = new ArrayList<String>();
        TwoApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.2Star"));
        TwoApprenticeHelmetLore.add("");;
        TwoApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        TwoApprenticeHelmetMeta.setLore(TwoApprenticeHelmetLore);
        TwoApprenticeHelmet.setItemMeta(TwoApprenticeHelmetMeta);
        return TwoApprenticeHelmet;
    }
    public static ItemStack TwoApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta TwoApprenticeChestPlateMeta = (LeatherArmorMeta) TwoApprenticeChestPlate.getItemMeta();
        TwoApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice Chestplate ✪✪");
        TwoApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> TwoApprenticeChestPlateLore = new ArrayList<String>();
        TwoApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.2Star"));
        TwoApprenticeChestPlateLore.add("");;
        TwoApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        TwoApprenticeChestPlateMeta.setLore(TwoApprenticeChestPlateLore);
        TwoApprenticeChestPlate.setItemMeta(TwoApprenticeChestPlateMeta);
        return TwoApprenticeChestPlate;
    }
    public static ItemStack TwoApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta TwoApprenticeLeggingsMeta = (LeatherArmorMeta) TwoApprenticeLeggings.getItemMeta();
        TwoApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings ✪✪");
        TwoApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> TwoApprenticeLeggingsLore = new ArrayList<String>();
        TwoApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.2Star"));
        TwoApprenticeLeggingsLore.add("");;
        TwoApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        TwoApprenticeLeggingsMeta.setLore(TwoApprenticeLeggingsLore);
        TwoApprenticeLeggings.setItemMeta(TwoApprenticeLeggingsMeta);
        return TwoApprenticeLeggings;
    }
    public static ItemStack TwoApprenticeBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta TwoApprenticeBootsMeta = (LeatherArmorMeta) TwoApprenticeBoots.getItemMeta();
        TwoApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots ✪✪");
        TwoApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> TwoApprenticeBootsLore = new ArrayList<String>();
        TwoApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.2Star"));
        TwoApprenticeBootsLore.add("");;
        TwoApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        TwoApprenticeBootsMeta.setLore(TwoApprenticeBootsLore);
        TwoApprenticeBoots.setItemMeta(TwoApprenticeBootsMeta);
        return TwoApprenticeBoots;
    }
    public static ItemStack ThreeApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta ThreeApprenticeHelmetMeta = (LeatherArmorMeta) ThreeApprenticeHelmet.getItemMeta();
        ThreeApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet ✪✪✪");
        ThreeApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> ThreeApprenticeHelmetLore = new ArrayList<String>();
        ThreeApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.3Star"));
        ThreeApprenticeHelmetLore.add("");;
        ThreeApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ThreeApprenticeHelmetMeta.setLore(ThreeApprenticeHelmetLore);
        ThreeApprenticeHelmet.setItemMeta(ThreeApprenticeHelmetMeta);
        return ThreeApprenticeHelmet;
    }
    public static ItemStack ThreeApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta ThreeApprenticeChestPlateMeta = (LeatherArmorMeta) ThreeApprenticeChestPlate.getItemMeta();
        ThreeApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice Chestplate ✪✪✪");
        ThreeApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> ThreeApprenticeChestPlateLore = new ArrayList<String>();
        ThreeApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.3Star"));
        ThreeApprenticeChestPlateLore.add("");;
        ThreeApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ThreeApprenticeChestPlateMeta.setLore(ThreeApprenticeChestPlateLore);
        ThreeApprenticeChestPlate.setItemMeta(ThreeApprenticeChestPlateMeta);
        return ThreeApprenticeChestPlate;
    }
    public static ItemStack ThreeApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta ThreeApprenticeLeggingsMeta = (LeatherArmorMeta) ThreeApprenticeLeggings.getItemMeta();
        ThreeApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings ✪✪✪");
        ThreeApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> ThreeApprenticeLeggingsLore = new ArrayList<String>();
        ThreeApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.3Star"));
        ThreeApprenticeLeggingsLore.add("");;
        ThreeApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ThreeApprenticeLeggingsMeta.setLore(ThreeApprenticeLeggingsLore);
        ThreeApprenticeLeggings.setItemMeta(ThreeApprenticeLeggingsMeta);
        return ThreeApprenticeLeggings;
    }
    public static ItemStack ThreeApprenticeBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta ThreeApprenticeBootsMeta = (LeatherArmorMeta) ThreeApprenticeBoots.getItemMeta();
        ThreeApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots ✪✪✪");
        ThreeApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> ThreeApprenticeBootsLore = new ArrayList<String>();
        ThreeApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.3Star"));
        ThreeApprenticeBootsLore.add("");;
        ThreeApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        ThreeApprenticeBootsMeta.setLore(ThreeApprenticeBootsLore);
        ThreeApprenticeBoots.setItemMeta(ThreeApprenticeBootsMeta);
        return ThreeApprenticeBoots;
    }
    public static ItemStack FourApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FourApprenticeHelmetMeta = (LeatherArmorMeta) FourApprenticeHelmet.getItemMeta();
        FourApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet ✪✪✪✪");
        FourApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> FourApprenticeHelmetLore = new ArrayList<String>();
        FourApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.4Star"));
        FourApprenticeHelmetLore.add("");;
        FourApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FourApprenticeHelmetMeta.setLore(FourApprenticeHelmetLore);
        FourApprenticeHelmet.setItemMeta(FourApprenticeHelmetMeta);
        return FourApprenticeHelmet;
    }
    public static ItemStack FourApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta FourApprenticeChestPlateMeta = (LeatherArmorMeta) FourApprenticeChestPlate.getItemMeta();
        FourApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice ChestPlate ✪✪✪✪");
        FourApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> FourApprenticeChestPlateLore = new ArrayList<String>();
        FourApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.4Star"));
        FourApprenticeChestPlateLore.add("");;
        FourApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FourApprenticeChestPlateMeta.setLore(FourApprenticeChestPlateLore);
        FourApprenticeChestPlate.setItemMeta(FourApprenticeChestPlateMeta);
        return FourApprenticeChestPlate;
    }
    public static ItemStack FourApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta FourApprenticeLeggingsMeta = (LeatherArmorMeta) FourApprenticeLeggings.getItemMeta();
        FourApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings ✪✪✪✪");
        FourApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> FourApprenticeLeggingsLore = new ArrayList<String>();
        FourApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.4Star"));
        FourApprenticeLeggingsLore.add("");;
        FourApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FourApprenticeLeggingsMeta.setLore(FourApprenticeLeggingsLore);
        FourApprenticeLeggings.setItemMeta(FourApprenticeLeggingsMeta);
        return FourApprenticeLeggings;
    }
    public static ItemStack FourApprenticeBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta FourApprenticeBootsMeta = (LeatherArmorMeta) FourApprenticeBoots.getItemMeta();
        FourApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots ✪✪✪✪");
        FourApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> FourApprenticeBootsLore = new ArrayList<String>();
        FourApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.4Star"));
        FourApprenticeBootsLore.add("");;
        FourApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FourApprenticeBootsMeta.setLore(FourApprenticeBootsLore);
        FourApprenticeBoots.setItemMeta(FourApprenticeBootsMeta);
        return FourApprenticeBoots;
    }
    public static ItemStack FiveApprenticeHelmet(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeHelmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta FiveApprenticeHelmetMeta = (LeatherArmorMeta) FiveApprenticeHelmet.getItemMeta();
        FiveApprenticeHelmetMeta.setDisplayName(ChatColor.GREEN + "Apprentice Helmet ✪✪✪✪✪");
        FiveApprenticeHelmetMeta.setColor(Color.GRAY);
        ArrayList<String> FiveApprenticeHelmetLore = new ArrayList<String>();
        FiveApprenticeHelmetLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Helmet.Mastery.5Star"));
        FiveApprenticeHelmetLore.add("");;
        FiveApprenticeHelmetLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FiveApprenticeHelmetMeta.setLore(FiveApprenticeHelmetLore);
        FiveApprenticeHelmet.setItemMeta(FiveApprenticeHelmetMeta);
        return FiveApprenticeHelmet;
    }
    public static ItemStack FiveApprenticeChestPlate(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeChestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta FiveApprenticeChestPlateMeta = (LeatherArmorMeta) FiveApprenticeChestPlate.getItemMeta();
        FiveApprenticeChestPlateMeta.setDisplayName(ChatColor.GREEN + "Apprentice ChestPlate ✪✪✪✪✪");
        FiveApprenticeChestPlateMeta.setColor(Color.GREEN);
        ArrayList<String> FiveApprenticeChestPlateLore = new ArrayList<String>();
        FiveApprenticeChestPlateLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Mastery.5Star"));
        FiveApprenticeChestPlateLore.add("");;
        FiveApprenticeChestPlateLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FiveApprenticeChestPlateMeta.setLore(FiveApprenticeChestPlateLore);
        FiveApprenticeChestPlate.setItemMeta(FiveApprenticeChestPlateMeta);
        return FiveApprenticeChestPlate;
    }
    public static ItemStack FiveApprenticeLeggings(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta FiveApprenticeLeggingsMeta = (LeatherArmorMeta) FiveApprenticeLeggings.getItemMeta();
        FiveApprenticeLeggingsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Leggings ✪✪✪✪✪");
        FiveApprenticeLeggingsMeta.setColor(Color.GRAY);
        ArrayList<String> FiveApprenticeLeggingsLore = new ArrayList<String>();
        FiveApprenticeLeggingsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Leggings.Mastery.5Star"));
        FiveApprenticeLeggingsLore.add("");;
        FiveApprenticeLeggingsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FiveApprenticeLeggingsMeta.setLore(FiveApprenticeLeggingsLore);
        FiveApprenticeLeggings.setItemMeta(FiveApprenticeLeggingsMeta);
        return FiveApprenticeLeggings;
    }
    public static ItemStack FiveApprenticeBoots() {
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeBoots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta FiveApprenticeBootsMeta = (LeatherArmorMeta) FiveApprenticeBoots.getItemMeta();
        FiveApprenticeBootsMeta.setDisplayName(ChatColor.GREEN + "Apprentice Boots ✪✪✪✪✪");
        FiveApprenticeBootsMeta.setColor(Color.GREEN);
        ArrayList<String> FiveApprenticeBootsLore = new ArrayList<String>();
        FiveApprenticeBootsLore.add(ChatColor.GRAY + "Mastery: " + plugin.getConfig().getInt("Armour.Apprentice.Boots.Mastery.5Star"));
        FiveApprenticeBootsLore.add("");;
        FiveApprenticeBootsLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "UNCOMMON");
        FiveApprenticeBootsMeta.setLore(FiveApprenticeBootsLore);
        FiveApprenticeBoots.setItemMeta(FiveApprenticeBootsMeta);
        return FiveApprenticeBoots;
    }
}
