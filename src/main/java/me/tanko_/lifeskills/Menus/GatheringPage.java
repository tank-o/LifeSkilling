package me.tanko_.lifeskills.Menus;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
public class GatheringPage implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.openInventory(CreateMenu(player));
        }
        return true;
    }

    public static Inventory CreateMenu(Player player){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        //Mining
        int MiningMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mining.Mastery") + GatheringMastery;
        int MiningBracket = (MiningMastery/50) * 50;
        int MiningRareChance = (plugin.getConfig().getInt("Gathering.Mining.Mastery." + MiningBracket + ".Rare.Chance")/10);
        int MiningLegendaryChance = (plugin.getConfig().getInt("Gathering.Mining.Mastery." + MiningBracket + ".Legendary.Chance")/10);
        int MiningUncommonChance = (plugin.getConfig().getInt("Gathering.Mining.Mastery." + MiningBracket + ".Uncommon.Chance")/10);
        //Lumbering
        int LumberingMastery = PlayerData.getFile().getInt(ID + ".Gathering.Lumbering.Mastery") + GatheringMastery;
        int LumberingBracket = (LumberingMastery/50) * 50;
        int LumberingRareChance = (plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + LumberingBracket + ".Rare.Chance")/10);
        int LumberingLegendaryChance = (plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + LumberingBracket + ".Legendary.Chance")/10);
        int LumberingUncommonChance = (plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + LumberingBracket + ".Uncommon.Chance")/10);
        //Butchering
        int ButcheringMastery = (PlayerData.getFile().getInt(ID + ".Gathering.Butchering.Mastery") + GatheringMastery);
        int ButcheringBracket = (ButcheringMastery/50) * 50;
        int ButcheringRareChance = (plugin.getConfig().getInt("Gathering.Butchering.Mastery." + ButcheringBracket + ".Rare.Chance")/10);
        int ButcheringLegendaryChance = (plugin.getConfig().getInt("Gathering.Butchering.Mastery." + ButcheringBracket + ".Legendary.Chance")/10);
        int ButcheringUncommonChance = (plugin.getConfig().getInt("Gathering.Butchering.Mastery." + ButcheringBracket + ".Uncommon.Chance")/10);

        //Inventory
        Inventory GatheringMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack Mining = new ItemStack(Material.COBBLESTONE);
        ItemStack Lumbering = new ItemStack(Material.OAK_LOG);
        ItemStack Butchering = new ItemStack(Material.MUTTON);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack BackButton = new ItemStack(Material.BARRIER);

        ItemMeta MiningMeta = Mining.getItemMeta();
        MiningMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Mining");
        MiningMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> MiningLore = new ArrayList<>();
        MiningLore.add(ChatColor.GRAY + "Mastery: " + MiningMastery);
        MiningLore.add(ChatColor.WHITE + "Uncommon: " + MiningUncommonChance + "%");
        MiningLore.add(ChatColor.WHITE + "Rare: " + MiningRareChance + "%");
        MiningLore.add(ChatColor.WHITE + "Legendary: " + MiningLegendaryChance + "%");
        MiningMeta.setLore(MiningLore);
        Mining.setItemMeta(MiningMeta);

        ItemMeta LumberingMeta = Lumbering.getItemMeta();
        LumberingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Lumbering");
        LumberingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> LumberingLore = new ArrayList<>();
        LumberingLore.add(ChatColor.GRAY + "Mastery: " + LumberingMastery);
        LumberingLore.add(ChatColor.WHITE + "Uncommon: " + LumberingUncommonChance + "%");
        LumberingLore.add(ChatColor.WHITE + "Rare: " + LumberingRareChance + "%");
        LumberingLore.add(ChatColor.WHITE + "Legendary: " + LumberingLegendaryChance + "%");
        LumberingMeta.setLore(LumberingLore);
        Lumbering.setItemMeta(LumberingMeta);
        
        ItemMeta ButcheringMeta = Butchering.getItemMeta();
        ButcheringMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Butchering");
        ButcheringMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> ButcheringLore = new ArrayList<>();
        ButcheringLore.add(ChatColor.GRAY + "Mastery: " + ButcheringMastery);
        ButcheringLore.add(ChatColor.WHITE + "Uncommon: " + ButcheringUncommonChance + "%");
        ButcheringLore.add(ChatColor.WHITE + "Rare: " + ButcheringRareChance + "%");
        ButcheringLore.add(ChatColor.WHITE + "Legendary: " + ButcheringLegendaryChance + "%");
        ButcheringMeta.setLore(ButcheringLore);
        Butchering.setItemMeta(ButcheringMeta);

        ItemMeta BackMeta = BackButton.getItemMeta();
        BackMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        BackButton.setItemMeta(BackMeta);

        ItemStack[] menu_items = {Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,
                Filler,Filler,Filler,Mining,Lumbering,Butchering,Filler,Filler,Filler,
                BackButton,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler};
        for (int i = 0;i < GatheringMenu.getSize();i++){
            GatheringMenu.setItem(i,menu_items[i]);
        }

        return GatheringMenu;
    }
}


