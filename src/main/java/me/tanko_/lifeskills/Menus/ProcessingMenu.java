package me.tanko_.lifeskills.Menus;

import me.tanko_.lifeskills.Data.PlayerData;
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

import java.util.ArrayList;

public class ProcessingMenu implements CommandExecutor {

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
        int Level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
        //Inventory
        Inventory ProcessingMenu = Bukkit.createInventory(player, 27, "Processing Menu");

        ItemStack Chopping = new ItemStack(Material.DIAMOND_AXE);
        ItemStack Grinding  = new ItemStack(Material.ANVIL);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

        ItemMeta ChoppingMeta = Chopping.getItemMeta();
        ChoppingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Chopping");
        ChoppingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> ChoppingLore = new ArrayList<>();
        ChoppingLore.add("");
        ChoppingMeta.setLore(ChoppingLore);
        Chopping.setItemMeta(ChoppingMeta);


        ItemStack[] menu_items = {Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler};
        for (int i = 0; i < ProcessingMenu.getSize(); i++) {
            ProcessingMenu.setItem(i, menu_items[i]);
        }

        return ProcessingMenu;
    }
}
