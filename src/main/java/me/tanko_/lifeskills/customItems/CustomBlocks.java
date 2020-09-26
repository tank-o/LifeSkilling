package me.tanko_.lifeskills.customItems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomBlocks {
    public static ItemStack CookingUtensil(){
        ItemStack cookingUtensil = new ItemStack(Material.FURNACE);
        ItemMeta utensilMeta = cookingUtensil.getItemMeta();
        assert utensilMeta != null;
        utensilMeta.setDisplayName("Cooking Utensil");
        cookingUtensil.setItemMeta(utensilMeta);
        return cookingUtensil;
    }
}
