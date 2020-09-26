package me.tanko_.lifeskills.menus;

import me.tanko_.lifeskills.LifeSkills;
import me.tanko_.lifeskills.MenuItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class GrindingMenu implements CommandExecutor {

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
        ItemStack chopping = new ItemStack(MenuItems.ChoppingIcon());
        ItemStack grinding  = new ItemStack(MenuItems.GrindingIcon());
        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack back = new ItemStack(MenuItems.BackButton());
        ItemStack heating = new ItemStack(MenuItems.HeatingIcon());
        ItemStack stoneSlab = new ItemStack(MenuItems.StoneSlab());
        ItemStack[] menu_items = {stoneSlab,filler,filler,filler,filler,filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                back, chopping, grinding, heating, filler, filler, filler, filler, filler};
        for (int i = 0; i < GrindingMenu.getSize(); i++) {
            GrindingMenu.setItem(i, menu_items[i]);
        }

        return GrindingMenu;
    }
}
