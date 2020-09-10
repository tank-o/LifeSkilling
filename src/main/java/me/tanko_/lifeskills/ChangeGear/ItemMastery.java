package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemMastery {

    public static int ReturnMastery(ItemStack Item) {
        int Mastery = 0;
        String ItemName = Item.getItemMeta().getDisplayName();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (ItemName.equals("Master Helmet")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        } else if (ItemName.equals("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.Base");
        } else if (ItemName.equals("Master Leggings")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.Base");
        } else if (ItemName.equals("Master Boots")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.Base");
        } else if (ItemName.equals("Master Helmet ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.1Star");
        } else if (ItemName.equals("Master Chestplate ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.1Star");
        } else if (ItemName.equals("Master Leggings ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.1Star");
        } else if (ItemName.equals("Master Boots ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.1Star");
        } else if (ItemName.equals("Master Helmet ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.2Star");
        } else if (ItemName.equals("Master Chestplate ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.2Star");
        } else if (ItemName.equals("Master Leggings ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.2Star");
        } else if (ItemName.equals("Master Boots ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.2Star");
        } else if (ItemName.equals("Master Helmet ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.3Star");
        } else if (ItemName.equals("Master Chestplate ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.3Star");
        } else if (ItemName.equals("Master Leggings ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.3Star");
        } else if (ItemName.equals("Master Boots ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.3Star");
        }else if (ItemName.equals("Master Helmet ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.4Star");
        } else if (ItemName.equals("Master Chestplate ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.4Star");
        } else if (ItemName.equals("Master Leggings ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.4Star");
        } else if (ItemName.equals("Master Boots ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.4Star");
        }else if (ItemName.equals("Master Helmet ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.5Star");
        } else if (ItemName.equals("Master Chestplate ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.5Star");
        } else if (ItemName.equals("Master Leggings ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.5Star");
        } else if (ItemName.equals("Master Boots ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.5Star");
        }else if (ItemName.equals("Apprentice Helmet")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.Base");
        } else if (ItemName.equals("Apprentice Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Base");
        } else if (ItemName.equals("Apprentice Leggings")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.Base");
        } else if (ItemName.equals("Apprentice Boots")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.Base");
        } else if (ItemName.equals("Apprentice Helmet ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.1Star");
        } else if (ItemName.equals("Apprentice Chestplate ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.1Star");
        } else if (ItemName.equals("Apprentice Leggings ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.1Star");
        } else if (ItemName.equals("Apprentice Boots ✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.1Star");
        } else if (ItemName.equals("Apprentice Helmet ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.2Star");
        } else if (ItemName.equals("Apprentice Chestplate ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.2Star");
        } else if (ItemName.equals("Apprentice Leggings ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.2Star");
        } else if (ItemName.equals("Apprentice Boots ✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.2Star");
        } else if (ItemName.equals("Apprentice Helmet ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.3Star");
        } else if (ItemName.equals("Apprentice Chestplate ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.3Star");
        } else if (ItemName.equals("Apprentice Leggings ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.3Star");
        } else if (ItemName.equals("Apprentice Boots ✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.3Star");
        }else if (ItemName.equals("Apprentice Helmet ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.4Star");
        } else if (ItemName.equals("Apprentice Chestplate ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.4Star");
        } else if (ItemName.equals("Apprentice Leggings ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.4Star");
        } else if (ItemName.equals("Apprentice Boots ✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.4Star");
        }else if (ItemName.equals("Apprentice Helmet ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.5Star");
        } else if (ItemName.equals("Apprentice Chestplate ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.5Star");
        } else if (ItemName.equals("Apprentice Leggings ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.5Star");
        } else if (ItemName.equals("Apprentice Boots ✪✪✪✪✪")) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.5Star");
        }
        return Mastery;
    }
}
