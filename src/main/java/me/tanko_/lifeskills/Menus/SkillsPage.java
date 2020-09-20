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
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        //Inventory
        Inventory SkillMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack Gathering = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemStack Fishing = new ItemStack(Material.FISHING_ROD);
        ItemStack Horsemanship = new ItemStack(Material.GOLDEN_HORSE_ARMOR);
        ItemStack Sailing = new ItemStack(Material.OAK_BOAT);
        ItemStack Cooking = new ItemStack(Material.CAKE);
        ItemStack Trading = new ItemStack(Material.CHEST);
        ItemStack Alchemy = new ItemStack(Material.BREWING_STAND);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack BackButton = new ItemStack(Material.BARRIER);

        ItemMeta GatheringMeta = Gathering.getItemMeta();
        GatheringMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Gathering");
        ArrayList<String> GatheringLore = new ArrayList<>();
        GatheringLore.add(LevelToRank.LevelToRank(Level));
        GatheringLore.add(ChatColor.GRAY + "Mastery: " + PlayerData.getFile().getInt( ID + ".Gathering.Mastery"));
        GatheringLore.add("");
        GatheringLore.add(ChatColor.WHITE + "Lumbering: " + ChatColor.GRAY + (PlayerData.getFile().getInt( ID + ".Gathering.Lumbering.Mastery") + GatheringMastery));
        GatheringLore.add(ChatColor.WHITE + "Mining: " + ChatColor.GRAY + (PlayerData.getFile().getInt( ID + ".Gathering.Mining.Mastery") + GatheringMastery));
        GatheringLore.add(ChatColor.WHITE + "Butchering: " + ChatColor.GRAY + (PlayerData.getFile().getInt( ID + ".Gathering.Butchering.Mastery") + GatheringMastery));
        GatheringLore.add("");
        GatheringLore.add(ChatColor.GOLD + "Click to view more info");
        GatheringMeta.setLore(GatheringLore);
        Gathering.setItemMeta(GatheringMeta);

        ItemMeta BackMeta = BackButton.getItemMeta();
        BackMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        BackButton.setItemMeta(BackMeta);

        ItemStack[] menu_items = {Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,
                Filler,Fishing,Cooking,Alchemy,Gathering,Sailing,Horsemanship,Trading,Filler,
                BackButton,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler};
        for (int i = 0;i < SkillMenu.getSize();i++){
            SkillMenu.setItem(i,menu_items[i]);
        }

        return SkillMenu;
    }
}
