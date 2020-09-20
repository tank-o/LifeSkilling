package me.tanko_.lifeskills.Fishing;

import org.bukkit.entity.FishHook;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ThreadLocalRandom;

public class OnPlayerFish implements Listener {

    @EventHandler
    public void onPlayerFish(PlayerFishEvent e){
        Player player = e.getPlayer();
        FishHook hook = e.getHook();

        if (e.getCaught() != null){
            Item i = (Item) e.getCaught();
            ItemStack newItem = i.getItemStack();
        }
    }

    public static ItemStack newFishDrops(ItemStack drop){
        double lootNum = ThreadLocalRandom.current().nextDouble(0, 100.01);

        //change item drops here based on outcome of loot number


        return drop;
    }
}
