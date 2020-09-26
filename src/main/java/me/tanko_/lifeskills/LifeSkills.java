package me.tanko_.lifeskills;

import me.tanko_.lifeskills.events.ChangeHeldItem;
import me.tanko_.lifeskills.events.*;
import me.tanko_.lifeskills.inventoryChecks.InvClickEvent;
import me.tanko_.lifeskills.commands.GiveCommand;
import me.tanko_.lifeskills.customItems.CustomTools;
import me.tanko_.lifeskills.customItems.LumberingMaterials;
import me.tanko_.lifeskills.customItems.MiningMaterials;
import me.tanko_.lifeskills.customItems.OtherMaterials;
import me.tanko_.lifeskills.data.PlayerData;
import me.tanko_.lifeskills.menus.MainMenu;
import me.tanko_.lifeskills.events.MobKill;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class LifeSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        //Events
        getServer().getPluginManager().registerEvents(new BreakBlock(),this);
        getServer().getPluginManager().registerEvents(new MobKill(),this);
        getServer().getPluginManager().registerEvents(new Join(),this);
        getServer().getPluginManager().registerEvents(new ChangeHeldItem(),this);
        getServer().getPluginManager().registerEvents(new InteractItem(),this);
        getServer().getPluginManager().registerEvents(new ItemDropEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerDeath(),this);
        getServer().getPluginManager().registerEvents(new InvClickEvent(),this);
        //Commands
        Objects.requireNonNull(getCommand("tgive")).setExecutor(new GiveCommand());

        //Load config files
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Playerdata
        PlayerData.setup(this);
        PlayerData.getFile().options().copyDefaults(true);
        PlayerData.save();

        //RegisterRecipes
        NamespacedKey manosingotkey = new NamespacedKey(this,"manos_ingot");
        ShapedRecipe manosingotrecipe = new ShapedRecipe(manosingotkey,MiningMaterials.ManosIngot());
        manosingotrecipe.shape("FFF","FIF","FFF");
        manosingotrecipe.setIngredient('F',new RecipeChoice.ExactChoice(OtherMaterials.ManosFragment()));
        manosingotrecipe.setIngredient('I',new RecipeChoice.ExactChoice(MiningMaterials.RefinedIngot()));
        Bukkit.addRecipe(manosingotrecipe);

        NamespacedKey masteraxekey = new NamespacedKey(this,"manos_axe");
        ShapedRecipe masteraxerecipe = new ShapedRecipe(masteraxekey,CustomTools.MasterAxe());
        masteraxerecipe.shape("II ","IC "," S ");
        masteraxerecipe.setIngredient('I',new RecipeChoice.ExactChoice(MiningMaterials.ManosIngot()));
        masteraxerecipe.setIngredient('S',new RecipeChoice.ExactChoice(LumberingMaterials.ReinforcedStick()));
        masteraxerecipe.setIngredient('C',new RecipeChoice.ExactChoice(LumberingMaterials.LumberCore()));
        Bukkit.addRecipe(masteraxerecipe);

        NamespacedKey apprenticeaxekey = new NamespacedKey(this,"apprentice_axe");
        ShapedRecipe apprenticeaxerecipe = new ShapedRecipe(apprenticeaxekey,CustomTools.ApprenticeAxe());
        apprenticeaxerecipe.shape("II ","IS "," S ");
        apprenticeaxerecipe.setIngredient('I',new RecipeChoice.ExactChoice(MiningMaterials.RefinedIron()));
        apprenticeaxerecipe.setIngredient('S',new RecipeChoice.ExactChoice(LumberingMaterials.ReinforcedStick()));
        Bukkit.addRecipe(apprenticeaxerecipe);

        NamespacedKey masterpickkey = new NamespacedKey(this,"manos_pick");
        ShapedRecipe masterpickrecipe = new ShapedRecipe(masterpickkey,CustomTools.MasterPickaxe());
        masterpickrecipe.shape("III"," C "," S ");
        masterpickrecipe.setIngredient('I',new RecipeChoice.ExactChoice(MiningMaterials.ManosIngot()));
        masterpickrecipe.setIngredient('S',new RecipeChoice.ExactChoice(LumberingMaterials.ReinforcedStick()));
        masterpickrecipe.setIngredient('C',new RecipeChoice.ExactChoice(MiningMaterials.AncientMinersStone()));
        Bukkit.addRecipe(masterpickrecipe);
    }
}
