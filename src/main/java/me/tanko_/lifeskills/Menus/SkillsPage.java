package me.tanko_.lifeskills.Menus;

import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.GetRank.LevelToRank;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

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
        String ID = player.getUniqueId().toString();
        int Level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
        //Inventory
        Inventory SkillMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack Gathering = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack BackButton = new ItemStack(Material.BARRIER);

        ItemMeta GatheringMeta = Gathering.getItemMeta();
        GatheringMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Gathering");
        ArrayList<String> GatheringLore = new ArrayList<>();
        GatheringLore.add(LevelToRank.LevelToRank(Level));
        GatheringLore.add(ChatColor.GRAY + "Mastery: " + PlayerData.getFile().getInt( ID + ".Gathering.Mastery"));
        GatheringLore.add("");
        GatheringLore.add(ChatColor.GRAY + "Lumbering: " + PlayerData.getFile().getInt( ID + ".Gathering.Lumbering.Mastery"));
        GatheringLore.add(ChatColor.GRAY + "Mining: " + PlayerData.getFile().getInt( ID + ".Gathering.Mining.Mastery"));
        GatheringLore.add(ChatColor.GRAY + "Butchering: " + PlayerData.getFile().getInt( ID + ".Gathering.Butchering.Mastery"));
        GatheringLore.add("");
        GatheringLore.add(ChatColor.GRAY + "Click to view more info");
        GatheringMeta.setLore(GatheringLore);
        Gathering.setItemMeta(GatheringMeta);

        ItemMeta BackMeta = BackButton.getItemMeta();
        BackMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        BackButton.setItemMeta(BackMeta);

        ItemStack[] menu_items = {Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,
                Filler,Filler,Filler,Filler,Gathering,Filler,Filler,Filler,Filler,
                BackButton,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler};
        for (int i = 0;i < SkillMenu.getSize();i++){
            SkillMenu.setItem(i,menu_items[i]);
        }

        return SkillMenu;
    }
}
