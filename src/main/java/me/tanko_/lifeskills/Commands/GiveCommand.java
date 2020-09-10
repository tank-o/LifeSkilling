package me.tanko_.lifeskills.Commands;

import me.tanko_.lifeskills.CustomItems.CustomTools;
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
            if (player.hasPermission("lifeskills.give")) {
                if (args[0].equals(null) || args[1].equals(null)) {
                    player.sendMessage(command.getUsage());
                }else{
                    if (Bukkit.getServer().getPlayerExact(args[0]) != null){
                        Player victim = (Player) Bukkit.getServer().getPlayerExact(args[0]);
                        if (args[1].equalsIgnoreCase("masteraxe")){
                            victim.getInventory().addItem(CustomTools.MasterAxe());
                        }else if (args[1].equalsIgnoreCase("apprenticeaxe")){
                            victim.getInventory().addItem(CustomTools.ApprenticeAxe());
                        }
                    }
                }
            }
        }
        return true;
    }
}
