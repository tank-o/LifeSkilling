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

public class HeatingMenu implements CommandExecutor {

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
        ItemStack copperFragment = new ItemStack(MenuItems.CopperFragment());
        ItemStack ironFragment = new ItemStack(MenuItems.IronFragment());
        ItemStack goldFragment = new ItemStack(MenuItems.GoldFragment());
        ItemStack copperIngot = new ItemStack(MenuItems.CopperIngot());
        ItemStack ironIngot = new ItemStack(MenuItems.IronIngot());
        ItemStack goldIngot = new ItemStack(MenuItems.GoldIngot());
        ItemStack mixedRefinedScrap = new ItemStack(MenuItems.MixedRefinedScrap());
        ItemStack mixedRefinedIngot = new ItemStack(MenuItems.RefinedIngot());
        ItemStack refinedIronIngot = new ItemStack(MenuItems.RefinedIron());
        ItemStack refinedCopperIngot = new ItemStack(MenuItems.RefinedCopper());
        ItemStack back = new ItemStack(MenuItems.BackButton());
        ItemStack chopping = new ItemStack(MenuItems.ChoppingIcon());
        ItemStack grinding = new ItemStack(MenuItems.GrindingIcon());
        ItemStack heating = new ItemStack(MenuItems.HeatingIcon());
        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

        ItemStack[] menu_items = {copperFragment,ironFragment,goldFragment,copperIngot,ironIngot,goldIngot, refinedCopperIngot, refinedIronIngot,mixedRefinedScrap,
                mixedRefinedIngot, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                filler, filler, filler, filler, filler, filler, filler, filler, filler,
                back, chopping, grinding, heating, filler, filler, filler, filler, filler};
        for (int i = 0; i < ProcessingMenu.getSize(); i++) {
            ProcessingMenu.setItem(i, menu_items[i]);
        }

        return ProcessingMenu;
    }
}
