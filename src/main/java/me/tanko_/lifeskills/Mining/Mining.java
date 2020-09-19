package me.tanko_.lifeskills.Mining;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.CustomItems.MiningMaterials;
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

public class Mining {
    public static void GetDrops(Player player){
        ArrayList<ItemStack> Drops = new ArrayList<ItemStack>();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        int MiningMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mining.Mastery");
        int TotalMastery = GatheringMastery + MiningMastery;
        int Bracket = (TotalMastery/50) * 50;
        int lootNum = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        player.sendMessage(String.valueOf(lootNum));
        player.sendMessage(String.valueOf(Bracket));
        int CommonChance = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Common.Chance");
        int MinCommon = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Common.Min");
        int MaxCommon = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Common.Max");

        int UncommonChance = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Uncommon.Chance");
        int MinUncommon = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Uncommon.Min");
        int MaxUncommon = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Uncommon.Max");

        int RareChance = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Chance");
        int MinRare = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Min");
        int MaxRare = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Max");

        int EpicChance = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Chance");
        int MinEpic = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Min");
        int MaxEpic = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Rare.Max");

        int LegendaryChance = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Legendary.Chance");
        int MinLegendary = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Legendary.Min");
        int MaxLegendary = plugin.getConfig().getInt("Gathering.Mining.Mastery." + Bracket + ".Legendary.Max");

        int StoneAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int MetalAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int UncommonAmount = ThreadLocalRandom.current().nextInt(MinUncommon, MaxUncommon + 1);
        int RareAmount = ThreadLocalRandom.current().nextInt(MinRare, MaxRare + 1);
        int EpicAmount = ThreadLocalRandom.current().nextInt(MinEpic, MaxEpic + 1);
        int LegendaryAmount = ThreadLocalRandom.current().nextInt(MinLegendary, MaxLegendary + 1);

        if (lootNum <= CommonChance){
            CommonDrops(Drops,lootNum,StoneAmount,MetalAmount);
        }
        if (lootNum <= UncommonChance) {
            UncommonDrops(Drops,UncommonAmount,lootNum,UncommonChance);
        }
        if (lootNum <= RareChance){
            RareDrops(Drops,RareAmount,lootNum,RareChance);
        }
        if (lootNum <= EpicChance){
            EpicDrops(Drops,EpicAmount,lootNum,EpicChance);
        }
        if (lootNum <= LegendaryChance){
            LegendaryDrops(Drops,LegendaryAmount,lootNum,LegendaryChance);
        }
        MiningXP(player);

        for (ItemStack drop : Drops) {
            player.getInventory().addItem(drop);
        }
    }
    public static void CommonDrops(ArrayList<ItemStack> Drops,int lootNum,int stoneAmount,int metalAmount){
        ItemStack Stone = MiningMaterials.RoughStone();
        if ((lootNum >= 0) && (lootNum <= 750)){
            for (int i = 0; i < stoneAmount; i++) {
                Drops.add(Stone);
            }
        }
        if ((lootNum >= 600) && (lootNum <= 733)) {
            for (int i = 0; i < metalAmount; i++) {
                Drops.add(MiningMaterials.CopperOre());
            }
        } else if ((lootNum >= 866) && (lootNum <= 1000)){
            for (int i = 0; i < metalAmount; i++) {
                Drops.add(MiningMaterials.IronOre());
            }
        } else if ((lootNum >= 733) && (lootNum <= 866)){
            for (int i = 0; i < metalAmount; i++) {
                Drops.add(MiningMaterials.GoldOre());
            }
        }


    }
    public static void UncommonDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){
        if (lootNum <= chance/3){
            for (int i = 0;i < amount;i++) {
                Drops.add(MiningMaterials.CopperFragment());
            }
        } else if ((lootNum <= chance/3) && (lootNum >= (2* chance/3))){
            for (int i = 0;i < amount;i++) {
                Drops.add(MiningMaterials.IronFragment());
            }
        } else if ((lootNum <= (2* chance/3)) && (lootNum >= chance)){
            for (int i = 0;i < amount;i++) {
                Drops.add(MiningMaterials.GoldFragment());
            }
        }

    }
    public static void RareDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){
        if ((lootNum >= 0) || (lootNum <= chance/4)){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.EnhanceFragment());
            }
        } else  if ((lootNum <= chance/4) && (lootNum >= (2* chance/4))){
            for (int i=0;i < amount;i++) {
                Drops.add(MiningMaterials.CopperIngot());
            }
        } else if ((lootNum <= (2* chance/4)) && (lootNum >= (3* chance/4))){
            for (int i=0;i < amount;i++) {
                Drops.add(MiningMaterials.IronIngot());
            }
        } else if ((lootNum <= (3* chance/4)) && (lootNum >= chance)){
            for (int i=0;i < amount;i++) {
                Drops.add(MiningMaterials.GoldIngot());
            }
        }
    }
    public static void EpicDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){
        if ((lootNum >= 0) || (lootNum <= chance/2)){
            for (int i=0;i < amount;i++) {
                Drops.add(MiningMaterials.RefinedIngot());
            }
        } else if ((lootNum > chance/2) || (lootNum <= chance)){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.EnhanceStone());
            }
        }
    }
    public static void LegendaryDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){
        if ((lootNum >= 0) || (lootNum <= chance/2)){
            for (int i=0;i < amount;i++) {
                Drops.add(MiningMaterials.AncientMinersStone());
            }
        } else if ((lootNum > chance/2) || (lootNum <= chance)){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.EnhanceStone());
            }
        }
    }

    public static void MiningXP(Player player){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        double XP = PlayerData.getFile().getDouble(ID + ".Gathering.XP");
        int Level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
        double XPToNext = (10277850 + (22.56924 - 10277850)/(1 + Math.pow((Level/13514.49),1.603196))) * 1000;
        double XPMulti = PlayerData.getFile().getDouble(ID + ".Gathering.Mining.XPMulti");
        double StoneXP = plugin.getConfig().getDouble("Gathering.Mining.XP.STONE");
        XP = XP + StoneXP;
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
