package me.tanko_.lifeskills.BlockBreak;

import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.LifeSkills;
import me.tanko_.lifeskills.Lumbering.Lumbering;
import me.tanko_.lifeskills.Mining.Mining;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Collections;

public class BlockBreak implements Listener {

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block block = e.getBlock();
        final BlockState state = block.getState();
        Location loc = e.getBlock().getLocation();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        //Axes
        ArrayList<String> Axes = new ArrayList<>();
        Collections.addAll(Axes, CustomTools.ApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.MasterAxe().getItemMeta().getDisplayName(), CustomTools.OneMasterAxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterAxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterAxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterAxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterAxe().getItemMeta().getDisplayName());

        ArrayList<String> Pickaxes = new ArrayList<>();
        Collections.addAll(Pickaxes, CustomTools.ApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticePickaxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticePickaxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticePickaxe().getItemMeta().getDisplayName(),
                CustomTools.MasterPickaxe().getItemMeta().getDisplayName(), CustomTools.OneMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterPickaxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterPickaxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterPickaxe().getItemMeta().getDisplayName());

        int heldSlot = player.getInventory().getHeldItemSlot();
        ItemStack tool = player.getInventory().getItem(heldSlot);
        e.setDropItems(false);
        for (int i = 0; i < Axes.size(); i++) {
            if (tool.getItemMeta().getDisplayName().equals(Axes.get(i))) {
                if (block.getType().equals(Material.ACACIA_LOG)) {
                    Lumbering.GetDrops(player, "acacia");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else if (block.getType().equals(Material.BIRCH_LOG)) {
                    Lumbering.GetDrops(player, "birch");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else if (block.getType().equals(Material.OAK_LOG)) {
                    Lumbering.GetDrops(player, "oak");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else if (block.getType().equals(Material.SPRUCE_LOG)) {
                    Lumbering.GetDrops(player, "spruce");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else if (block.getType().equals(Material.JUNGLE_LOG)) {
                    Lumbering.GetDrops(player, "jungle");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else if (block.getType().equals(Material.DARK_OAK_LOG)) {
                    Lumbering.GetDrops(player, "darkoak");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                }
            }
        }
        for (int k = 0; k < Pickaxes.size(); k++) {
            if (tool.getItemMeta().getDisplayName().equals(Pickaxes.get(k))) {
                if (block.getType().equals(Material.STONE)) {
                    e.setCancelled(true);
                    player.sendMessage("Hello");
                    block.setType(Material.COBBLESTONE);
                    Mining.GetDrops(player,e.getBlock().getLocation());
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                        @Override
                        public void run() {
                            state.update(true,false);
                        }
                    },100);
                    return;
                } else {
                    e.setCancelled(true);
                }
            }
        }
    }
}


