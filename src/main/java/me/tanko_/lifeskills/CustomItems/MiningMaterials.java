package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MiningMaterials {
    //Common
    public static ItemStack RoughStone(){
        ItemStack RoughStone = new ItemStack(Material.COBBLESTONE);
        ItemMeta RoughStoneMeta= RoughStone.getItemMeta();
        RoughStoneMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Rough Stone");
        ArrayList<String> RoughStoneLore = new ArrayList<>();
        RoughStoneLore.add("");
        RoughStoneLore.add(ChatColor.GRAY + "Use this to create stone slabs");
        RoughStoneMeta.setLore(RoughStoneLore);
        RoughStone.setItemMeta(RoughStoneMeta);
        return RoughStone;
    }
    public static ItemStack IronOre(){
        ItemStack IronOre = new ItemStack(Material.IRON_ORE);
        ItemMeta IronOreMeta= IronOre.getItemMeta();
        IronOreMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Iron Ore");
        ArrayList<String> IronOreLore = new ArrayList<>();
        IronOreLore.add("");
        IronOreLore.add(ChatColor.GRAY + "Use this to create iron fragments");
        IronOreMeta.setLore(IronOreLore);
        IronOre.setItemMeta(IronOreMeta);
        return IronOre;
    }
    public static ItemStack CopperOre(){
        ItemStack CopperOre = new ItemStack(Material.GILDED_BLACKSTONE);
        ItemMeta CopperOreMeta= CopperOre.getItemMeta();
        CopperOreMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Copper Ore");
        ArrayList<String> CopperOreLore = new ArrayList<>();
        CopperOreLore.add("");
        CopperOreLore.add(ChatColor.GRAY + "Use this to create copper fragments");
        CopperOreMeta.setLore(CopperOreLore);
        CopperOre.setItemMeta(CopperOreMeta);
        return CopperOre;
    }
    public static ItemStack GoldOre(){
        ItemStack GoldOre = new ItemStack(Material.GOLD_ORE);
        ItemMeta GoldOreMeta= GoldOre.getItemMeta();
        GoldOreMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Gold Ore");
        ArrayList<String> GoldOreLore = new ArrayList<>();
        GoldOreLore.add("");
        GoldOreLore.add(ChatColor.GRAY + "Use this to create gold fragments");
        GoldOreMeta.setLore(GoldOreLore);
        GoldOre.setItemMeta(GoldOreMeta);
        return GoldOre;
    }
    //Uncommon
    public static ItemStack StoneSlab(){
        ItemStack StoneSlab = new ItemStack(Material.SMOOTH_STONE_SLAB);
        ItemMeta StoneSlabMeta= StoneSlab.getItemMeta();
        StoneSlabMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Stone Slab");
        ArrayList<String> StoneSlabLore = new ArrayList<>();
        StoneSlabLore.add("");
        StoneSlabLore.add(ChatColor.GRAY + "Use this to craft items");
        StoneSlabMeta.setLore(StoneSlabLore);
        StoneSlab.setItemMeta(StoneSlabMeta);
        return StoneSlab;
    }
    public static ItemStack IronFragment(){
        ItemStack IronFragment = new ItemStack(Material.IRON_NUGGET);
        ItemMeta IronFragmentMeta= IronFragment.getItemMeta();
        IronFragmentMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Iron Fragment");
        ArrayList<String> IronFragmentLore = new ArrayList<>();
        IronFragmentLore.add("");
        IronFragmentLore.add(ChatColor.GRAY + "Use this to create iron ingots");
        IronFragmentMeta.setLore(IronFragmentLore);
        IronFragment.setItemMeta(IronFragmentMeta);
        return IronFragment;
    }
    public static ItemStack CopperFragment(){
        ItemStack CopperFragment = new ItemStack(Material.BROWN_DYE);
        ItemMeta CopperFragmentMeta= CopperFragment.getItemMeta();
        CopperFragmentMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Copper Fragment");
        ArrayList<String> CopperFragmentLore = new ArrayList<>();
        CopperFragmentLore.add("");
        CopperFragmentLore.add(ChatColor.GRAY + "Use this to create copper ingots");
        CopperFragmentMeta.setLore(CopperFragmentLore);
        CopperFragment.setItemMeta(CopperFragmentMeta);
        return CopperFragment;
    }
    public static ItemStack GoldFragment(){
        ItemStack GoldFragment = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta GoldFragmentMeta= GoldFragment.getItemMeta();
        GoldFragmentMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Gold Fragment");
        ArrayList<String> GoldFragmentLore = new ArrayList<>();
        GoldFragmentLore.add("");
        GoldFragmentLore.add(ChatColor.GRAY + "Use this to create gold ingots");
        GoldFragmentMeta.setLore(GoldFragmentLore);
        GoldFragment.setItemMeta(GoldFragmentMeta);
        return GoldFragment;
    }
    //Rare
    public static ItemStack IronIngot(){
        ItemStack IronIngot = new ItemStack(Material.IRON_INGOT);
        ItemMeta IronIngotMeta= IronIngot.getItemMeta();
        IronIngotMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Iron Ingot");
        ArrayList<String> IronIngotLore = new ArrayList<>();
        IronIngotLore.add("");
        IronIngotLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        IronIngotMeta.setLore(IronIngotLore);
        IronIngot.setItemMeta(IronIngotMeta);
        return IronIngot;
    }
    public static ItemStack CopperIngot(){
        ItemStack CopperIngot = new ItemStack(Material.BRICK);
        ItemMeta CopperIngotMeta= CopperIngot.getItemMeta();
        CopperIngotMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Copper Ingot");
        ArrayList<String> CopperIngotLore = new ArrayList<>();
        CopperIngotLore.add("");
        CopperIngotLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        CopperIngotMeta.setLore(CopperIngotLore);
        CopperIngot.setItemMeta(CopperIngotMeta);
        return CopperIngot;
    }
    public static ItemStack GoldIngot(){
        ItemStack GoldIngot = new ItemStack(Material.GOLD_INGOT);
        ItemMeta GoldIngotMeta= GoldIngot.getItemMeta();
        GoldIngotMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Gold Ingot");
        ArrayList<String> GoldIngotLore = new ArrayList<>();
        GoldIngotLore.add("");
        GoldIngotLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        GoldIngotMeta.setLore(GoldIngotLore);
        GoldIngot.setItemMeta(GoldIngotMeta);
        return GoldIngot;
    }
    //Epic
    public static ItemStack RefinedIron(){
        ItemStack RefinedIron = new ItemStack(Material.IRON_INGOT);
        ItemMeta RefinedIronMeta= RefinedIron.getItemMeta();
        RefinedIronMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Iron Ingot");
        RefinedIronMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        RefinedIronMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> RefinedIronLore = new ArrayList<>();
        RefinedIronLore.add("");
        RefinedIronLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        RefinedIronMeta.setLore(RefinedIronLore);
        RefinedIron.setItemMeta(RefinedIronMeta);
        return RefinedIron;
    }
    public static ItemStack RefinedCopper(){
        ItemStack RefinedCopper = new ItemStack(Material.BRICK);
        ItemMeta RefinedCopperMeta= RefinedCopper.getItemMeta();
        RefinedCopperMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Copper Ingot");
        RefinedCopperMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        RefinedCopperMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> RefinedCopperLore = new ArrayList<>();
        RefinedCopperLore.add("");
        RefinedCopperLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        RefinedCopperMeta.setLore(RefinedCopperLore);
        RefinedCopper.setItemMeta(RefinedCopperMeta);
        return RefinedCopper;
    }
    public static ItemStack MixedRefinedScrap(){
        ItemStack MixedRefinedScrap = new ItemStack(Material.NETHERITE_SCRAP);
        ItemMeta MixedRefinedScrapMeta= MixedRefinedScrap.getItemMeta();
        MixedRefinedScrapMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Refined Scraps");
        MixedRefinedScrapMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        MixedRefinedScrapMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> MixedRefinedScrapLore = new ArrayList<>();
        MixedRefinedScrapLore.add("");
        MixedRefinedScrapLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        MixedRefinedScrapMeta.setLore(MixedRefinedScrapLore);
        MixedRefinedScrap.setItemMeta(MixedRefinedScrapMeta);
        return MixedRefinedScrap;
    }
    //Legendary
    public static ItemStack RefinedIngot(){
        ItemStack RefinedIngot = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta RefinedIngotMeta= RefinedIngot.getItemMeta();
        RefinedIngotMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mixed Refined Ingot");
        RefinedIngotMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        RefinedIngotMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> RefinedIngotLore = new ArrayList<>();
        RefinedIngotLore.add("");
        RefinedIngotLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        RefinedIngotMeta.setLore(RefinedIngotLore);
        RefinedIngot.setItemMeta(RefinedIngotMeta);
        return RefinedIngot;
    }
    public static ItemStack AncientMinersStone(){
        ItemStack AncientMinersStone = new ItemStack(Material.EMERALD);
        ItemMeta AncientMinersStoneMeta= AncientMinersStone.getItemMeta();
        AncientMinersStoneMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Ancient Miner's Stone");
        AncientMinersStoneMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        AncientMinersStoneMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> AncientMinersStoneLore = new ArrayList<>();
        AncientMinersStoneLore.add("");
        AncientMinersStoneLore.add(ChatColor.GRAY + "Use this to create new crafting materials");
        AncientMinersStoneMeta.setLore(AncientMinersStoneLore);
        AncientMinersStone.setItemMeta(AncientMinersStoneMeta);
        return AncientMinersStone;
    }
    
    
}
