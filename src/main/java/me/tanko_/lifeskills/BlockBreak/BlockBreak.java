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
    public void BlockBreak(BlockBreakEvent e){
        Player player = e.getPlayer();
        Block block = e.getBlock();
        //Axes
        ArrayList<ItemStack> Axes = new ArrayList<ItemStack>();
        Collections.addAll(Axes,CustomTools.ApprenticeAxe(),CustomTools.OneApprenticeAxe(),CustomTools.TwoApprenticeAxe(),
                CustomTools.ThreeApprenticeAxe(),CustomTools.FourApprenticeAxe(),CustomTools.FiveApprenticeAxe(),
                CustomTools.MasterAxe(),CustomTools.OneMasterAxe(),CustomTools.TwoMasterAxe(),CustomTools.ThreeMasterAxe(),
                CustomTools.FourMasterAxe(),CustomTools.FiveMasterAxe());

        ItemStack tool = player.getInventory().getItemInMainHand();
        if (!e.isDropItems()) {


        }else{
                if (Axes.contains(tool)){
                    if (block.getType().equals(Material.ACACIA_WOOD)){
                        Lumbering.GetDrops(player,"acacia");
                    }else if (block.getType().equals(Material.BIRCH_WOOD)){
                        Lumbering.GetDrops(player,"birch");
                    }else if (block.getType().equals(Material.SPRUCE_WOOD)){
                        Lumbering.GetDrops(player,"spruce");
                    }else if (block.getType().equals(Material.OAK_WOOD)){
                        Lumbering.GetDrops(player,"oak");
                    }else if (block.getType().equals(Material.JUNGLE_WOOD)){
                        Lumbering.GetDrops(player,"jungle");
                    }else if (block.getType().equals(Material.DARK_OAK_WOOD)){
                        Lumbering.GetDrops(player,"darkoak");
                    }
                }
            }
        }
    }

