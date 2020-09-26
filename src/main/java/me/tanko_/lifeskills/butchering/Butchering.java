package me.tanko_.lifeskills.butchering;

import me.tanko_.lifeskills.customItems.ButcheringMaterials;
import me.tanko_.lifeskills.customItems.OtherMaterials;
import me.tanko_.lifeskills.data.PlayerData;
import me.tanko_.lifeskills.getRank.LevelToRank;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Butchering {
    
        public static void GetDrops(Player player, String Meat){
            ArrayList<ItemStack> Drops = new ArrayList<>();
            Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
            String ID = player.getUniqueId().toString();
            int gatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
            int butcheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Butchering.Mastery");
            int totalMastery = gatheringMastery + butcheringMastery;
            int bracket = (totalMastery/50) * 50;
            //Loot Numbers
            double lootNum = ThreadLocalRandom.current().nextDouble(0, 100.01);
            lootNum = lootNum*100;
            lootNum = Math.round(lootNum);
            lootNum = lootNum /100;

            double UncommonNum = ThreadLocalRandom.current().nextDouble(0, 100.01);
            UncommonNum = UncommonNum*100;
            UncommonNum = Math.round(UncommonNum);
            UncommonNum = UncommonNum /100;

            double RareNum = ThreadLocalRandom.current().nextDouble(0, 100.01);
            RareNum = RareNum*100;
            RareNum = Math.round(RareNum);
            RareNum = RareNum /100;

            double EpicNum = ThreadLocalRandom.current().nextDouble(0, 100.01);
            EpicNum = EpicNum*100;
            EpicNum = Math.round(EpicNum);
            EpicNum = EpicNum /100;

            double LegendaryNum = ThreadLocalRandom.current().nextDouble(0, 100.01);
            LegendaryNum = LegendaryNum*100;
            LegendaryNum = Math.round(LegendaryNum);
            LegendaryNum = LegendaryNum /100;

            int commonChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Common.Chance");
            int minCommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Common.Min");
            int maxCommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Common.Max");

            int uncommonChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Uncommon.Chance");
            int minUncommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Uncommon.Min");
            int maxUncommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Uncommon.Max");

            int rareChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Rare.Chance");
            int minRare = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Rare.Min");
            int maxRare = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Rare.Max");

            int epicChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + bracket + ".Rare.Chance");
            int minEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + bracket + ".Rare.Min");
            int maxEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + bracket + ".Rare.Max");

            int legChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Legendary.Chance");
            int minLeg = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Legendary.Min");
            int maxLeg = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + bracket + ".Legendary.Max");

            int meatAmount = ThreadLocalRandom.current().nextInt(minCommon, maxCommon + 1);
            int UncommonAmount = ThreadLocalRandom.current().nextInt(minUncommon, maxUncommon + 1);
            int RareAmount = ThreadLocalRandom.current().nextInt(minRare, maxRare + 1);
            int EpicAmount = ThreadLocalRandom.current().nextInt(minEpic, maxEpic + 1);
            int LegendaryAmount = ThreadLocalRandom.current().nextInt(minLeg, maxLeg + 1);

            if (lootNum <= commonChance){
                CommonDrops(Drops,lootNum,meatAmount,Meat);
            }
            if (UncommonNum <= uncommonChance) {
                UncommonDrops(Drops,UncommonAmount);
            }
            if (RareNum <= rareChance){
                RareDrops(Drops,RareAmount);
            }
            if (EpicNum <= epicChance){
                EpicDrops(Drops,EpicAmount);
            }
            if (LegendaryNum <= legChance){
                LegendaryDrops(Drops,LegendaryAmount);
            }
            ButcheringXP(player,Meat);
            for (ItemStack drop : Drops) {
                player.getInventory().addItem(drop);
            }
        }
        public static void CommonDrops(ArrayList<ItemStack> Drops,double lootNum,int meatAmount, String meat){
            ItemStack Meat = ButcheringMaterials.LambMeat();
            switch(meat){
                case "wolf":
                    Meat = ButcheringMaterials.WolfMeat();
                    break;
                case "pork":
                    Meat = ButcheringMaterials.Pork();
                    break;
                case "lamb":
                    Meat = ButcheringMaterials.LambMeat();
                    break;
            }
            if ((lootNum >= 0) && (lootNum <= 1000)){
                for (int i = 0; i < meatAmount; i++) {
                    Drops.add(Meat);
                }
            }
        }
        public static void UncommonDrops(ArrayList<ItemStack> Drops,int amount){
            int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
            if (internalNumber == 0){
                    for (int i = 0;i < amount;i++) {
                        Drops.add(OtherMaterials.GlowDust());
                    }
                }
            }
        public static void RareDrops(ArrayList<ItemStack> Drops,int amount){
            int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
            if (internalNumber == 0){
                for (int i=0;i < amount;i++) {
                    Drops.add(OtherMaterials.EnhanceFragment());
                }
            }
        }
        public static void EpicDrops(ArrayList<ItemStack> Drops,int amount){
            int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
            if (internalNumber == 0){
                for (int i=0;i < amount;i++) {
                    Drops.add(OtherMaterials.EnhanceStone());
                }
            }
        }
        public static void LegendaryDrops(ArrayList<ItemStack> Drops,int amount){
            int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
            if (internalNumber == 0){
                for (int i=0;i < amount;i++) {
                    Drops.add(OtherMaterials.EnhanceStone());
                }
            }

        }


        public static void ButcheringXP(Player player,String Meat){
            Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
            String ID = player.getUniqueId().toString();
            int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
            double XP = PlayerData.getFile().getDouble(ID + ".Gathering.XP");
            int Level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
            double XPToNext = (10277850 + (22.56924 - 10277850)/(1 + Math.pow((Level/13514.49),1.603196))) * 1000;
            double ButcheringXPMulti = PlayerData.getFile().getDouble(ID + ".Gathering.Butchering.XPMulti");
            double GatheringXPMulti = PlayerData.getFile().getDouble(ID + ".Gathering.XPMulti");

            if (Meat.equalsIgnoreCase("wolf")){
                double wolfXP = plugin.getConfig().getDouble("Gathering.Butchering.MeatXP.WOLF");
                XP = XP + wolfXP;
            }else if (Meat.equalsIgnoreCase("lamb")){
                double lambXP = plugin.getConfig().getDouble("Gathering.Butchering.MeatXP.LAMB");
                XP = XP + lambXP;
            }else if (Meat.equalsIgnoreCase("pork")){
                double porkXP = plugin.getConfig().getDouble("Gathering.Butchering.MeatXP.PORK");
                XP = XP + porkXP;
            }
            while (XP >= XPToNext){
                Level += 1;
                GatheringMastery = GatheringMastery + 5;
                player.sendMessage(ChatColor.MAGIC + "lfjdgsurmncidkjsovdu");
                player.sendMessage(ChatColor.GRAY + "Gathering " + LevelToRank.LevelToRank(Level));
                player.sendMessage(ChatColor.MAGIC + "lfjdgsurmncidkjsovdu");
                XP -= XPToNext;
                XPToNext = (10277850 + (22.56924 - 10277850)/(1 + Math.pow((Level/13514.49),1.603196))) * 1000;
            }
            PlayerData.getFile().set(ID + ".Gathering.Level",Level);
            PlayerData.getFile().set(ID + ".Gathering.XP",XP);
            PlayerData.getFile().set(ID + ".Gathering.Mastery",GatheringMastery);
            PlayerData.save();
        }
}

