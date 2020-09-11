package me.tanko_.lifeskills.BlockBreak;

import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.Lumbering.Lumbering;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;

public class BlockBreak implements Listener {

    @EventHandler
    public void BlockBreak(BlockBreakEvent e){
        Player player = e.getPlayer();
        Block block = e.getBlock();
        //Axes
        ArrayList<ItemMeta> Axes = new ArrayList<ItemMeta>();
        Collections.addAll(Axes,CustomTools.ApprenticeAxe().getItemMeta(),CustomTools.OneApprenticeAxe().getItemMeta(),CustomTools.TwoApprenticeAxe().getItemMeta(),
                CustomTools.ThreeApprenticeAxe().getItemMeta(),CustomTools.FourApprenticeAxe().getItemMeta(),CustomTools.FiveApprenticeAxe().getItemMeta(),
                CustomTools.MasterAxe().getItemMeta(),CustomTools.OneMasterAxe().getItemMeta(),CustomTools.TwoMasterAxe().getItemMeta(),CustomTools.ThreeMasterAxe().getItemMeta(),
                CustomTools.FourMasterAxe().getItemMeta(),CustomTools.FiveMasterAxe().getItemMeta());
        if (!player.getInventory().getItemInMainHand().equals(Material.AIR)) {
            ItemMeta toolMeta = player.getInventory().getItemInMainHand().getItemMeta();
            for (int i = 0; i < Axes.size(); i++) {
                if (toolMeta.equals(Axes.get(i))) {
                    Location Block = e.getBlock().getLocation();
                    if (block.getType().equals(Material.ACACIA_LOG)) {
                        Lumbering.GetDrops(player, "acacia", Block);
                    } else if (block.getType().equals(Material.BIRCH_LOG)) {
                        player.sendMessage("you broke a birch wood");
                        Lumbering.GetDrops(player, "birch", Block);
                    } else if (block.getType().equals(Material.SPRUCE_LOG)) {
                        Lumbering.GetDrops(player, "spruce", Block);
                    } else if (block.getType().equals(Material.OAK_LOG)) {
                        Lumbering.GetDrops(player, "oak", Block);
                    } else if (block.getType().equals(Material.JUNGLE_LOG)) {
                        Lumbering.GetDrops(player, "jungle", Block);
                    } else if (block.getType().equals(Material.DARK_OAK_LOG)) {
                        Lumbering.GetDrops(player, "darkoak", Block);
                    }
                    e.getBlock().setType(Material.AIR);
                } else {
                    e.setCancelled(true);
                    e.setDropItems(false);
                    break;
                }
            }
        }else {
            e.setCancelled(true);
            e.setDropItems(false);
        }
    }
}


