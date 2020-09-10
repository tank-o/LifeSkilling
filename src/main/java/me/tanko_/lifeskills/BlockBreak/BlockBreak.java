package me.tanko_.lifeskills.BlockBreak;

import me.tanko_.lifeskills.CustomItems.CustomTools;
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
        Collections.addAll(Axes,CustomTools.ApprenticeAxe(),CustomTools.PRIApprenticeAxe(),CustomTools.DUOApprenticeAxe(),
                CustomTools.TRIApprenticeAxe(),CustomTools.TETApprenticeAxe(),CustomTools.PENApprenticeAxe(),
                CustomTools.MasterAxe(),CustomTools.PRIMasterAxe(),CustomTools.DUOMasterAxe(),CustomTools.TRIMasterAxe(),
                CustomTools.TETMasterAxe(),CustomTools.PENMasterAxe());

        ItemStack tool = player.getInventory().getItemInMainHand();
        if (!e.isDropItems()) {


        }else{
                if (Axes.contains(tool)){

                    if (block.getType().equals(Material.ACACIA_WOOD)){

                    }else if (block.getType().equals(Material.BIRCH_WOOD)){

                    }else if (block.getType().equals(Material.SPRUCE_WOOD)){

                    }else if (block.getType().equals(Material.OAK_WOOD)){

                    }else if (block.getType().equals(Material.JUNGLE_WOOD)){

                    }else if (block.getType().equals(Material.DARK_OAK_WOOD)){

                    }
                }
            }
        }
    }

