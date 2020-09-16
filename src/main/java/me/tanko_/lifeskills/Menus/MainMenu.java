package me.tanko_.lifeskills.Menus;

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

import java.util.ArrayList;

public class MainMenu implements CommandExecutor {

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


        //Inventory
        Inventory MainMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack Skills = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemStack Crafting = new ItemStack(Material.CRAFTING_TABLE);
        ItemStack Processing = new ItemStack(Material.ANVIL);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);

        ItemMeta SkillsMeta = Skills.getItemMeta();
        SkillsMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Skills");
        SkillsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> SkillsLore = new ArrayList<>();
        SkillsLore.add(ChatColor.GRAY + "Click here to view information about");
        SkillsLore.add(ChatColor.GRAY + "your SKILLS!");
        SkillsMeta.setLore(SkillsLore);
        Skills.setItemMeta(SkillsMeta);

        ItemMeta CraftingMeta = Crafting.getItemMeta();
        CraftingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Crafting");
        CraftingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> CraftingLore = new ArrayList<>();
        CraftingLore.add(ChatColor.GRAY + "Click here to view information about");
        CraftingLore.add(ChatColor.GRAY + "CRAFTING and what you can craft");
        CraftingMeta.setLore(CraftingLore);
        Crafting.setItemMeta(CraftingMeta);

        ItemMeta ProcessingMeta = Processing.getItemMeta();
        ProcessingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ProcessingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Processing");
        ArrayList<String> ProcessingLore = new ArrayList<>();
        ProcessingLore.add(ChatColor.GRAY + "Click here to view information about");
        ProcessingLore.add(ChatColor.GRAY + "PROCESSING and what you can process");
        ProcessingMeta.setLore(ProcessingLore);
        Processing.setItemMeta(ProcessingMeta);

        ItemStack[] menu_items = {Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,
                Filler,Filler,Filler,Skills,Crafting,Processing,Filler,Filler,Filler,
                Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler,Filler};
        for (int i = 0;i < MainMenu.getSize();i++){
            MainMenu.setItem(i,menu_items[i]);
        }

        return MainMenu;
    }
}
