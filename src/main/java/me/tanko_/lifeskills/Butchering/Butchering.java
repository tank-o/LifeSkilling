package me.tanko_.lifeskills.Butchering;

import me.tanko_.lifeskills.CustomItems.ButcheringMaterials;
import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.GetRank.LevelToRank;
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
            int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
            int ButcheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Butchering.Mastery");
            int TotalMastery = GatheringMastery + ButcheringMastery;
            int Bracket = (TotalMastery/50) * 50;
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

            int CommonChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Common.Chance");
            int MinCommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Common.Min");
            int MaxCommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Common.Max");

            int UncommonChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Uncommon.Chance");
            int MinUncommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Uncommon.Min");
            int MaxUncommon = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Uncommon.Max");

            int RareChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Rare.Chance");
            int MinRare = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Rare.Min");
            int MaxRare = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Rare.Max");

            int EpicChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Chance");
            int MinEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Min");
            int MaxEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Max");

            int LegendaryChance = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Legendary.Chance");
            int MinLegendary = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Legendary.Min");
            int MaxLegendary = plugin.getConfig().getInt("Gathering.Butchering.Mastery." + Bracket + ".Legendary.Max");

            int MeatAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
            int UncommonAmount = ThreadLocalRandom.current().nextInt(MinUncommon, MaxUncommon + 1);
            int RareAmount = ThreadLocalRandom.current().nextInt(MinRare, MaxRare + 1);
            int EpicAmount = ThreadLocalRandom.current().nextInt(MinEpic, MaxEpic + 1);
            int LegendaryAmount = ThreadLocalRandom.current().nextInt(MinLegendary, MaxLegendary + 1);

            if (lootNum <= CommonChance){
                CommonDrops(Drops,lootNum,MeatAmount,Meat);
            }
            if (UncommonNum <= UncommonChance) {
                UncommonDrops(Drops,UncommonAmount);
            }
            if (RareNum <= RareChance){
                RareDrops(Drops,RareAmount);
            }
            if (EpicNum <= EpicChance){
                EpicDrops(Drops,EpicAmount);
            }
            if (LegendaryNum <= LegendaryChance){
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

