package me.tanko_.lifeskills.Lumbering;

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

public class Lumbering {
    public static void GetDrops(Player player, String Wood){
        ArrayList<ItemStack> Drops = new ArrayList<ItemStack>();
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        int LumberingMastery = PlayerData.getFile().getInt(ID + ".Gathering.Lumbering.Mastery");
        int TotalMastery = GatheringMastery + LumberingMastery;
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

        int CommonChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Chance");
        int MinCommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Min");
        int MaxCommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Common.Max");

        int UncommonChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Chance");
        int MinUncommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Min");
        int MaxUncommon = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Uncommon.Max");

        int RareChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Chance");
        int MinRare = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Min");
        int MaxRare = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Rare.Max");

        int EpicChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Epic.Chance");
        int MinEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Epic.Min");
        int MaxEpic = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Epic.Max");

        int LegendaryChance = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Chance");
        int MinLegendary = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Min");
        int MaxLegendary = plugin.getConfig().getInt("Gathering.Lumbering.Mastery." + Bracket + ".Legendary.Max");

        int TimberAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int LogAmount = ThreadLocalRandom.current().nextInt(MinCommon, MaxCommon + 1);
        int UncommonAmount = ThreadLocalRandom.current().nextInt(MinUncommon, MaxUncommon + 1);
        int RareAmount = ThreadLocalRandom.current().nextInt(MinRare, MaxRare + 1);
        int EpicAmount = ThreadLocalRandom.current().nextInt(MinEpic, MaxEpic + 1);
        int LegendaryAmount = ThreadLocalRandom.current().nextInt(MinLegendary, MaxLegendary + 1);

        player.sendMessage(String.valueOf(CommonChance));
        player.sendMessage(String.valueOf(UncommonChance));
        player.sendMessage(String.valueOf(RareChance));
        player.sendMessage(String.valueOf(EpicChance));
        player.sendMessage(String.valueOf(LegendaryChance));

        if (lootNum <= CommonChance){
            CommonDrops(Drops,lootNum,TimberAmount,Wood,LogAmount);
        }
        if (UncommonNum <= UncommonChance) {
            UncommonDrops(Drops,UncommonAmount,UncommonChance,Wood);
        }
        if (RareNum <= RareChance){
            RareDrops(Drops,RareAmount,RareChance);
        }
        if (EpicNum <= EpicChance){
            EpicDrops(Drops,EpicAmount,EpicChance);
            player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "EPIC DROP!");
        }
        if (LegendaryNum <= LegendaryChance){
            LegendaryDrops(Drops,LegendaryAmount,LegendaryChance);
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY DROP!");
        }
        LumberingXP(player,Wood);

        for (ItemStack drop : Drops) {
            player.getInventory().addItem(drop);
        }
    }
    public static void CommonDrops(ArrayList<ItemStack> Drops,double lootNum,int timberAmount, String wood,int logAmount){
        ItemStack Wood = LumberingMaterials.OakTimber();
        switch(wood){
            case "acacia":
                Wood = LumberingMaterials.AcaciaTimber();
                break;
            case "birch":
                Wood = LumberingMaterials.BirchTimber();
                break;
            case "oak":
                Wood = LumberingMaterials.OakTimber();
                break;
            case "darkoak":
                Wood = LumberingMaterials.DarkOakTimber();
                break;
            case "jungle":
                Wood = LumberingMaterials.JungleTimber();
                break;
            case "spruce":
                Wood = LumberingMaterials.SpruceTimber();
                break;
        }
        if ((lootNum >= 0.0) && (lootNum <= 75.0)){
            for (int i = 0; i < timberAmount; i++) {
                Drops.add(Wood);
            }
        }
        if ((lootNum >= 25.0) && (lootNum <= 100.0)) {
            for (int i = 0; i < logAmount; i++) {
                Drops.add(LumberingMaterials.Log());
            }
        }
    }
    public static void UncommonDrops(ArrayList<ItemStack> Drops,int amount,int chance,String wood){
        ItemStack Plank = LumberingMaterials.OakPlank();
        int internalNumber = ThreadLocalRandom.current().nextInt(0, 2);
        switch(wood){
            case "acacia":
                Plank = LumberingMaterials.AcaciaPlank();
                break;
            case "birch":
                Plank = LumberingMaterials.BirchPlank();
                break;
            case "oak":
                Plank = LumberingMaterials.OakPlank();
                break;
            case "darkoak":
                Plank = LumberingMaterials.DarkOakPlank();
                break;
            case "jungle":
                Plank = LumberingMaterials.JunglePlank();
                break;
            case "spruce":
                Plank = LumberingMaterials.SprucePlank();
                break;
        }
        if (internalNumber == 0){
            for (int i = 0;i < amount;i++) {
                Drops.add(Plank);
            }
        } else if (internalNumber == 1){
            for (int i = 0;i < amount;i++) {
                Drops.add(OtherMaterials.GlowDust());
            }
        }
    }
    public static void RareDrops(ArrayList<ItemStack> Drops,int amount,int chance){
        int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
        if (internalNumber == 0){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.EnhanceFragment());
            }
        }
    }
    public static void EpicDrops(ArrayList<ItemStack> Drops,int amount,int chance){
        int internalNumber = ThreadLocalRandom.current().nextInt(0, 1);
        if (internalNumber == 0){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.EnhanceStone());
            }
        }
    }
    public static void LegendaryDrops(ArrayList<ItemStack> Drops,int amount,int chance){
        int internalNumber = ThreadLocalRandom.current().nextInt(0, 7);
        if (internalNumber >= 1){
            for (int i=0;i < amount;i++) {
                Drops.add(OtherMaterials.ManosFragment());
            }
        } else if (internalNumber == 0){
            for (int i=0;i < amount;i++) {
                Drops.add(LumberingMaterials.LumberCore());
            }
        }

    }

    public static void LumberingXP(Player player,String Wood){
        Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        double XP = PlayerData.getFile().getDouble(ID + ".Gathering.XP");
        int Level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
        double XPToNext = (10277850 + (22.56924 - 10277850)/(1 + Math.pow((Level/13514.49),1.603196))) * 1000;
        double XPMulti = PlayerData.getFile().getDouble(ID + ".Gathering.Lumbering.XPMulti");
        if (Wood.equalsIgnoreCase("acacia")){
            double acaciaXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.ACACIA");
            XP = XP + acaciaXP;
        }else if (Wood.equalsIgnoreCase("birch")){
            double birchXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.BIRCH");
            XP = XP + birchXP;
        }else if (Wood.equalsIgnoreCase("oak")){
            double oakXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.OAK");
            XP = XP + oakXP;
        }else if (Wood.equalsIgnoreCase("darkoak")){
            double darkoakXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.DARK_OAK");
            XP = XP + darkoakXP;
        }else if (Wood.equalsIgnoreCase("spruce")){
            double spruceXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.SPRUCE");
            XP = XP + spruceXP;
        }else if (Wood.equalsIgnoreCase("jungle")){
            double jungleXP = plugin.getConfig().getDouble("Gathering.Lumbering.LogXP.JUNGLE");
            XP = XP + jungleXP;
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
