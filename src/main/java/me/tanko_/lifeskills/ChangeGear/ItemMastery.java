package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemMastery {

    public static int ReturnMastery(ItemStack Item) {
        int Mastery = 0;
        String ItemName = Item.getItemMeta().getDisplayName();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (ItemName.equals(ChatColor.GOLD + "Master Helmet")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.Base");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.Base");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.Base");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Helmet ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.1Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.1Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.1Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.1Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Helmet ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.2Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.2Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.2Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.2Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Helmet ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.3Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.3Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.3Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.3Star");
        }else if (ItemName.equals(ChatColor.GOLD + "Master Helmet ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.4Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.4Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.4Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.4Star");
        }else if (ItemName.equals(ChatColor.GOLD + "Master Helmet ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.5Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Chestplate ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.5Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Leggings ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.5Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Boots ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.5Star");
        }else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.Base");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Base");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.Base");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.Base");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.1Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.1Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.1Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.1Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.2Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.2Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.2Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.2Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.3Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.3Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.3Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.3Star");
        }else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.4Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.4Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.4Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.4Star");
        }else if (ItemName.equals(ChatColor.GREEN + "Apprentice Helmet ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.5Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Chestplate ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.5Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Leggings ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.5Star");
        } else if (ItemName.equals(ChatColor.GREEN + "Apprentice Boots ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.5Star");
        }  //Tools
        else if (ItemName.equals(ChatColor.GREEN + "Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.Base");
        } else if (ItemName.equals(ChatColor.GREEN + "" + ChatColor.BOLD + "✪ Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.1Star");
        } else if (ItemName.equals(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪ Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.2Star");
        } else if (ItemName.equals(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪ Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.3Star");
        } else if (ItemName.equals(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪ Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.4Star");
        } else if (ItemName.equals(ChatColor.GREEN + "" + ChatColor.BOLD + "✪✪✪✪✪ Apprentice Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.5Star");
        } else if (ItemName.equals(ChatColor.GOLD + "Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.Base");
        } else if (ItemName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "✪ Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.1Star");
        } else if (ItemName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪ Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.2Star");
        } else if (ItemName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪ Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.3Star");
        } else if (ItemName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪ Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.4Star");
        } else if (ItemName.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "✪✪✪✪✪ Master Axe")) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.5Star");
        }
        return Mastery;
    }
}
