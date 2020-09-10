package me.tanko_.lifeskills.Lumbering;

import me.tanko_.lifeskills.CustomItems.LumberingMaterials;
import me.tanko_.lifeskills.CustomItems.OtherMaterials;
import me.tanko_.lifeskills.Data.PlayerData;
import me.tanko_.lifeskills.LifeSkills;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Lumbering {
    public static void GetDrops(Player player, String Wood){
        ArrayList<ItemStack> Drops = new ArrayList<ItemStack>();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        int LumberingMastery = PlayerData.getFile().getInt(ID + ".Lumbering.Mastery");
        int TotalMastery = GatheringMastery + LumberingMastery;
        int Bracket = (TotalMastery/50) * 50;
        int lootNum = ThreadLocalRandom.current().nextInt(1, 1000 + 1);

        int CommonChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Chance");
        int MinCommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Min");
        int MaxCommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Max");

        int UncommonChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Chance");
        int MinUncommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Min");
        int MaxUncommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Max");

        int RareChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Chance");
        int MinRare = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Min");
        int MaxRare = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Max");

        int LegendaryChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Chance");
        int MinLegendary = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Min");
        int MaxLegendary = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Max");

        int TimberAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int LogAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int UncommonAmount = ThreadLocalRandom.current().nextInt(MinUncommon, MaxUncommon + 1);
        int RareAmount = ThreadLocalRandom.current().nextInt(MinRare, MaxRare + 1);
        int LegendaryAmount = ThreadLocalRandom.current().nextInt(MinLegendary, MaxLegendary + 1);

        if (lootNum <= CommonChance){
            CommonDrops(Drops,lootNum,TimberAmount,Wood,LogAmount);
        }else if (lootNum <= UncommonChance) {
            UncommonDrops(Drops,UncommonAmount,lootNum,UncommonChance,Wood);
        }else if (lootNum <= RareChance){
            RareDrops(Drops,RareAmount,lootNum,RareChance);
        }else if (lootNum <= LegendaryChance){
            LegendaryDrops(Drops,LegendaryAmount,lootNum,LegendaryChance);
        }
    }

    public static void CommonDrops(ArrayList<ItemStack> Drops,int lootNum,int timberAmount, String wood,int logAmount){
        ItemStack Wood = LumberingMaterials.OakTimber();
        switch(wood){
            case "acacia":
                Wood = LumberingMaterials.AcaciaTimber();
            case "birch":
                Wood = LumberingMaterials.BirchTimber();
            case "oak":
                Wood = LumberingMaterials.OakTimber();
            case "darkoak":
                Wood = LumberingMaterials.DarkOakTimber();
            case "jungle":
                Wood = LumberingMaterials.JungleTimber();
            case "spruce":
                Wood = LumberingMaterials.SpruceTimber();
        }
        if ((lootNum >= 0) && (lootNum <= 750)){
            for (int i = 0; i < timberAmount; i++) {
                Drops.add(Wood);
            }
        }
        if ((lootNum >= 250) && (lootNum <= 1000)) {
            for (int i = 0; i < logAmount; i++) {
                Drops.add(LumberingMaterials.Log());
            }
        }
    }
    public static void UncommonDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance,String wood){
        ItemStack Plank = LumberingMaterials.OakPlank();
        switch(wood){
            case "acacia":
                Plank = LumberingMaterials.AcaciaPlank();
            case "birch":
                Plank = LumberingMaterials.BirchPlank();
            case "oak":
                Plank = LumberingMaterials.OakPlank();
            case "darkoak":
                Plank = LumberingMaterials.DarkOakPlank();
            case "jungle":
                Plank = LumberingMaterials.JunglePlank();
            case "spruce":
                Plank = LumberingMaterials.SprucePlank();
        }
        if (lootNum <= chance){
            for (int i = 0;i < amount;i++) {
                Drops.add(Plank);
            }
        }
    }
    public static void RareDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){
        if ((lootNum >= 0) || (lootNum <= chance)){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.GlowDust());
            }
        }
    }
    public static void LegendaryDrops(ArrayList<ItemStack> Drops,int amount,int lootNum,int chance){

    }
}
