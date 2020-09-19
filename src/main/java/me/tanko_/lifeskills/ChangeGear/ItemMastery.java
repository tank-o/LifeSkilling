package me.tanko_.lifeskills.ChangeGear;

import me.tanko_.lifeskills.CustomItems.CustomArmour;
import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemMastery {

    public static int ReturnMastery(String Item) {
        int Mastery = 0;
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        if (Item.equals(CustomArmour.MasterHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.Base");
        } else if (Item.equals(CustomArmour.MasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.Base");
        } else if (Item.equals(CustomArmour.MasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.Base");
        } else if (Item.equals(CustomArmour.MasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.Base");
        } else if (Item.equals(CustomArmour.OneMasterHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.1Star");
        } else if (Item.equals(CustomArmour.OneMasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.1Star");
        } else if (Item.equals(CustomArmour.OneMasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.1Star");
        } else if (Item.equals(CustomArmour.OneMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.OneMaster.Boots.1Star");
        } else if (Item.equals(CustomArmour.TwoMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.2Star");
        } else if (Item.equals(CustomArmour.TwoMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.2Star");
        } else if (Item.equals(CustomArmour.ThreeMasterHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.3Star");
        } else if (Item.equals(CustomArmour.ThreeMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.3Star");
        }else if (Item.equals(CustomArmour.FourMasterHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.4Star");
        } else if (Item.equals(CustomArmour.FourMasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.4Star");
        } else if (Item.equals(CustomArmour.FourMasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.4Star");
        } else if (Item.equals(CustomArmour.FourMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.4Star");
        }else if (Item.equals(CustomArmour.FiveMasterHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Helmet.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Chestplate.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Leggings.5Star");
        } else if (Item.equals(CustomArmour.FiveMasterBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Master.Boots.5Star");
        } else if (Item.equals(CustomArmour.ApprenticeHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.Base");
        } else if (Item.equals(CustomArmour.ApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.Base");
        } else if (Item.equals(CustomArmour.ApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.Base");
        } else if (Item.equals(CustomArmour.ApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.Base");
        } else if (Item.equals(CustomArmour.OneApprenticeHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.1Star");
        } else if (Item.equals(CustomArmour.OneApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.1Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.2Star");
        } else if (Item.equals(CustomArmour.TwoApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.2Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.3Star");
        } else if (Item.equals(CustomArmour.ThreeApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.3Star");
        }else if (Item.equals(CustomArmour.FourApprenticeHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.4Star");
        } else if (Item.equals(CustomArmour.FourApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.4Star");
        }else if (Item.equals(CustomArmour.FiveApprenticeHelmet().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Helmet.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeChestPlate().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Chestplate.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeLeggings().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Leggings.5Star");
        } else if (Item.equals(CustomArmour.FiveApprenticeBoots().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Armour.Apprentice.Boots.5Star");
        }
          //Tools
        else if (Item.equals(CustomTools.ApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticeAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterAxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Axes.Master.Mastery.5Star");
        }else if (Item.equals(CustomTools.ApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticeButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterButcherKnife().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.ButcherKnives.Master.Mastery.5Star");
        }else if (Item.equals(CustomTools.ApprenticePickaxe().getItemMeta().getDisplayName())) {
        Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.Base");
        } else if (Item.equals(CustomTools.OneApprenticePickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoApprenticePickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeApprenticePickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourApprenticePickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveApprenticePickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Apprentice.Mastery.5Star");
        } else if (Item.equals(CustomTools.MasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.Base");
        } else if (Item.equals(CustomTools.OneMasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.1Star");
        } else if (Item.equals(CustomTools.TwoMasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.2Star");
        } else if (Item.equals(CustomTools.ThreeMasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.3Star");
        } else if (Item.equals(CustomTools.FourMasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.4Star");
        } else if (Item.equals(CustomTools.FiveMasterPickaxe().getItemMeta().getDisplayName())) {
            Mastery = plugin.getConfig().getInt("Tools.Pickaxes.Master.Mastery.5Star");
        }
        return Mastery;
    }
}
