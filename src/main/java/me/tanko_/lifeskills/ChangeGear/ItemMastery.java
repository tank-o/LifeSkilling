package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.plugin.Plugin;

public class ItemMastery {

    public static int ReturnMastery(String Item){
        int Mastery = 0;
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (Item.contains("Master Helmet")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Leggings")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Boots")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }else if (Item.contains("Master Chestplate")) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        }
        return Mastery;
    }
}
