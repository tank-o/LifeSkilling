package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class LumberingMaterials {
    //Lumbering Materials
    //Common
    public static ItemStack Log(){
        ItemStack Log = new ItemStack(Material.OAK_LOG);
        ItemMeta LogMeta = Log.getItemMeta();
        LogMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Log");
        ArrayList<String> LogLore = new ArrayList<String>();
        LogLore.add(ChatColor.GRAY + "Wooden log that you can get from");
        LogLore.add(ChatColor.GRAY + "all trees");
        LogLore.add(ChatColor.GRAY + "");
        LogLore.add(ChatColor.DARK_GRAY + "Process this item to get log planks");
        LogMeta.setLore(LogLore);
        Log.setItemMeta(LogMeta);
        return Log;
    }
    public static ItemStack AcaciaTimber(){
        ItemStack AcaciaTimber = new ItemStack(Material.ACACIA_LOG);
        ItemMeta AcaciaTimberMeta = AcaciaTimber.getItemMeta();
        AcaciaTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Acacia Timber");
        ArrayList<String> AcaciaTimberLore = new ArrayList<String>();
        AcaciaTimberLore.add(ChatColor.GRAY + "Process this item to get acacia planks");
        AcaciaTimberMeta.setLore(AcaciaTimberLore);
        AcaciaTimber.setItemMeta(AcaciaTimberMeta);

        ItemStack AcaciaTimberStack = new ItemStack(Material.ACACIA_LOG,64);
        AcaciaTimberStack.setItemMeta(AcaciaTimberMeta);


        return AcaciaTimber;
    }
    public static ItemStack BirchTimber() {
        ItemStack BirchTimber = new ItemStack(Material.BIRCH_LOG);
        ItemMeta BirchTimberMeta = BirchTimber.getItemMeta();
        BirchTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Birch Timber");
        ArrayList<String> BirchTimberLore = new ArrayList<String>();
        BirchTimberLore.add(ChatColor.GRAY + "Process this item to get birch planks");
        BirchTimberMeta.setLore(BirchTimberLore);
        BirchTimber.setItemMeta(BirchTimberMeta);

        return BirchTimber;
    }
    public static ItemStack OakTimber(){
        ItemStack OakTimber = new ItemStack(Material.OAK_LOG);
        ItemMeta OakTimberMeta = OakTimber.getItemMeta();
        OakTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Oak Timber");
        ArrayList<String> OakTimberLore = new ArrayList<String>();
        OakTimberLore.add(ChatColor.GRAY + "Process this item to get oak planks");
        OakTimberMeta.setLore(OakTimberLore);
        OakTimber.setItemMeta(OakTimberMeta);

        return OakTimber;
    }
    public static ItemStack SpruceTimber(){
        ItemStack SpruceTimber = new ItemStack(Material.SPRUCE_LOG);
        ItemMeta SpruceTimberMeta = SpruceTimber.getItemMeta();
        SpruceTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Spruce Timber");
        ArrayList<String> SpruceTimberLore = new ArrayList<String>();
        SpruceTimberLore.add(ChatColor.GRAY + "Process this item to get spruce planks");
        SpruceTimberMeta.setLore(SpruceTimberLore);
        SpruceTimber.setItemMeta(SpruceTimberMeta);

        return SpruceTimber;
    }
    public static ItemStack JungleTimber(){
        ItemStack JungleTimber = new ItemStack(Material.JUNGLE_LOG);
        ItemMeta JungleTimberMeta = JungleTimber.getItemMeta();
        JungleTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Jungle Timber");
        ArrayList<String> JungleTimberLore = new ArrayList<String>();
        JungleTimberLore.add(ChatColor.GRAY + "Process this item to get jungle planks");
        JungleTimberMeta.setLore(JungleTimberLore);
        JungleTimber.setItemMeta(JungleTimberMeta);

        return JungleTimber;
    }
    public static ItemStack DarkOakTimber(){
        ItemStack DarkOakTimber = new ItemStack(Material.DARK_OAK_LOG);
        ItemMeta DarkOakTimberMeta = DarkOakTimber.getItemMeta();
        DarkOakTimberMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Dark Oak Timber");
        ArrayList<String> DarkOakTimberLore = new ArrayList<String>();
        DarkOakTimberLore.add(ChatColor.GRAY + "Process this item to get dark oak planks");
        DarkOakTimberMeta.setLore(DarkOakTimberLore);
        DarkOakTimber.setItemMeta(DarkOakTimberMeta);

        return DarkOakTimber;
    }
    //Uncommon
    public static ItemStack AcaciaPlank(){
        ItemStack AcaciaPlank = new ItemStack(Material.ACACIA_SLAB);
        ItemMeta AcaciaPlankMeta = AcaciaPlank.getItemMeta();
        AcaciaPlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Acacia Plank");
        ArrayList<String> AcaciaPlankLore = new ArrayList<String>();
        AcaciaPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        AcaciaPlankLore.add(ChatColor.GRAY + "Process this item to get acacia plywood");
        AcaciaPlankMeta.setLore(AcaciaPlankLore);
        AcaciaPlank.setItemMeta(AcaciaPlankMeta);
        return AcaciaPlank;
    }
    public static ItemStack BirchPlank(){
        ItemStack BirchPlank = new ItemStack(Material.BIRCH_SLAB);
        ItemMeta BirchPlankMeta = BirchPlank.getItemMeta();
        BirchPlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Birch Plank");
        ArrayList<String> BirchPlankLore = new ArrayList<String>();
        BirchPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        BirchPlankLore.add(ChatColor.GRAY + "Process this item to get birch plywood");
        BirchPlankMeta.setLore(BirchPlankLore);
        BirchPlank.setItemMeta(BirchPlankMeta);

        return BirchPlank;
    }
    public static ItemStack OakPlank(){
        ItemStack OakPlank = new ItemStack(Material.OAK_SLAB);
        ItemMeta OakPlankMeta = OakPlank.getItemMeta();
        OakPlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Oak Plank");
        ArrayList<String> OakPlankLore = new ArrayList<String>();
        OakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        OakPlankLore.add(ChatColor.GRAY + "Process this item to get oak plywood");
        OakPlankMeta.setLore(OakPlankLore);
        OakPlank.setItemMeta(OakPlankMeta);

        return OakPlank;
    }
    public static ItemStack DarkOakPlank(){
        ItemStack DarkOakPlank = new ItemStack(Material.DARK_OAK_SLAB);
        ItemMeta DarkOakPlankMeta = DarkOakPlank.getItemMeta();
        DarkOakPlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Dark Oak Plank");
        ArrayList<String> DarkOakPlankLore = new ArrayList<String>();
        DarkOakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        DarkOakPlankLore.add(ChatColor.GRAY + "Process this item to get dark oak plywood");
        DarkOakPlankMeta.setLore(DarkOakPlankLore);
        DarkOakPlank.setItemMeta(DarkOakPlankMeta);

        return DarkOakPlank;
    }
    public static ItemStack SprucePlank(){
        ItemStack SprucePlank = new ItemStack(Material.SPRUCE_SLAB);
        ItemMeta SprucePlankMeta = SprucePlank.getItemMeta();
        SprucePlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Spruce Plank");
        ArrayList<String> SprucePlankLore = new ArrayList<String>();
        SprucePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        SprucePlankLore.add(ChatColor.GRAY + "Process this item to get spruce plywood");
        SprucePlankMeta.setLore(SprucePlankLore);
        SprucePlank.setItemMeta(SprucePlankMeta);

        return SprucePlank;
    }
    public static ItemStack JunglePlank(){
        ItemStack JunglePlank = new ItemStack(Material.JUNGLE_SLAB);
        ItemMeta JunglePlankMeta = JunglePlank.getItemMeta();
        JunglePlankMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Jungle Plank");
        ArrayList<String> JunglePlankLore = new ArrayList<String>();
        JunglePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        JunglePlankLore.add(ChatColor.GRAY + "Process this item to get jungle plywood");
        JunglePlankMeta.setLore(JunglePlankLore);
        JunglePlank.setItemMeta(JunglePlankMeta);

        return JunglePlank;
    }
    //Rare
    public static ItemStack AcaciaPlywood(){
        ItemStack AcaciaPlywood = new ItemStack(Material.ACACIA_PLANKS);
        ItemMeta AcaciaPlywoodMeta = AcaciaPlywood.getItemMeta();
        AcaciaPlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        AcaciaPlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        AcaciaPlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Acacia Plywood");
        ArrayList<String> AcaciaPlywoodLore = new ArrayList<String>();
        AcaciaPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        AcaciaPlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        AcaciaPlywoodMeta.setLore(AcaciaPlywoodLore);
        AcaciaPlywood.setItemMeta(AcaciaPlywoodMeta);
        return AcaciaPlywood;
    }
    public static ItemStack BirchPlywood(){
        ItemStack BirchPlywood = new ItemStack(Material.BIRCH_PLANKS);
        ItemMeta BirchPlywoodMeta = BirchPlywood.getItemMeta();
        BirchPlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Birch Plywood");
        BirchPlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        BirchPlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> BirchPlywoodLore = new ArrayList<String>();
        BirchPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        BirchPlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        BirchPlywoodMeta.setLore(BirchPlywoodLore);
        BirchPlywood.setItemMeta(BirchPlywoodMeta);

        return BirchPlywood;
    }
    public static ItemStack OakPlywood(){
        ItemStack OakPlywood = new ItemStack(Material.OAK_PLANKS);
        ItemMeta OakPlywoodMeta = OakPlywood.getItemMeta();
        OakPlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Oak Plywood");
        OakPlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        OakPlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> OakPlywoodLore = new ArrayList<String>();
        OakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        OakPlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        OakPlywoodMeta.setLore(OakPlywoodLore);
        OakPlywood.setItemMeta(OakPlywoodMeta);

        return OakPlywood;
    }
    public static ItemStack DarkOakPlywood(){
        ItemStack DarkOakPlywood = new ItemStack(Material.DARK_OAK_PLANKS);
        ItemMeta DarkOakPlywoodMeta = DarkOakPlywood.getItemMeta();
        DarkOakPlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Dark Oak Plywood");
        DarkOakPlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        DarkOakPlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> DarkOakPlywoodLore = new ArrayList<String>();
        DarkOakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        DarkOakPlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        DarkOakPlywoodMeta.setLore(DarkOakPlywoodLore);
        DarkOakPlywood.setItemMeta(DarkOakPlywoodMeta);

        return DarkOakPlywood;
    }
    public static ItemStack SprucePlywood(){
        ItemStack SprucePlywood = new ItemStack(Material.SPRUCE_PLANKS);
        ItemMeta SprucePlywoodMeta = SprucePlywood.getItemMeta();
        SprucePlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Spruce Plywood");
        SprucePlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        SprucePlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> SprucePlywoodLore = new ArrayList<String>();
        SprucePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        SprucePlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        SprucePlywoodMeta.setLore(SprucePlywoodLore);
        SprucePlywood.setItemMeta(SprucePlywoodMeta);

        return SprucePlywood;
    }
    public static ItemStack JunglePlywood(){
        ItemStack JunglePlywood = new ItemStack(Material.JUNGLE_PLANKS);
        ItemMeta JunglePlywoodMeta = JunglePlywood.getItemMeta();
        JunglePlywoodMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Jungle Plywood");
        JunglePlywoodMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        JunglePlywoodMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> JunglePlywoodLore = new ArrayList<String>();
        JunglePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        JunglePlywoodLore.add(ChatColor.GRAY + "Use this to craft new items");
        JunglePlywoodMeta.setLore(JunglePlywoodLore);
        JunglePlywood.setItemMeta(JunglePlywoodMeta);

        return JunglePlywood;
    }
    public static ItemStack Scantling(){
        ItemStack Scantling = new ItemStack(Material.STRIPPED_OAK_LOG);
        ItemMeta ScantlingMeta = Scantling.getItemMeta();
        ScantlingMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Scantling");
        ArrayList<String> ScantlingLore = new ArrayList<String>();
        ScantlingLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        ScantlingLore.add(ChatColor.GRAY + "Use this to craft Timer Squares");
        ScantlingMeta.setLore(ScantlingLore);
        Scantling.setItemMeta(ScantlingMeta);

        return Scantling;
    }
   
    public static ItemStack TimberSquare(){
        ItemStack TimberSquare = new ItemStack(Material.STRIPPED_OAK_WOOD);
        ItemMeta TimberSquareMeta = TimberSquare.getItemMeta();
        TimberSquareMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Timber Square");
        TimberSquareMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        TimberSquareMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> TimberSquareLore = new ArrayList<String>();
        TimberSquareLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        TimberSquareLore.add(ChatColor.GRAY + "Use this to craft other materials");
        TimberSquareMeta.setLore(TimberSquareLore);
        TimberSquare.setItemMeta(TimberSquareMeta);

        return TimberSquare;
    }
    //Epic
    public static ItemStack ReinforcedStick(){
        ItemStack ReinforcedStick = new ItemStack(Material.STICK);
        ItemMeta ReinforcedStickMeta = ReinforcedStick.getItemMeta();
        ReinforcedStickMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Reinforced Stick");
        ReinforcedStickMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        ReinforcedStickMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> ReinforcedStickLore = new ArrayList<>();
        ReinforcedStickLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        ReinforcedStickLore.add(ChatColor.GRAY + "Use this to craft tools");
        ReinforcedStickMeta.setLore(ReinforcedStickLore);
        ReinforcedStick.setItemMeta(ReinforcedStickMeta);

        return ReinforcedStick;
    }
}
