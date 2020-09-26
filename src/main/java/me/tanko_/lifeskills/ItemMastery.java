package me.tanko_.lifeskills;

import me.tanko_.lifeskills.customItems.CustomArmour;
import me.tanko_.lifeskills.customItems.CustomTools;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemMastery {
    public static int ReturnMastery(ItemStack Item) {
        int Mastery = 0;
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (Item.equals(CustomArmour.MasterHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        } else if (Item.equals(CustomArmour.MasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.Base");
        } else if (Item.equals(CustomArmour.MasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.Base");
        } else if (Item.equals(CustomArmour.MasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.Base");
        } else if (Item.equals(CustomArmour.OneMasterHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.1Star");
        } else if (Item.equals(CustomArmour.OneMasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.1Star");
        } else if (Item.equals(CustomArmour.OneMasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.1Star");
        } else if (Item.equals(CustomArmour.OneMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.OneMaster.Boots.1Star");
        } else if (Item.equals(CustomArmour.TwoMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.2Star");
        } else if (Item.equals(CustomArmour.ThreeMasterHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.3Star");
        }else if (Item.equals(CustomArmour.FourMasterHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.4Star");
        } else if (Item.equals(CustomArmour.FourMasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.4Star");
        } else if (Item.equals(CustomArmour.FourMasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.4Star");
        } else if (Item.equals(CustomArmour.FourMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.4Star");
        }else if (Item.equals(CustomArmour.FiveMasterHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.5Star");
        } else if (Item.equals(CustomArmour.ApprenticeHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.Base");
        } else if (Item.equals(CustomArmour.ApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Base");
        } else if (Item.equals(CustomArmour.ApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.Base");
        } else if (Item.equals(CustomArmour.ApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.Base");
        } else if (Item.equals(CustomArmour.OneApprenticeHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.1Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.2Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.3Star");
        }else if (Item.equals(CustomArmour.FourApprenticeHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.4Star");
        }else if (Item.equals(CustomArmour.FiveApprenticeHelmet())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeChestPlate())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeLeggings())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeBoots())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.5Star");
        }
          //Tools
        else if (Item.equals(CustomTools.ApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticeAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterAxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.5Star");
        }else if (Item.equals(CustomTools.ApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticeButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterButcherKnife())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.5Star");
        }else if (Item.equals(CustomTools.ApprenticePickaxe())) {
        Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticePickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticePickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticePickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticePickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticePickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterPickaxe())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.5Star");
        }
        return Mastery;
    }
}
