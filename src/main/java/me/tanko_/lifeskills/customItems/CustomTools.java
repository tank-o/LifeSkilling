package me.tanko_.lifeskills.customItems;

import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class CustomTools {

    //Lumbering Items
    //Tools
    public static ItemStack ApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta ApprenticeAxeMeta = ApprenticeAxe.getItemMeta();
        ApprenticeAxeMeta.setUnbreakable(true);
        ApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "Apprentice Axe");
        ArrayList<String> ApprenticeAxeLore = new ArrayList<String>();
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.Base"));
        ApprenticeAxeLore.add(" ");
        ApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ApprenticeAxeMeta.setLore(ApprenticeAxeLore);
        ApprenticeAxe.setItemMeta(ApprenticeAxeMeta);

        return ApprenticeAxe;
    }
    public static ItemStack OneApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta OneApprenticeAxeMeta = OneApprenticeAxe.getItemMeta();
        OneApprenticeAxeMeta.setUnbreakable(true);
        OneApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪ Apprentice Axe");
        ArrayList<String> OneApprenticeAxeLore = new ArrayList<String>();
        OneApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.1Star") );
        OneApprenticeAxeLore.add(" ");
        OneApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        OneApprenticeAxeMeta.setLore(OneApprenticeAxeLore);
        OneApprenticeAxe.setItemMeta(OneApprenticeAxeMeta);

        return OneApprenticeAxe;
    }
    public static ItemStack TwoApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta TwoApprenticeAxeMeta = TwoApprenticeAxe.getItemMeta();
        TwoApprenticeAxeMeta.setUnbreakable(true);
        TwoApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪ Apprentice Axe");
        ArrayList<String> TwoApprenticeAxeLore = new ArrayList<String>();
        TwoApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.2Star") );
        TwoApprenticeAxeLore.add(" ");
        TwoApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TwoApprenticeAxeMeta.setLore(TwoApprenticeAxeLore);
        TwoApprenticeAxe.setItemMeta(TwoApprenticeAxeMeta);

        return TwoApprenticeAxe;
    }
    public static ItemStack ThreeApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta ThreeApprenticeAxeMeta = ThreeApprenticeAxe.getItemMeta();
        ThreeApprenticeAxeMeta.setUnbreakable(true);
        ThreeApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪ Apprentice Axe");
        ArrayList<String> ThreeApprenticeAxeLore = new ArrayList<String>();
        ThreeApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.3Star") );
        ThreeApprenticeAxeLore.add(" ");
        ThreeApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ThreeApprenticeAxeMeta.setLore(ThreeApprenticeAxeLore);
        ThreeApprenticeAxe.setItemMeta(ThreeApprenticeAxeMeta);

        return ThreeApprenticeAxe;
    }
    public static ItemStack FourApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta FourApprenticeAxeMeta = FourApprenticeAxe.getItemMeta();
        FourApprenticeAxeMeta.setUnbreakable(true);
        FourApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD +"✪✪✪✪ Apprentice Axe");
        ArrayList<String> FourApprenticeAxeLore = new ArrayList<String>();
        FourApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.4Star") );
        FourApprenticeAxeLore.add(" ");
        FourApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FourApprenticeAxeMeta.setLore(FourApprenticeAxeLore);
        FourApprenticeAxe.setItemMeta(FourApprenticeAxeMeta);

        return FourApprenticeAxe;
    }
    public static ItemStack FiveApprenticeAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeAxe = new ItemStack(Material.IRON_AXE);
        ItemMeta FiveApprenticeAxeMeta = FiveApprenticeAxe.getItemMeta();
        FiveApprenticeAxeMeta.setUnbreakable(true);
        FiveApprenticeAxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪✪ Apprentice Axe");
        ArrayList<String> FiveApprenticeAxeLore = new ArrayList<String>();
        FiveApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.5Star"));
        FiveApprenticeAxeLore.add(" ");
        FiveApprenticeAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FiveApprenticeAxeMeta.setLore(FiveApprenticeAxeLore);
        FiveApprenticeAxe.setItemMeta(FiveApprenticeAxeMeta);

        return FiveApprenticeAxe;
    }
    
    public static ItemStack MasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta MasterAxeMeta = MasterAxe.getItemMeta();
        MasterAxeMeta.setUnbreakable(true);
        MasterAxeMeta.setDisplayName(ChatColor.GOLD + "Master Axe");
        ArrayList<String> MasterAxeLore = new ArrayList<String>();
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.Base"));
        MasterAxeLore.add(" ");
        MasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        MasterAxeMeta.setLore(MasterAxeLore);
        MasterAxe.setItemMeta(MasterAxeMeta);

        return MasterAxe;
    }
    public static ItemStack OneMasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta OneMasterAxeMeta = OneMasterAxe.getItemMeta();
        OneMasterAxeMeta.setUnbreakable(true);
        OneMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪ Master Axe");
        ArrayList<String> OneMasterAxeLore = new ArrayList<String>();
        OneMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.1Star"));
        OneMasterAxeLore.add(" ");
        OneMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        OneMasterAxeMeta.setLore(OneMasterAxeLore);
        OneMasterAxe.setItemMeta(OneMasterAxeMeta);

        return OneMasterAxe;
    }
    public static ItemStack TwoMasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta TwoMasterAxeMeta = TwoMasterAxe.getItemMeta();
        TwoMasterAxeMeta.setUnbreakable(true);
        TwoMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪ Master Axe");
        ArrayList<String> TwoMasterAxeLore = new ArrayList<String>();
        TwoMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.2Star"));
        TwoMasterAxeLore.add(" ");
        TwoMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TwoMasterAxeMeta.setLore(TwoMasterAxeLore);
        TwoMasterAxe.setItemMeta(TwoMasterAxeMeta);

        return TwoMasterAxe;
    }
    public static ItemStack ThreeMasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta ThreeMasterAxeMeta = ThreeMasterAxe.getItemMeta();
        ThreeMasterAxeMeta.setUnbreakable(true);
        ThreeMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪ Master Axe");
        ArrayList<String> ThreeMasterAxeLore = new ArrayList<String>();
        ThreeMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.3Star"));
        ThreeMasterAxeLore.add(" ");
        ThreeMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        ThreeMasterAxeMeta.setLore(ThreeMasterAxeLore);
        ThreeMasterAxe.setItemMeta(ThreeMasterAxeMeta);

        return ThreeMasterAxe;
    }
    public static ItemStack FourMasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta FourMasterAxeMeta = FourMasterAxe.getItemMeta();
        FourMasterAxeMeta.setUnbreakable(true);
        FourMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD +"✪✪✪✪ Master Axe");
        ArrayList<String> FourMasterAxeLore = new ArrayList<String>();
        FourMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.4Star"));
        FourMasterAxeLore.add(" ");
        FourMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FourMasterAxeMeta.setLore(FourMasterAxeLore);
        FourMasterAxe.setItemMeta(FourMasterAxeMeta);

        return FourMasterAxe;
    }
    public static ItemStack FiveMasterAxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta FiveMasterAxeMeta = FiveMasterAxe.getItemMeta();
        FiveMasterAxeMeta.setUnbreakable(true);
        FiveMasterAxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪✪ Master Axe");
        ArrayList<String> FiveMasterAxeLore = new ArrayList<String>();
        FiveMasterAxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Axes.Master.Mastery.5Star"));
        FiveMasterAxeLore.add(" ");
        FiveMasterAxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FiveMasterAxeMeta.setLore(FiveMasterAxeLore);
        FiveMasterAxe.setItemMeta(FiveMasterAxeMeta);

        return FiveMasterAxe;
    }
    //Butchering Items
    //Tools
    public static ItemStack ApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta ApprenticeButcherKnifeMeta = ApprenticeButcherKnife.getItemMeta();
        ApprenticeButcherKnifeMeta.setUnbreakable(true);
        ApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "Apprentice Butcher Knife");
        ArrayList<String> ApprenticeButcherKnifeLore = new ArrayList<String>();
        ApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.Base"));
        ApprenticeButcherKnifeLore.add(" ");
        ApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ApprenticeButcherKnifeMeta.setLore(ApprenticeButcherKnifeLore);
        ApprenticeButcherKnife.setItemMeta(ApprenticeButcherKnifeMeta);

        return ApprenticeButcherKnife;
    }
    public static ItemStack OneApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta OneApprenticeButcherKnifeMeta = OneApprenticeButcherKnife.getItemMeta();
        OneApprenticeButcherKnifeMeta.setUnbreakable(true);
        OneApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪ Apprentice Butcher Knife");
        ArrayList<String> OneApprenticeButcherKnifeLore = new ArrayList<String>();
        OneApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.1Star") );
        OneApprenticeButcherKnifeLore.add(" ");
        OneApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        OneApprenticeButcherKnifeMeta.setLore(OneApprenticeButcherKnifeLore);
        OneApprenticeButcherKnife.setItemMeta(OneApprenticeButcherKnifeMeta);

        return OneApprenticeButcherKnife;
    }
    public static ItemStack TwoApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta TwoApprenticeButcherKnifeMeta = TwoApprenticeButcherKnife.getItemMeta();
        TwoApprenticeButcherKnifeMeta.setUnbreakable(true);
        TwoApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪ Apprentice Butcher Knife");
        ArrayList<String> TwoApprenticeButcherKnifeLore = new ArrayList<String>();
        TwoApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.2Star") );
        TwoApprenticeButcherKnifeLore.add(" ");
        TwoApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TwoApprenticeButcherKnifeMeta.setLore(TwoApprenticeButcherKnifeLore);
        TwoApprenticeButcherKnife.setItemMeta(TwoApprenticeButcherKnifeMeta);

        return TwoApprenticeButcherKnife;
    }
    public static ItemStack ThreeApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta ThreeApprenticeButcherKnifeMeta = ThreeApprenticeButcherKnife.getItemMeta();
        ThreeApprenticeButcherKnifeMeta.setUnbreakable(true);
        ThreeApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪ Apprentice Butcher Knife");
        ArrayList<String> ThreeApprenticeButcherKnifeLore = new ArrayList<String>();
        ThreeApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.3Star") );
        ThreeApprenticeButcherKnifeLore.add(" ");
        ThreeApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ThreeApprenticeButcherKnifeMeta.setLore(ThreeApprenticeButcherKnifeLore);
        ThreeApprenticeButcherKnife.setItemMeta(ThreeApprenticeButcherKnifeMeta);

        return ThreeApprenticeButcherKnife;
    }
    public static ItemStack FourApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta FourApprenticeButcherKnifeMeta = FourApprenticeButcherKnife.getItemMeta();
        FourApprenticeButcherKnifeMeta.setUnbreakable(true);
        FourApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD +"✪✪✪✪ Apprentice Butcher Knife");
        ArrayList<String> FourApprenticeButcherKnifeLore = new ArrayList<String>();
        FourApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.4Star") );
        FourApprenticeButcherKnifeLore.add(" ");
        FourApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FourApprenticeButcherKnifeMeta.setLore(FourApprenticeButcherKnifeLore);
        FourApprenticeButcherKnife.setItemMeta(FourApprenticeButcherKnifeMeta);

        return FourApprenticeButcherKnife;
    }
    public static ItemStack FiveApprenticeButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticeButcherKnife = new ItemStack(Material.IRON_SWORD);
        ItemMeta FiveApprenticeButcherKnifeMeta = FiveApprenticeButcherKnife.getItemMeta();
        FiveApprenticeButcherKnifeMeta.setUnbreakable(true);
        FiveApprenticeButcherKnifeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪✪ Apprentice Butcher Knife");
        ArrayList<String> FiveApprenticeButcherKnifeLore = new ArrayList<String>();
        FiveApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.5Star"));
        FiveApprenticeButcherKnifeLore.add(" ");
        FiveApprenticeButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FiveApprenticeButcherKnifeMeta.setLore(FiveApprenticeButcherKnifeLore);
        FiveApprenticeButcherKnife.setItemMeta(FiveApprenticeButcherKnifeMeta);

        return FiveApprenticeButcherKnife;
    }

    public static ItemStack MasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta MasterButcherKnifeMeta = MasterButcherKnife.getItemMeta();
        MasterButcherKnifeMeta.setUnbreakable(true);
        MasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "Master Butcher Knife");
        ArrayList<String> MasterButcherKnifeLore = new ArrayList<String>();
        MasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.Base"));
        MasterButcherKnifeLore.add(" ");
        MasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        MasterButcherKnifeMeta.setLore(MasterButcherKnifeLore);
        MasterButcherKnife.setItemMeta(MasterButcherKnifeMeta);

        return MasterButcherKnife;
    }
    public static ItemStack OneMasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta OneMasterButcherKnifeMeta = OneMasterButcherKnife.getItemMeta();
        OneMasterButcherKnifeMeta.setUnbreakable(true);
        OneMasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪ Master Butcher Knife");
        ArrayList<String> OneMasterButcherKnifeLore = new ArrayList<String>();
        OneMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.1Star"));
        OneMasterButcherKnifeLore.add(" ");
        OneMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        OneMasterButcherKnifeMeta.setLore(OneMasterButcherKnifeLore);
        OneMasterButcherKnife.setItemMeta(OneMasterButcherKnifeMeta);

        return OneMasterButcherKnife;
    }
    public static ItemStack TwoMasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta TwoMasterButcherKnifeMeta = TwoMasterButcherKnife.getItemMeta();
        TwoMasterButcherKnifeMeta.setUnbreakable(true);
        TwoMasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪ Master Butcher Knife");
        ArrayList<String> TwoMasterButcherKnifeLore = new ArrayList<String>();
        TwoMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.2Star"));
        TwoMasterButcherKnifeLore.add(" ");
        TwoMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TwoMasterButcherKnifeMeta.setLore(TwoMasterButcherKnifeLore);
        TwoMasterButcherKnife.setItemMeta(TwoMasterButcherKnifeMeta);

        return TwoMasterButcherKnife;
    }
    public static ItemStack ThreeMasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta ThreeMasterButcherKnifeMeta = ThreeMasterButcherKnife.getItemMeta();
        ThreeMasterButcherKnifeMeta.setUnbreakable(true);
        ThreeMasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪ Master Butcher Knife");
        ArrayList<String> ThreeMasterButcherKnifeLore = new ArrayList<String>();
        ThreeMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.3Star"));
        ThreeMasterButcherKnifeLore.add(" ");
        ThreeMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        ThreeMasterButcherKnifeMeta.setLore(ThreeMasterButcherKnifeLore);
        ThreeMasterButcherKnife.setItemMeta(ThreeMasterButcherKnifeMeta);

        return ThreeMasterButcherKnife;
    }
    public static ItemStack FourMasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta FourMasterButcherKnifeMeta = FourMasterButcherKnife.getItemMeta();
        FourMasterButcherKnifeMeta.setUnbreakable(true);
        FourMasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD +"✪✪✪✪ Master Butcher Knife");
        ArrayList<String> FourMasterButcherKnifeLore = new ArrayList<String>();
        FourMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.4Star"));
        FourMasterButcherKnifeLore.add(" ");
        FourMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FourMasterButcherKnifeMeta.setLore(FourMasterButcherKnifeLore);
        FourMasterButcherKnife.setItemMeta(FourMasterButcherKnifeMeta);

        return FourMasterButcherKnife;
    }
    public static ItemStack FiveMasterButcherKnife(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterButcherKnife = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta FiveMasterButcherKnifeMeta = FiveMasterButcherKnife.getItemMeta();
        FiveMasterButcherKnifeMeta.setUnbreakable(true);
        FiveMasterButcherKnifeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪✪ Master Butcher Knife");
        ArrayList<String> FiveMasterButcherKnifeLore = new ArrayList<String>();
        FiveMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.5Star"));
        FiveMasterButcherKnifeLore.add(" ");
        FiveMasterButcherKnifeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FiveMasterButcherKnifeMeta.setLore(FiveMasterButcherKnifeLore);
        FiveMasterButcherKnife.setItemMeta(FiveMasterButcherKnifeMeta);

        return FiveMasterButcherKnife;
    }
    //Mining Items
    //Tools
    public static ItemStack ApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta ApprenticePickaxeMeta = ApprenticePickaxe.getItemMeta();
        ApprenticePickaxeMeta.setUnbreakable(true);
        ApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "Apprentice Pickaxe");
        ArrayList<String> ApprenticePickaxeLore = new ArrayList<String>();
        ApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.Base"));
        ApprenticePickaxeLore.add(" ");
        ApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ApprenticePickaxeMeta.setLore(ApprenticePickaxeLore);
        ApprenticePickaxe.setItemMeta(ApprenticePickaxeMeta);

        return ApprenticePickaxe;
    }
    public static ItemStack OneApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta OneApprenticePickaxeMeta = OneApprenticePickaxe.getItemMeta();
        OneApprenticePickaxeMeta.setUnbreakable(true);
        OneApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪ Apprentice Pickaxe");
        ArrayList<String> OneApprenticePickaxeLore = new ArrayList<String>();
        OneApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.1Star") );
        OneApprenticePickaxeLore.add(" ");
        OneApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        OneApprenticePickaxeMeta.setLore(OneApprenticePickaxeLore);
        OneApprenticePickaxe.setItemMeta(OneApprenticePickaxeMeta);

        return OneApprenticePickaxe;
    }
    public static ItemStack TwoApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta TwoApprenticePickaxeMeta = TwoApprenticePickaxe.getItemMeta();
        TwoApprenticePickaxeMeta.setUnbreakable(true);
        TwoApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪ Apprentice Pickaxe");
        ArrayList<String> TwoApprenticePickaxeLore = new ArrayList<String>();
        TwoApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.2Star") );
        TwoApprenticePickaxeLore.add(" ");
        TwoApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        TwoApprenticePickaxeMeta.setLore(TwoApprenticePickaxeLore);
        TwoApprenticePickaxe.setItemMeta(TwoApprenticePickaxeMeta);

        return TwoApprenticePickaxe;
    }
    public static ItemStack ThreeApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta ThreeApprenticePickaxeMeta = ThreeApprenticePickaxe.getItemMeta();
        ThreeApprenticePickaxeMeta.setUnbreakable(true);
        ThreeApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪ Apprentice Pickaxe");
        ArrayList<String> ThreeApprenticePickaxeLore = new ArrayList<String>();
        ThreeApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.3Star") );
        ThreeApprenticePickaxeLore.add(" ");
        ThreeApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        ThreeApprenticePickaxeMeta.setLore(ThreeApprenticePickaxeLore);
        ThreeApprenticePickaxe.setItemMeta(ThreeApprenticePickaxeMeta);

        return ThreeApprenticePickaxe;
    }
    public static ItemStack FourApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta FourApprenticePickaxeMeta = FourApprenticePickaxe.getItemMeta();
        FourApprenticePickaxeMeta.setUnbreakable(true);
        FourApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD +"✪✪✪✪ Apprentice Pickaxe");
        ArrayList<String> FourApprenticePickaxeLore = new ArrayList<String>();
        FourApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.4Star") );
        FourApprenticePickaxeLore.add(" ");
        FourApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FourApprenticePickaxeMeta.setLore(FourApprenticePickaxeLore);
        FourApprenticePickaxe.setItemMeta(FourApprenticePickaxeMeta);

        return FourApprenticePickaxe;
    }
    public static ItemStack FiveApprenticePickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveApprenticePickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta FiveApprenticePickaxeMeta = FiveApprenticePickaxe.getItemMeta();
        FiveApprenticePickaxeMeta.setUnbreakable(true);
        FiveApprenticePickaxeMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪✪ Apprentice Pickaxe");
        ArrayList<String> FiveApprenticePickaxeLore = new ArrayList<String>();
        FiveApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.5Star"));
        FiveApprenticePickaxeLore.add(" ");
        FiveApprenticePickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 2%");
        FiveApprenticePickaxeMeta.setLore(FiveApprenticePickaxeLore);
        FiveApprenticePickaxe.setItemMeta(FiveApprenticePickaxeMeta);

        return FiveApprenticePickaxe;
    }

    public static ItemStack MasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack MasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta MasterPickaxeMeta = MasterPickaxe.getItemMeta();
        MasterPickaxeMeta.setUnbreakable(true);
        MasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "Master Pickaxe");
        ArrayList<String> MasterPickaxeLore = new ArrayList<String>();
        MasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.Base"));
        MasterPickaxeLore.add(" ");
        MasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        MasterPickaxeMeta.setLore(MasterPickaxeLore);
        MasterPickaxe.setItemMeta(MasterPickaxeMeta);

        return MasterPickaxe;
    }
    public static ItemStack OneMasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack OneMasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta OneMasterPickaxeMeta = OneMasterPickaxe.getItemMeta();
        OneMasterPickaxeMeta.setUnbreakable(true);
        OneMasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪ Master Pickaxe");
        ArrayList<String> OneMasterPickaxeLore = new ArrayList<String>();
        OneMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.1Star"));
        OneMasterPickaxeLore.add(" ");
        OneMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        OneMasterPickaxeMeta.setLore(OneMasterPickaxeLore);
        OneMasterPickaxe.setItemMeta(OneMasterPickaxeMeta);

        return OneMasterPickaxe;
    }
    public static ItemStack TwoMasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack TwoMasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta TwoMasterPickaxeMeta = TwoMasterPickaxe.getItemMeta();
        TwoMasterPickaxeMeta.setUnbreakable(true);
        TwoMasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪ Master Pickaxe");
        ArrayList<String> TwoMasterPickaxeLore = new ArrayList<String>();
        TwoMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.2Star"));
        TwoMasterPickaxeLore.add(" ");
        TwoMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        TwoMasterPickaxeMeta.setLore(TwoMasterPickaxeLore);
        TwoMasterPickaxe.setItemMeta(TwoMasterPickaxeMeta);

        return TwoMasterPickaxe;
    }
    public static ItemStack ThreeMasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack ThreeMasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta ThreeMasterPickaxeMeta = ThreeMasterPickaxe.getItemMeta();
        ThreeMasterPickaxeMeta.setUnbreakable(true);
        ThreeMasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪ Master Pickaxe");
        ArrayList<String> ThreeMasterPickaxeLore = new ArrayList<String>();
        ThreeMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.3Star"));
        ThreeMasterPickaxeLore.add(" ");
        ThreeMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        ThreeMasterPickaxeMeta.setLore(ThreeMasterPickaxeLore);
        ThreeMasterPickaxe.setItemMeta(ThreeMasterPickaxeMeta);

        return ThreeMasterPickaxe;
    }
    public static ItemStack FourMasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FourMasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta FourMasterPickaxeMeta = FourMasterPickaxe.getItemMeta();
        FourMasterPickaxeMeta.setUnbreakable(true);
        FourMasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD +"✪✪✪✪ Master Pickaxe");
        ArrayList<String> FourMasterPickaxeLore = new ArrayList<String>();
        FourMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.4Star"));
        FourMasterPickaxeLore.add(" ");
        FourMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FourMasterPickaxeMeta.setLore(FourMasterPickaxeLore);
        FourMasterPickaxe.setItemMeta(FourMasterPickaxeMeta);

        return FourMasterPickaxe;
    }
    public static ItemStack FiveMasterPickaxe(){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        ItemStack FiveMasterPickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta FiveMasterPickaxeMeta = FiveMasterPickaxe.getItemMeta();
        FiveMasterPickaxeMeta.setUnbreakable(true);
        FiveMasterPickaxeMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪✪ Master Pickaxe");
        ArrayList<String> FiveMasterPickaxeLore = new ArrayList<String>();
        FiveMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Mastery: " + plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.5Star"));
        FiveMasterPickaxeLore.add(" ");
        FiveMasterPickaxeLore.add(ChatColor.DARK_GRAY + "Gathering XP Boost: 5%");
        FiveMasterPickaxeMeta.setLore(FiveMasterPickaxeLore);
        FiveMasterPickaxe.setItemMeta(FiveMasterPickaxeMeta);

        return FiveMasterPickaxe;
    }
}
