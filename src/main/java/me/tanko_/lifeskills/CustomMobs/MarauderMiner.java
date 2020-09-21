package me.tanko_.lifeskills.CustomMobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class MarauderMiner {

    public static LivingEntity MarauderMiner(Player player, Location loc){
        //Mob items
        ItemStack Helmet = new ItemStack(Material.GOLDEN_HELMET);
        ItemMeta HelmetMeta = Helmet.getItemMeta();
        HelmetMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Marauder Helmet");
        HelmetMeta.addEnchant(Enchantment.OXYGEN,5,true);
        HelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        Helmet.setItemMeta(HelmetMeta);

        ItemStack Chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta ChestplateMeta = Chestplate.getItemMeta();
        ChestplateMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Marauder Chestplate");
        ChestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        Chestplate.setItemMeta(ChestplateMeta);

        ItemStack Leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta LeggingsMeta = Leggings.getItemMeta();
        LeggingsMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Marauder Leggings");
        LeggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        Leggings.setItemMeta(LeggingsMeta);

        ItemStack Boots = new ItemStack(Material.GOLDEN_BOOTS);
        ItemMeta BootsMeta = Boots.getItemMeta();
        BootsMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Marauder Boots");
        BootsMeta.addEnchant(Enchantment.DEPTH_STRIDER,5,true);
        BootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        Boots.setItemMeta(BootsMeta);

        //Mob
        LivingEntity mob = (LivingEntity) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
        mob.attack(player);
        mob.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Marauder Miner");
        mob.setCustomNameVisible(true);

        mob.getEquipment().setHelmet(Helmet);
        mob.getEquipment().setHelmetDropChance(5);
        mob.getEquipment().setChestplate(Chestplate);
        mob.getEquipment().setChestplateDropChance(0);
        mob.getEquipment().setLeggings(Leggings);
        mob.getEquipment().setLeggingsDropChance(0);
        mob.getEquipment().setBoots(Boots);
        mob.getEquipment().setBootsDropChance(5);

        mob.setHealth(20);
        return mob;
    }
}
