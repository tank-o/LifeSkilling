package me.tanko_.lifeskills.Menus;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
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

public class LumberingProcessingMenu implements CommandExecutor {

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
        Inventory ProcessingMenu = Bukkit.createInventory(player, 54, "Processing Menu");
        //Woods
        ItemStack OakPlank = new ItemStack(LumberingMaterials.OakPlank());
        ItemStack BirchPlank = new ItemStack(LumberingMaterials.BirchPlank());
        ItemStack JunglePlank = new ItemStack(LumberingMaterials.JunglePlank());
        ItemStack DarkOakPlank = new ItemStack(LumberingMaterials.DarkOakPlank());
        ItemStack SprucePlank = new ItemStack(LumberingMaterials.SprucePlank());
        ItemStack AcaciaPlank = new ItemStack(LumberingMaterials.AcaciaPlank());
        ItemStack OakPlywood = new ItemStack(LumberingMaterials.OakPlywood());
        ItemStack BirchPlywood = new ItemStack(LumberingMaterials.BirchPlywood());
        ItemStack JunglePlywood = new ItemStack(LumberingMaterials.JunglePlywood());
        ItemStack DarkOakPlywood = new ItemStack(LumberingMaterials.DarkOakPlywood());
        ItemStack SprucePlywood = new ItemStack(LumberingMaterials.SprucePlywood());
        ItemStack AcaciaPlywood = new ItemStack(LumberingMaterials.AcaciaPlywood());
        
        ItemMeta OakPlankMeta = OakPlank.getItemMeta();
        ArrayList<String> OakPlankLore = new ArrayList<>();
        OakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        OakPlankLore.add("");
        OakPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Oak Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlank"));
        OakPlankMeta.setLore(OakPlankLore);
        OakPlank.setItemMeta(OakPlankMeta);

        ItemMeta BirchPlankMeta = BirchPlank.getItemMeta();
        ArrayList<String> BirchPlankLore = new ArrayList<>();
        BirchPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        BirchPlankLore.add("");
        BirchPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Birch Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.BirchPlank"));
        BirchPlankMeta.setLore(BirchPlankLore);
        BirchPlank.setItemMeta(BirchPlankMeta);

        ItemMeta JunglePlankMeta = JunglePlank.getItemMeta();
        ArrayList<String> JunglePlankLore = new ArrayList<>();
        JunglePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        JunglePlankLore.add("");
        JunglePlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Jungle Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.JunglePlank"));
        JunglePlankMeta.setLore(JunglePlankLore);
        JunglePlank.setItemMeta(JunglePlankMeta);

        ItemMeta DarkOakPlankMeta = DarkOakPlank.getItemMeta();
        ArrayList<String> DarkOakPlankLore = new ArrayList<>();
        DarkOakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        DarkOakPlankLore.add("");
        DarkOakPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "DarkOak Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.DarkOakPlank"));
        DarkOakPlankMeta.setLore(DarkOakPlankLore);
        DarkOakPlank.setItemMeta(DarkOakPlankMeta);

        ItemMeta SprucePlankMeta = SprucePlank.getItemMeta();
        ArrayList<String> SprucePlankLore = new ArrayList<>();
        SprucePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        SprucePlankLore.add("");
        SprucePlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Spruce Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.SprucePlank"));
        SprucePlankMeta.setLore(SprucePlankLore);
        SprucePlank.setItemMeta(SprucePlankMeta);

        ItemMeta AcaciaPlankMeta = AcaciaPlank.getItemMeta();
        ArrayList<String> AcaciaPlankLore = new ArrayList<>();
        AcaciaPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        AcaciaPlankLore.add("");
        AcaciaPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Acacia Timber " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.AcaciaPlank"));
        AcaciaPlankMeta.setLore(AcaciaPlankLore);
        AcaciaPlank.setItemMeta(AcaciaPlankMeta);

        ItemMeta OakPlywoodMeta = OakPlywood.getItemMeta();
        ArrayList<String> OakPlywoodLore = new ArrayList<>();
        OakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        OakPlywoodLore.add("");
        OakPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Oak Plank " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlywood"));
        OakPlywoodMeta.setLore(OakPlywoodLore);
        OakPlywood.setItemMeta(OakPlywoodMeta);

        ItemMeta BirchPlywoodMeta = BirchPlywood.getItemMeta();
        ArrayList<String> BirchPlywoodLore = new ArrayList<>();
        BirchPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        BirchPlywoodLore.add("");
        BirchPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Birch Plank " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.OakPlywood"));
        BirchPlywoodMeta.setLore(BirchPlywoodLore);
        BirchPlywood.setItemMeta(BirchPlywoodMeta);

        ItemMeta JunglePlywoodMeta = JunglePlywood.getItemMeta();
        ArrayList<String> JunglePlywoodLore = new ArrayList<>();
        JunglePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        JunglePlywoodLore.add("");
        JunglePlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Jungle Plank " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.JunglePlywood"));
        JunglePlywoodMeta.setLore(JunglePlywoodLore);
        JunglePlywood.setItemMeta(JunglePlywoodMeta);

        ItemMeta DarkOakPlywoodMeta = DarkOakPlywood.getItemMeta();
        ArrayList<String> DarkOakPlywoodLore = new ArrayList<>();
        DarkOakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        DarkOakPlywoodLore.add("");
        DarkOakPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "DarkOak Plank x10");
        DarkOakPlywoodMeta.setLore(DarkOakPlywoodLore);
        DarkOakPlywood.setItemMeta(DarkOakPlywoodMeta);

        ItemMeta SprucePlywoodMeta = SprucePlywood.getItemMeta();
        ArrayList<String> SprucePlywoodLore = new ArrayList<>();
        SprucePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        SprucePlywoodLore.add("");
        SprucePlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Spruce Plank " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.SprucePlywood"));
        SprucePlywoodMeta.setLore(SprucePlywoodLore);
        SprucePlywood.setItemMeta(SprucePlywoodMeta);

        ItemMeta AcaciaPlywoodMeta = AcaciaPlywood.getItemMeta();
        ArrayList<String> AcaciaPlywoodLore = new ArrayList<>();
        AcaciaPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        AcaciaPlywoodLore.add("");
        AcaciaPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Acacia Plank " + plugin.getConfig().getInt("Processing.CraftAmounts.Chopping.AcaciaPlywood"));
        AcaciaPlywoodMeta.setLore(AcaciaPlywoodLore);
        AcaciaPlywood.setItemMeta(AcaciaPlywoodMeta);
        //Menu Items
        ItemStack Chopping = new ItemStack(Material.DIAMOND_AXE);
        ItemStack Grinding  = new ItemStack(Material.ANVIL);
        ItemStack Filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack BackButton = new ItemStack(Material.BARRIER);
        
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


        ItemStack[] menu_items = {OakPlank, BirchPlank, DarkOakPlank, JunglePlank, AcaciaPlank, SprucePlank, OakPlywood, BirchPlywood, DarkOakPlywood,
                JunglePlywood, AcaciaPlywood, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler, Filler,
                BackButton, Chopping, Grinding, Filler, Filler, Filler, Filler, Filler, Filler};
        for (int i = 0; i < ProcessingMenu.getSize(); i++) {
            ProcessingMenu.setItem(i, menu_items[i]);
        }

        return ProcessingMenu;
    }
}
