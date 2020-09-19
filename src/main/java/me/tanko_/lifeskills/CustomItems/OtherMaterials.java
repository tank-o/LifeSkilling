package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class OtherMaterials {
    //Uncommon
    public static ItemStack GlowDust(){
        ItemStack GlowDust = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta GlowDustMeta = GlowDust.getItemMeta();
        GlowDustMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Glow Dust");
        ArrayList<String> GlowDustLore = new ArrayList<>();
        GlowDustLore.add(ChatColor.GRAY + "Dust found at the heart of nature");
        GlowDustMeta.setLore(GlowDustLore);
        GlowDust.setItemMeta(GlowDustMeta);

        return GlowDust;
    }
    //Rare
    public static ItemStack EnhanceFragment(){
        ItemStack EnhanceFragment = new ItemStack(Material.SCUTE);
        ItemMeta EnhanceFragmentMeta = EnhanceFragment.getItemMeta();
        EnhanceFragmentMeta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "Enhance Fragment");
        ArrayList<String> EnhancementFragmentLore = new ArrayList<>();
        EnhancementFragmentLore.add(ChatColor.DARK_GRAY + "Enhancement Material");
        EnhancementFragmentLore.add("");
        EnhancementFragmentLore.add(ChatColor.GRAY + "Combine these fragments with Glow");
        EnhancementFragmentLore.add(ChatColor.GRAY + "Dust to make Enhancement Stones");
        EnhanceFragmentMeta.setLore(EnhancementFragmentLore);
        EnhanceFragment.setItemMeta(EnhanceFragmentMeta);
        return EnhanceFragment;
    }
    //Epic
    public static ItemStack EnhanceStone(){
        ItemStack EnhanceStone = new ItemStack(Material.SLIME_BALL);
        ItemMeta EnhanceStoneMeta = EnhanceStone.getItemMeta();
        EnhanceStoneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Enhance Stone");
        ArrayList<String> EnhancementStoneLore = new ArrayList<>();
        EnhancementStoneLore.add(ChatColor.DARK_GRAY + "Enhancement Material");
        EnhancementStoneLore.add("");
        EnhancementStoneLore.add(ChatColor.GRAY + "Use these to improve your gear");
        EnhanceStoneMeta.setLore(EnhancementStoneLore);
        EnhanceStone.setItemMeta(EnhanceStoneMeta);
        return EnhanceStone;
    }
    //Legendary
    public static ItemStack ManosFragment(){
        ItemStack ManosFragment = new ItemStack(Material.SLIME_BALL);
        ItemMeta ManosFragmentMeta = ManosFragment.getItemMeta();
        ManosFragmentMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Manos Fragment");
        ArrayList<String> ManosmentFragmentLore = new ArrayList<>();
        ManosmentFragmentLore.add(ChatColor.DARK_GRAY + "Manosment Material");
        ManosmentFragmentLore.add("");
        ManosmentFragmentLore.add(ChatColor.GRAY + "Use these to create manos stones");
        ManosFragmentMeta.setLore(ManosmentFragmentLore);
        ManosFragment.setItemMeta(ManosFragmentMeta);
        return ManosFragment;
    }
    //Miscellaneous
    public static ItemStack SkillsMenu(){
        ItemStack skillMenu = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta skillMenuMeta = skillMenu.getItemMeta();
        skillMenuMeta.setDisplayName(ChatColor.YELLOW + "Life Skills Menu" + ChatColor.GRAY + " (Right Click)");
        ArrayList<String> skillMenuLore = new ArrayList<>();

        skillMenuLore.add(ChatColor.GRAY + "Use this item to explore life skilling");
        skillMenuMeta.setLore(skillMenuLore);
        skillMenu.setItemMeta(skillMenuMeta);
        return skillMenu;
    }

}
