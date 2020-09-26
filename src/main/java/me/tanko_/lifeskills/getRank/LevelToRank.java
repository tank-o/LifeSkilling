package me.tanko_.lifeskills.getRank;

import org.bukkit.ChatColor;

public class LevelToRank {

    public static String LevelToRank(int Level){
        String Rank = "";

        if ((Level >= 0) && (Level <= 10)){
            Rank = ChatColor.GRAY + "Novice " + Level;
        } else if ((Level > 10) && (Level <= 20)){
            Rank = ChatColor.GREEN + "Apprentice " + (Level - 10);
        } else if ((Level > 20) && (Level <= 30)){
            Rank = ChatColor.BLUE + "Skillful " + (Level - 20);
        } else if ((Level > 30) && (Level <= 40)){
            Rank = ChatColor.YELLOW + "Professional " + (Level - 30);
        } else if ((Level > 40) && (Level <= 50)){
            Rank = ChatColor.RED + "Experienced " + (Level - 40);
        } else if ((Level > 50) && (Level <= 80)){
            Rank = ChatColor.LIGHT_PURPLE + "Master " + (Level - 50);
        } else if ((Level > 80) && (Level <= 130)){
            Rank = ChatColor.GOLD + "Expert " + (Level - 80);
        }

        return Rank;
    }
}
