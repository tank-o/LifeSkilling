package me.tanko_.lifeskills.menus;
import me.tanko_.lifeskills.MenuItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainMenu{

    public static Inventory CreateMenu(Player player){
        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemStack skills = MenuItems.SkillIcon();
        ItemStack crafting = MenuItems.CraftingIcon();
        ItemStack processing = MenuItems.ProcessingIcon();
        //Inventory
        Inventory MainMenu = Bukkit.createInventory(player,27, "Life Skill Menu");

        ItemStack[] menu_items = {filler,filler,filler,filler,filler,filler,filler,filler,filler,
                filler,filler,filler,skills,crafting,processing,filler,filler,filler,
                filler,filler,filler,filler,filler,filler,filler,filler,filler};
        for (int i = 0;i < MainMenu.getSize();i++){
            MainMenu.setItem(i,menu_items[i]);
        }

        return MainMenu;
    }
}
