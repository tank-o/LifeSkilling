package me.tanko_.lifeskills.Crafting;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;


import java.util.ArrayList;

public class Crafting implements Listener {
    ItemStack air = new ItemStack(Material.AIR);
    @EventHandler
    public void Craft(PrepareItemCraftEvent e){
        CraftingInventory ci = e.getInventory();
        ItemStack craftinv[] = ci.getMatrix();
        ItemStack acaciatimber = LumberingMaterials.AcaciaTimber();
        if ((craftinv[1].equals(acaciatimber) && craftinv[1].getAmount() >= 10) && (craftinv[2].equals(acaciatimber) && craftinv[2].getAmount() >= 10) &&
                (craftinv[3].equals(acaciatimber) && craftinv[3].getAmount() >= 10) && (craftinv[4].equals(air)) &&
                (craftinv[5].equals(air)) && (craftinv[6].equals(air)) && (craftinv[7].equals(air)) &&
                (craftinv[8].equals(air)) && (craftinv[9].equals(air))){

            ci.setResult(LumberingMaterials.AcaciaPlank());
            craftinv[0].setAmount(craftinv[0].getAmount() - 10);
            craftinv[1].setAmount(craftinv[1].getAmount() - 10);


        }


    }
}
