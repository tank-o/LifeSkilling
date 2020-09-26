package me.tanko_.lifeskills.menus;

import me.tanko_.lifeskills.MenuItems;
import me.tanko_.lifeskills.customItems.LumberingMaterials;
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

public class ChoppingMenu implements CommandExecutor {

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
        Inventory ProcessingMenu = Bukkit.createInventory(player, 54, "Chopping Menu");
        //Woods
        ItemStack oakPlank = new ItemStack(MenuItems.OakPlank());
        ItemStack birchPlank = new ItemStack(MenuItems.BirchPlank());
        ItemStack junglePlank = new ItemStack(MenuItems.JunglePlank());
        ItemStack darkOakPlank = new ItemStack(MenuItems.DarkOakPlank());
        ItemStack sprucePlank = new ItemStack(MenuItems.SprucePlank());
        ItemStack acaciaPlank = new ItemStack(MenuItems.AcaciaPlank());
        ItemStack oakPlywood = new ItemStack(MenuItems.OakPlywood());
        ItemStack birchPlywood = new ItemStack(MenuItems.BirchPlywood());
        ItemStack junglePlywood = new ItemStack(MenuItems.JunglePlywood());
        ItemStack darkOakPlywood = new ItemStack(MenuItems.DarkOakPlywood());
        ItemStack sprucePlywood = new ItemStack(MenuItems.SprucePlywood());
        ItemStack acaciaPlywood = new ItemStack(MenuItems.AcaciaPlywood());
        ItemStack scantling = new ItemStack(MenuItems.Scantling());
        ItemStack timberSquare = new ItemStack(MenuItems.TimberSquare());
        ItemStack reinforcedStick = new ItemStack(MenuItems.ReinforcedStick());
        ItemStack lumberManosStone = new ItemStack(MenuItems.LumberManosStone());
        
        
        //Menu Items
        ItemStack chopping = new ItemStack(MenuItems.ChoppingIcon());
        ItemStack grinding  = new ItemStack(MenuItems.GrindingIcon());
        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack backButton = new ItemStack(MenuItems.BackButton());
        ItemStack heating = new ItemStack(MenuItems.HeatingIcon());


        ItemStack[] menu_items = {oakPlank, birchPlank, darkOakPlank, junglePlank, acaciaPlank, sprucePlank, oakPlywood, birchPlywood, darkOakPlywood,
                junglePlywood, acaciaPlywood,sprucePlywood, scantling, timberSquare, reinforcedStick, lumberManosStone, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                backButton, chopping, grinding, heating, filler, filler, filler, filler, filler};
        for (int i = 0; i < ProcessingMenu.getSize(); i++) {
            ProcessingMenu.setItem(i, menu_items[i]);
        }

        return ProcessingMenu;
    }
}
