package me.tanko_.lifeskills.Menus;

import me.tanko_.lifeskills.CustomItems.MiningMaterials;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class HeatingProcessingMenu implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.openInventory(CreateMenu(player));
        }
        return true;
    }

    public static Inventory CreateMenu(Player player) {
        String ID = player.getUniqueId().toString();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        //Inventory
        Inventory ProcessingMenu = Bukkit.createInventory(player, 54, "Heating Menu");
        
        //Menu Items
        ItemStack CopperFragment = new ItemStack(MiningMaterials.CopperFragment());
        ItemStack IronFragment = new ItemStack(MiningMaterials.IronFragment());
        ItemStack GoldFragment = new ItemStack(MiningMaterials.GoldFragment());
        ItemStack CopperIngot = new ItemStack(MiningMaterials.CopperIngot());
        ItemStack IronIngot = new ItemStack(MiningMaterials.IronIngot());
        ItemStack GoldIngot = new ItemStack(MiningMaterials.GoldIngot());
        ItemStack MixedRefinedScrap = new ItemStack(MiningMaterials.MixedRefinedScrap());
        ItemStack MixedRefinedIngot = new ItemStack(MiningMaterials.RefinedIngot());
        ItemStack RefinedIronIngot = new ItemStack(MiningMaterials.RefinedIron());
        ItemStack RefinedCopperIngot = new ItemStack(MiningMaterials.RefinedCopper());

        ItemMeta IronFragmentMeta = IronFragment.getItemMeta();
        ArrayList<String> IronFragmentLore = new ArrayList<>();
        IronFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        IronFragmentLore.add("");
        IronFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Ore x10");
        IronFragmentMeta.setLore(IronFragmentLore);
        IronFragment.setItemMeta(IronFragmentMeta);

        ItemMeta CopperFragmentMeta = CopperFragment.getItemMeta();
        ArrayList<String> CopperFragmentLore = new ArrayList<>();
        CopperFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        CopperFragmentLore.add("");
        CopperFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Ore x10");
        CopperFragmentMeta.setLore(CopperFragmentLore);
        CopperFragment.setItemMeta(CopperFragmentMeta);

        ItemMeta GoldFragmentMeta = GoldFragment.getItemMeta();
        ArrayList<String> GoldFragmentLore = new ArrayList<>();
        GoldFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        GoldFragmentLore.add("");
        GoldFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Gold Ore x10 x64");
        GoldFragmentMeta.setLore(GoldFragmentLore);
        GoldFragment.setItemMeta(GoldFragmentMeta);

        ItemMeta CopperIngotMeta = CopperIngot.getItemMeta();
        ArrayList<String> CopperIngotLore = new ArrayList<>();
        CopperIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        CopperIngotLore.add("");
        CopperIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Fragment x10");
        CopperIngotMeta.setLore(CopperIngotLore);
        CopperIngot.setItemMeta(CopperIngotMeta);

        ItemMeta IronIngotMeta = IronIngot.getItemMeta();
        ArrayList<String> IronIngotLore = new ArrayList<>();
        IronIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        IronIngotLore.add("");
        IronIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Fragment x10");
        IronIngotMeta.setLore(IronIngotLore);
        IronIngot.setItemMeta(IronIngotMeta);

        ItemMeta GoldIngotMeta = GoldIngot.getItemMeta();
        ArrayList<String> GoldIngotLore = new ArrayList<>();
        GoldIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        GoldIngotLore.add("");
        GoldIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Gold Fragment x10");
        GoldIngotMeta.setLore(GoldIngotLore);
        GoldIngot.setItemMeta(GoldIngotMeta);

        ItemMeta MixedRefinedIngotMeta = MixedRefinedIngot.getItemMeta();
        ArrayList<String> MixedRefinedIngotLore = new ArrayList<>();
        MixedRefinedIngotLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Tier 5 Material");
        MixedRefinedIngotLore.add("");
        MixedRefinedIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Mixed Refined Scrap x10");
        MixedRefinedIngotMeta.setLore(MixedRefinedIngotLore);
        MixedRefinedIngot.setItemMeta(MixedRefinedIngotMeta);

        ItemMeta MixedRefinedScrapMeta = MixedRefinedScrap.getItemMeta();
        ArrayList<String> MixedRefinedScrapLore = new ArrayList<>();
        MixedRefinedScrapLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        MixedRefinedScrapLore.add("");
        MixedRefinedScrapLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Refined Iron x3");
        MixedRefinedScrapLore.add(ChatColor.WHITE + "Refined Copper x3");
        MixedRefinedScrapMeta.setLore(MixedRefinedScrapLore);
        MixedRefinedScrap.setItemMeta(MixedRefinedScrapMeta);
        
        ItemMeta RefinedIronIngotMeta = RefinedIronIngot.getItemMeta();
        ArrayList<String> RefinedIronIngotLore = new ArrayList<>();
        RefinedIronIngotLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        RefinedIronIngotLore.add("");
        RefinedIronIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Ingot x10");
        RefinedIronIngotMeta.setLore(RefinedIronIngotLore);
        RefinedIronIngot.setItemMeta(RefinedIronIngotMeta);

        ItemMeta RefinedCopperIngotMeta = RefinedCopperIngot.getItemMeta();
        ArrayList<String> RefinedCopperIngotLore = new ArrayList<>();
        RefinedCopperIngotLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        RefinedCopperIngotLore.add("");
        RefinedCopperIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Ingot x10");
        RefinedCopperIngotMeta.setLore(RefinedCopperIngotLore);
        RefinedCopperIngot.setItemMeta(RefinedCopperIngotMeta);

        ItemStack Chopping = new ItemStack(Material.DIAMOND_AXE);
        ItemStack Grinding  = new ItemStack(Material.ANVIL);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack BackButton = new ItemStack(Material.BARRIER);
        ItemStack Heating = new ItemStack(Material.BLAZE_POWDER);

        ItemMeta HeatingMeta = Heating.getItemMeta();
        HeatingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Heating");
        HeatingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> HeatingLore = new ArrayList<>();
        HeatingLore.add(ChatColor.GRAY + "Heat resources to produce higher tier materials");
        HeatingMeta.setLore(HeatingLore);
        Heating.setItemMeta(HeatingMeta);

        ItemMeta ChoppingMeta = Chopping.getItemMeta();
        ChoppingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Chopping");
        ChoppingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> ChoppingLore = new ArrayList<>();
        ChoppingLore.add(ChatColor.GRAY + "Chop resources to produce higher tier materials");
        ChoppingMeta.setLore(ChoppingLore);
        Chopping.setItemMeta(ChoppingMeta);

        ItemMeta GrindingMeta = Grinding.getItemMeta();
        GrindingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding");
        GrindingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> GrindingLore = new ArrayList<>();
        GrindingLore.add(ChatColor.GRAY + "Grind resources to produce higher tier materials");
        GrindingMeta.setLore(GrindingLore);
        Grinding.setItemMeta(GrindingMeta);

        ItemMeta BackMeta = BackButton.getItemMeta();
        BackMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        BackButton.setItemMeta(BackMeta);


        ItemStack[] menu_items = {CopperFragment,IronFragment,GoldFragment,CopperIngot,IronIngot,GoldIngot, RefinedCopperIngot, RefinedIronIngot, MixedRefinedScrap,
                MixedRefinedIngot, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                BackButton, Chopping, Grinding, Heating, Filler, Filler, Filler, Filler, Filler};
        for (int i = 0; i < ProcessingMenu.getSize(); i++) {
            ProcessingMenu.setItem(i, menu_items[i]);
        }

        return ProcessingMenu;
    }
}
