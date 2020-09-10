package me.tanko_.lifeskills.CustomItems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class OtherMaterials {
    public static ItemStack GlowDust(){
        ItemStack GlowDust = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta GlowDustMeta = GlowDust.getItemMeta();
        GlowDustMeta.addEnchant(Enchantment.PROTECTION_FALL,1,true);
        GlowDustMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        GlowDustMeta.setDisplayName(ChatColor.GREEN + "Glow Dust");
        ArrayList<String> GlowDustLore = new ArrayList<String>();
        GlowDustLore.add(ChatColor.GRAY + "Dust found at the heart of nature");
        GlowDustMeta.setLore(GlowDustLore);
        GlowDust.setItemMeta(GlowDustMeta);

        return GlowDust;
    }
    public static ItemStack EnhanceFragment(){
        ItemStack EnhanceFragment = new ItemStack(Material.SCUTE);
        ItemMeta EnhanceFragmentMeta = EnhanceFragment.getItemMeta();
        EnhanceFragmentMeta.setDisplayName(ChatColor.BLUE + "Enhance Fragment");
        ArrayList<String> EnhancementFragmentLore = new ArrayList<String>();
        EnhancementFragmentLore.add(ChatColor.DARK_GRAY + "Enhancement Material");
        EnhancementFragmentLore.add("");
        EnhancementFragmentLore.add(ChatColor.GRAY + "Combine these fragments with Glow");
        EnhancementFragmentLore.add(ChatColor.GRAY + "Dust to make Enhancement Stones");
        EnhanceFragmentMeta.setLore(EnhancementFragmentLore);
        EnhanceFragment.setItemMeta(EnhanceFragmentMeta);
        return EnhanceFragment;
    }
    public static ItemStack EnhanceStone(){
        ItemStack EnhanceStone = new ItemStack(Material.SLIME_BALL);
        ItemMeta EnhanceStoneMeta = EnhanceStone.getItemMeta();
        EnhanceStoneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Enhance Stone");
        ArrayList<String> EnhancementStoneLore = new ArrayList<String>();
        EnhancementStoneLore.add(ChatColor.DARK_GRAY + "Enhancement Material");
        EnhancementStoneLore.add("");
        EnhancementStoneLore.add(ChatColor.GRAY + "Use these to improve your gear");
        EnhanceStoneMeta.setLore(EnhancementStoneLore);
        EnhanceStone.setItemMeta(EnhanceStoneMeta);
        return EnhanceStone;
    }

}
