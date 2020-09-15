package me.tanko_.lifeskills.BlockBreak;

import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.Lumbering.Lumbering;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

public class BlockBreak implements Listener {

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block block = e.getBlock();
        //Axes
        ArrayList<String> Axes = new ArrayList<>();
        Collections.addAll(Axes, CustomTools.ApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.OneApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FourApprenticeAxe().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeAxe().getItemMeta().getDisplayName(),
                CustomTools.MasterAxe().getItemMeta().getDisplayName(), CustomTools.OneMasterAxe().getItemMeta().getDisplayName(), CustomTools.TwoMasterAxe().getItemMeta().getDisplayName(), CustomTools.ThreeMasterAxe().getItemMeta().getDisplayName(),
                CustomTools.FourMasterAxe().getItemMeta().getDisplayName(), CustomTools.FiveMasterAxe().getItemMeta().getDisplayName());
        int heldSlot = player.getInventory().getHeldItemSlot();
        ItemStack tool = player.getInventory().getItem(heldSlot);
        for (int i = 0; i < Axes.size();i++) {
            if (tool.getItemMeta().getDisplayName().equals(Axes.get(i))) {
                if (block.getType().equals(Material.ACACIA_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"acacia",block.getLocation());
                } else if (block.getType().equals(Material.BIRCH_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"birch",block.getLocation());
                } else if (block.getType().equals(Material.OAK_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"oak",block.getLocation());
                } else if (block.getType().equals(Material.SPRUCE_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"spruce",block.getLocation());
                } else if (block.getType().equals(Material.JUNGLE_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"jungle",block.getLocation());
                } else if (block.getType().equals(Material.DARK_OAK_LOG)){
                    e.setDropItems(false);
                    Lumbering.GetDrops(player,"darkoak",block.getLocation());
                }
            }
        }
    }
}


