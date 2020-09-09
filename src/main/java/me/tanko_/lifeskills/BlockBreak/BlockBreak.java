package me.tanko_.lifeskills.BlockBreak;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreak implements Listener {

    @EventHandler
    public void BlockBreak(PlayerHarvestBlockEvent e){
        Player player = e.getPlayer();
        Block block = e.getHarvestedBlock();
        ItemStack tool = player.getInventory().getItemInMainHand();
        if (e.getItemsHarvested().equals(null)) {


        }else{
                if (tool.equals(Material.WOODEN_AXE)||tool.equals(Material.STONE_AXE)||tool.equals(Material.IRON_AXE)
                ||tool.equals(Material.GOLDEN_AXE)||tool.equals(Material.DIAMOND_AXE)||tool.equals(Material.NETHERITE_AXE)){
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

