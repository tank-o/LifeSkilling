package me.tanko_.lifeskills.menus;

import me.tanko_.lifeskills.MenuItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SkillsPage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.openInventory(CreateMenu(player));
        }
        return true;
    }

    public static Inventory CreateMenu(Player player){
        //Inventory
        Inventory SkillMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack back = MenuItems.BackButton();
        ItemStack gathering = MenuItems.GatheringIcon(player);

        ItemStack[] menu_items = {filler,filler,filler,filler,filler,filler,filler,filler,filler,
                filler,filler,filler,filler,gathering,filler,filler,filler,filler,
                back,filler,filler,filler,filler,filler,filler,filler,filler};

        for (int i = 0;i < SkillMenu.getSize();i++){
            SkillMenu.setItem(i,menu_items[i]);
        }

        return SkillMenu;
    }
}
