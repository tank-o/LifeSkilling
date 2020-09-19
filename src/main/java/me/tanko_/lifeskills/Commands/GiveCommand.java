package me.tanko_.lifeskills.Commands;

import me.tanko_.lifeskills.CustomItems.CustomArmour;
import me.tanko_.lifeskills.CustomItems.CustomTools;
import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("lifeskills.tgive")) {
                if (args[0].equals(null) || args[1].equals(null)) {
                    player.sendMessage(command.getUsage());
                }else{
                    Player victim = (Player) Bukkit.getServer().getPlayerExact(args[0]);
                    if (victim != null) {
                        try{
                            int amount = Integer.parseInt(args[2]);
                            for (int i =0; i < amount;i++) {
                                //tools
                                if (args[1].equalsIgnoreCase("masteraxe")) {
                                    victim.getInventory().addItem(CustomTools.MasterAxe());
                                } else if (args[1].equalsIgnoreCase("onemasteraxe")) {
                                    victim.getInventory().addItem(CustomTools.OneMasterAxe());
                                } else if (args[1].equalsIgnoreCase("twomasteraxe")) {
                                    victim.getInventory().addItem(CustomTools.TwoMasterAxe());
                                } else if (args[1].equalsIgnoreCase("threemasteraxe")) {
                                    victim.getInventory().addItem(CustomTools.ThreeMasterAxe());
                                } else if (args[1].equalsIgnoreCase("fourmasteraxe")) {
                                    victim.getInventory().addItem(CustomTools.FourMasterAxe());
                                } else if (args[1].equalsIgnoreCase("fivemasteraxe")) {
                                    victim.getInventory().addItem(CustomTools.FiveMasterAxe());
                                } else if (args[1].equalsIgnoreCase("apprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.ApprenticeAxe());
                                } else if (args[1].equalsIgnoreCase("oneapprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.OneApprenticeAxe());
                                } else if (args[1].equalsIgnoreCase("twoapprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.TwoApprenticeAxe());
                                } else if (args[1].equalsIgnoreCase("threeapprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.ThreeApprenticeAxe());
                                } else if (args[1].equalsIgnoreCase("fourapprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.FourApprenticeAxe());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticeaxe")) {
                                    victim.getInventory().addItem(CustomTools.FiveApprenticeAxe());
                                    //armour
                                }else if (args[1].equalsIgnoreCase("masterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.MasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("onemasterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.OneMasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("twomasterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.TwoMasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("threemasterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.ThreeMasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("fourmasterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.FourMasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("fivemasterbutcher")) {
                                    victim.getInventory().addItem(CustomTools.FiveMasterButcherKnife());
                                } else if (args[1].equalsIgnoreCase("apprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.ApprenticeButcherKnife());
                                } else if (args[1].equalsIgnoreCase("oneapprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.OneApprenticeButcherKnife());
                                } else if (args[1].equalsIgnoreCase("twoapprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.TwoApprenticeButcherKnife());
                                } else if (args[1].equalsIgnoreCase("threeapprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.ThreeApprenticeButcherKnife());
                                } else if (args[1].equalsIgnoreCase("fourapprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.FourApprenticeButcherKnife());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticebutcher")) {
                                    victim.getInventory().addItem(CustomTools.FiveApprenticeButcherKnife());
                                }else if (args[1].equalsIgnoreCase("masterpick")) {
                                    victim.getInventory().addItem(CustomTools.MasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("onemasterpick")) {
                                    victim.getInventory().addItem(CustomTools.OneMasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("twomasterpick")) {
                                    victim.getInventory().addItem(CustomTools.TwoMasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("threemasterpick")) {
                                    victim.getInventory().addItem(CustomTools.ThreeMasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("fourmasterpick")) {
                                    victim.getInventory().addItem(CustomTools.FourMasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("fivemasterpick")) {
                                    victim.getInventory().addItem(CustomTools.FiveMasterPickaxe());
                                } else if (args[1].equalsIgnoreCase("apprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.ApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("oneapprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.OneApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("twoapprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.TwoApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("threeapprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.ThreeApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("fourapprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.FourApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticepick")) {
                                    victim.getInventory().addItem(CustomTools.FiveApprenticePickaxe());
                                } else if (args[1].equalsIgnoreCase("masterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.MasterHelmet());
                                } else if (args[1].equalsIgnoreCase("onemasterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.OneMasterHelmet());
                                } else if (args[1].equalsIgnoreCase("twomasterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.TwoMasterHelmet());
                                } else if (args[1].equalsIgnoreCase("threemasterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeMasterHelmet());
                                } else if (args[1].equalsIgnoreCase("fourmasterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.FourMasterHelmet());
                                } else if (args[1].equalsIgnoreCase("fivemasterhelmet")) {
                                    victim.getInventory().addItem(CustomArmour.FiveMasterHelmet());
                                } else if (args[1].equalsIgnoreCase("masterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.MasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("onemasterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.OneMasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("twomasterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.TwoMasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("threemasterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeMasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("fourmasterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.FourMasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("fivemasterchestplate")) {
                                    victim.getInventory().addItem(CustomArmour.FiveMasterChestPlate());
                                } else if (args[1].equalsIgnoreCase("masterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.MasterLeggings());
                                } else if (args[1].equalsIgnoreCase("onemasterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.OneMasterLeggings());
                                } else if (args[1].equalsIgnoreCase("twomasterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.TwoMasterLeggings());
                                } else if (args[1].equalsIgnoreCase("threemasterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeMasterLeggings());
                                } else if (args[1].equalsIgnoreCase("fourmasterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.FourMasterLeggings());
                                } else if (args[1].equalsIgnoreCase("fivemasterleggings")) {
                                    victim.getInventory().addItem(CustomArmour.FiveMasterLeggings());
                                } else if (args[1].equalsIgnoreCase("masterboots")) {
                                    victim.getInventory().addItem(CustomArmour.MasterBoots());
                                } else if (args[1].equalsIgnoreCase("onemasterboots")) {
                                    victim.getInventory().addItem(CustomArmour.OneMasterBoots());
                                } else if (args[1].equalsIgnoreCase("twomasterboots")) {
                                    victim.getInventory().addItem(CustomArmour.TwoMasterBoots());
                                } else if (args[1].equalsIgnoreCase("threemasterboots")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeMasterBoots());
                                } else if (args[1].equalsIgnoreCase("fourmasterboots")) {
                                    victim.getInventory().addItem(CustomArmour.FourMasterBoots());
                                } else if (args[1].equalsIgnoreCase("fivemasterboots")) {
                                    victim.getInventory().addItem(CustomArmour.FiveMasterBoots());
                                } else if (args[1].equalsIgnoreCase("apprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.ApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("oneapprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.OneApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("twoapprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.TwoApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("threeapprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("fourapprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.FourApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticehelmet")) {
                                    victim.getInventory().addItem(CustomArmour.FiveApprenticeHelmet());
                                } else if (args[1].equalsIgnoreCase("apprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.ApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("oneapprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.OneApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("twoapprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.TwoApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("threeapprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("fourapprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.FourApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticechestplate")) {
                                    victim.getInventory().addItem(CustomArmour.FiveApprenticeChestPlate());
                                } else if (args[1].equalsIgnoreCase("apprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.ApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("oneapprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.OneApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("twoapprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.TwoApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("threeapprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("fourapprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.FourApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticeleggings")) {
                                    victim.getInventory().addItem(CustomArmour.FiveApprenticeLeggings());
                                } else if (args[1].equalsIgnoreCase("apprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.ApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("oneapprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.OneApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("twoapprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.TwoApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("threeapprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.ThreeApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("fourapprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.FourApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("fiveapprenticeboots")) {
                                    victim.getInventory().addItem(CustomArmour.FiveApprenticeBoots());
                                } else if (args[1].equalsIgnoreCase("acaciatimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.AcaciaTimber());
                                } else if (args[1].equalsIgnoreCase("birchtimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.BirchTimber());
                                } else if (args[1].equalsIgnoreCase("oaktimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.OakTimber());
                                } else if (args[1].equalsIgnoreCase("jungletimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.JungleTimber());
                                } else if (args[1].equalsIgnoreCase("darkoaktimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.DarkOakTimber());
                                } else if (args[1].equalsIgnoreCase("sprucetimber")) {
                                    victim.getInventory().addItem(LumberingMaterials.SpruceTimber());
                                } else if (args[1].equalsIgnoreCase("acaciaplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.AcaciaPlank());
                                } else if (args[1].equalsIgnoreCase("birchplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.BirchPlank());
                                } else if (args[1].equalsIgnoreCase("oakplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.OakPlank());
                                } else if (args[1].equalsIgnoreCase("jungleplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.JunglePlank());
                                } else if (args[1].equalsIgnoreCase("darkoakplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.DarkOakPlank());
                                } else if (args[1].equalsIgnoreCase("spruceplank")) {
                                    victim.getInventory().addItem(LumberingMaterials.SprucePlank());
                                } else if (args[1].equalsIgnoreCase("acaciaplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.AcaciaPlywood());
                                } else if (args[1].equalsIgnoreCase("birchplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.BirchPlywood());
                                } else if (args[1].equalsIgnoreCase("oakplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.OakPlywood());
                                } else if (args[1].equalsIgnoreCase("jungleplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.JunglePlywood());
                                } else if (args[1].equalsIgnoreCase("darkoakplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.DarkOakPlywood());
                                } else if (args[1].equalsIgnoreCase("spruceplywood")) {
                                    victim.getInventory().addItem(LumberingMaterials.SprucePlywood());
                                } else if (args[1].equalsIgnoreCase("log")) {
                                    victim.getInventory().addItem(LumberingMaterials.Log());
                                } else if (args[1].equalsIgnoreCase("scantling")) {
                                    victim.getInventory().addItem(LumberingMaterials.Scantling());
                                } else if (args[1].equalsIgnoreCase("timbersquare")) {
                                    victim.getInventory().addItem(LumberingMaterials.TimberSquare());
                                }
                            }
                        }catch (NumberFormatException ex) {
                            player.sendMessage(command.getUsage());
                        }
                    }

                }
            }
        }
        return true;
    }
}
