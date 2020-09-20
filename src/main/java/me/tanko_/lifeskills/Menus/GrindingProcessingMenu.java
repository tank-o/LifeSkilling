package me.tanko_.lifeskills.Menus;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
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

public class GrindingProcessingMenu implements CommandExecutor {

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
        Inventory GrindingMenu = Bukkit.createInventory(player, 54, "Grinding Menu");

        //Menu Items
        ItemStack StoneSlab = new ItemStack(MiningMaterials.StoneSlab());

        ItemMeta StoneSlabMeta = StoneSlab.getItemMeta();
        ArrayList<String> StoneSlabLore = new ArrayList<>();
        StoneSlabLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        StoneSlabLore.add("");
        StoneSlabLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Rough Stone x64");
        StoneSlabMeta.setLore(StoneSlabLore);
        StoneSlab.setItemMeta(StoneSlabMeta);

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


        ItemStack[] menu_items = {StoneSlab,Filler,Filler,Filler,Filler,Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                BackButton, Chopping, Grinding, Heating, Filler, Filler, Filler, Filler, Filler};
        for (int i = 0; i < GrindingMenu.getSize(); i++) {
            GrindingMenu.setItem(i, menu_items[i]);
        }

        return GrindingMenu;
    }
}
