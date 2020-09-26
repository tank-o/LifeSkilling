package me.tanko_.lifeskills;

import me.tanko_.lifeskills.customItems.LumberingMaterials;
import me.tanko_.lifeskills.customItems.MiningMaterials;
import me.tanko_.lifeskills.data.PlayerData;
import me.tanko_.lifeskills.getRank.LevelToRank;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class MenuItems {
    public static Plugin plugin = LifeSkills.getPlugin(LifeSkills.class);
    public static ItemStack SkillIcon() {
        ItemStack skills = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta skillsMeta = skills.getItemMeta();
        assert skillsMeta != null : "This icon does not exist";
        skillsMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Skills");
        skillsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> skillsLore = new ArrayList<>();
        skillsLore.add(ChatColor.GRAY + "Click here to view information about");
        skillsLore.add(ChatColor.GRAY + "your SKILLS!");
        skillsMeta.setLore(skillsLore);
        skills.setItemMeta(skillsMeta);
        return skills;
    }
    public static ItemStack CraftingIcon() {
        ItemStack crafting = new ItemStack(Material.CRAFTING_TABLE);
        ItemMeta craftingMeta = crafting.getItemMeta();
        assert craftingMeta != null : "This icon does not exist";
        craftingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Crafting");
        craftingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> craftingLore = new ArrayList<>();
        craftingLore.add(ChatColor.GRAY + "Click here to view information about");
        craftingLore.add(ChatColor.GRAY + "CRAFTING and what you can craft");
        craftingMeta.setLore(craftingLore);
        crafting.setItemMeta(craftingMeta);
        return crafting;
    }
    public static ItemStack ProcessingIcon() {
        ItemStack processing = new ItemStack(Material.ANVIL);
        ItemMeta processingMeta = processing.getItemMeta();
        assert processingMeta != null : "This icon does not exist";
        processingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        processingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Processing");
        ArrayList<String> processingLore = new ArrayList<>();
        processingLore.add(ChatColor.GRAY + "Click here to view information about");
        processingLore.add(ChatColor.GRAY + "PROCESSING and what you can process");
        processingMeta.setLore(processingLore);
        processing.setItemMeta(processingMeta);
        return processing;
    }

    public static ItemStack GatheringIcon(Player player) {
        ItemStack gathering = new ItemStack(Material.DIAMOND_PICKAXE);
        String ID = player.getUniqueId().toString();
        int level = PlayerData.getFile().getInt(ID + ".Gathering.Level");
        int mastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        double XP = PlayerData.getFile().getDouble(ID + ".Gathering.XP");
        double nextXP = (10277850 + (22.56924 - 10277850)/(1 + Math.pow((level/13514.49),1.603196))) * 1000;
        double progressPercent = Math.round((XP/nextXP) * 10000.0) / 100.0;
        String progressBar = "";
        long green = Math.round((XP/nextXP)/0.05);
        ItemMeta gatheringMeta = gathering.getItemMeta();
        assert gatheringMeta != null : "This icon does not exist";
        gatheringMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gatheringMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Gathering");
        ArrayList<String> gatheringLore = new ArrayList<>();
        gatheringLore.add(LevelToRank.LevelToRank(level));
        gatheringLore.add(ChatColor.GRAY + "Mastery: " + PlayerData.getFile().getInt(ID + ".Gathering.Mastery"));
        gatheringLore.add("");
        gatheringLore.add(ChatColor.WHITE + "Lumbering: " + ChatColor.GRAY + (PlayerData.getFile().getInt(ID + ".Gathering.Lumbering.Mastery") + mastery));
        gatheringLore.add(ChatColor.WHITE + "Mining: " + ChatColor.GRAY + (PlayerData.getFile().getInt(ID + ".Gathering.Mining.Mastery") + mastery));
        gatheringLore.add(ChatColor.WHITE + "Butchering: " + ChatColor.GRAY + (PlayerData.getFile().getInt(ID + ".Gathering.Butchering.Mastery") + mastery));
        gatheringLore.add("");
        gatheringLore.add(ChatColor.WHITE + "Progress: " + String.valueOf(progressPercent) + "%");
        for (int i = 0;i < 20;i++){
            if (i < green) {
                progressBar = progressBar + ChatColor.GREEN + "▌";
            } else {
                progressBar = progressBar + ChatColor.RED + "▌";
            }
        }
        gatheringLore.add(progressBar);
        gatheringLore.add("");
        gatheringLore.add(ChatColor.GOLD + "Click to view more info");
        gatheringMeta.setLore(gatheringLore);
        gathering.setItemMeta(gatheringMeta);

        return gathering;
    }
    public static ItemStack BackButton() {
        ItemStack back = new ItemStack(Material.BARRIER);
        ItemMeta backMeta = back.getItemMeta();
        assert backMeta != null : "This icon does not exist";
        backMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Back");
        back.setItemMeta(backMeta);
        return back;
    }
    public static ItemStack CopperFragment() {
        ItemStack CopperFragment = new ItemStack(MiningMaterials.CopperFragment());
        ItemMeta CopperFragmentMeta = CopperFragment.getItemMeta();
        ArrayList<String> CopperFragmentLore = new ArrayList<>();
        CopperFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        CopperFragmentLore.add("");
        CopperFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Ore x10");
        assert CopperFragmentMeta != null : "This icon does not exist";
        CopperFragmentMeta.setLore(CopperFragmentLore);
        CopperFragment.setItemMeta(CopperFragmentMeta);
        return CopperFragment;
    }
    public static ItemStack IronFragment() {
        ItemStack IronFragment = new ItemStack(MiningMaterials.IronFragment());
        ItemMeta IronFragmentMeta = IronFragment.getItemMeta();
        ArrayList<String> IronFragmentLore = new ArrayList<>();
        IronFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        IronFragmentLore.add("");
        IronFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Ore x10");
        assert IronFragmentMeta != null : "This icon does not exist";
        IronFragmentMeta.setLore(IronFragmentLore);
        IronFragment.setItemMeta(IronFragmentMeta);
        return IronFragment;
    }
    public static ItemStack GoldFragment() {
        ItemStack GoldFragment = new ItemStack(MiningMaterials.GoldFragment());
        ItemMeta GoldFragmentMeta = GoldFragment.getItemMeta();
        ArrayList<String> GoldFragmentLore = new ArrayList<>();
        GoldFragmentLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        GoldFragmentLore.add("");
        GoldFragmentLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Gold Ore x10");
        assert GoldFragmentMeta != null : "This icon does not exist";
        GoldFragmentMeta.setLore(GoldFragmentLore);
        GoldFragment.setItemMeta(GoldFragmentMeta);
        return GoldFragment;
    }
    public static ItemStack CopperIngot() {
        ItemStack CopperIngot = new ItemStack(MiningMaterials.CopperIngot());
        ItemMeta CopperIngotMeta = CopperIngot.getItemMeta();
        ArrayList<String> CopperIngotLore = new ArrayList<>();
        CopperIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        CopperIngotLore.add("");
        CopperIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Fragment x10");
        assert CopperIngotMeta != null : "This icon does not exist";
        CopperIngotMeta.setLore(CopperIngotLore);
        CopperIngot.setItemMeta(CopperIngotMeta);
        return CopperIngot;
    }
    public static ItemStack IronIngot() {
        ItemStack IronIngot = new ItemStack(MiningMaterials.IronIngot());
        ItemMeta IronIngotMeta = IronIngot.getItemMeta();
        ArrayList<String> IronIngotLore = new ArrayList<>();
        IronIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        IronIngotLore.add("");
        IronIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Fragment x10");
        assert IronIngotMeta != null : "This icon does not exist";
        IronIngotMeta.setLore(IronIngotLore);
        IronIngot.setItemMeta(IronIngotMeta);
        return IronIngot;
    }
    public static ItemStack GoldIngot() {
        ItemStack GoldIngot = new ItemStack(MiningMaterials.GoldIngot());
        ItemMeta GoldIngotMeta = GoldIngot.getItemMeta();
        ArrayList<String> GoldIngotLore = new ArrayList<>();
        GoldIngotLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        GoldIngotLore.add("");
        GoldIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Gold Fragment x10");
        assert GoldIngotMeta != null : "This icon does not exist";
        GoldIngotMeta.setLore(GoldIngotLore);
        GoldIngot.setItemMeta(GoldIngotMeta);
        return GoldIngot;
    }
    public static ItemStack MixedRefinedScrap() {
        ItemStack MixedRefinedScrap = new ItemStack(MiningMaterials.MixedRefinedScrap());
        ItemMeta MixedRefinedScrapMeta = MixedRefinedScrap.getItemMeta();
        ArrayList<String> MixedRefinedScrapLore = new ArrayList<>();
        MixedRefinedScrapLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        MixedRefinedScrapLore.add("");
        MixedRefinedScrapLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Refined Iron x3");
        MixedRefinedScrapLore.add(ChatColor.WHITE + "Refined Copper x3");
        assert MixedRefinedScrapMeta != null : "This icon does not exist";
        MixedRefinedScrapMeta.setLore(MixedRefinedScrapLore);
        MixedRefinedScrap.setItemMeta(MixedRefinedScrapMeta);
        return MixedRefinedScrap;
    }
    public static ItemStack RefinedIngot() {
        ItemStack MixedRefinedIngot = new ItemStack(MiningMaterials.RefinedIngot());
        ItemMeta MixedRefinedIngotMeta = MixedRefinedIngot.getItemMeta();
        ArrayList<String> MixedRefinedIngotLore = new ArrayList<>();
        MixedRefinedIngotLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Tier 5 Material");
        MixedRefinedIngotLore.add("");
        MixedRefinedIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Mixed Refined Scrap x10");
        assert MixedRefinedIngotMeta != null : "This icon does not exist";
        MixedRefinedIngotMeta.setLore(MixedRefinedIngotLore);
        MixedRefinedIngot.setItemMeta(MixedRefinedIngotMeta);
        return MixedRefinedIngot;
    }
    public static ItemStack RefinedIron() {
        ItemStack RefinedIronIngot = new ItemStack(MiningMaterials.RefinedIron());
        ItemMeta RefinedIronIngotMeta = RefinedIronIngot.getItemMeta();
        ArrayList<String> RefinedIronIngotLore = new ArrayList<>();
        RefinedIronIngotLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        RefinedIronIngotLore.add("");
        RefinedIronIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Iron Ingot x10");
        assert RefinedIronIngotMeta != null : "This icon does not exist";
        RefinedIronIngotMeta.setLore(RefinedIronIngotLore);
        RefinedIronIngot.setItemMeta(RefinedIronIngotMeta);
        return RefinedIronIngot;
    }
    public static ItemStack RefinedCopper() {
        ItemStack RefinedCopperIngot = new ItemStack(MiningMaterials.RefinedCopper());
        ItemMeta RefinedCopperIngotMeta = RefinedCopperIngot.getItemMeta();
        ArrayList<String> RefinedCopperIngotLore = new ArrayList<>();
        RefinedCopperIngotLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        RefinedCopperIngotLore.add("");
        RefinedCopperIngotLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Copper Ingot x10");
        assert RefinedCopperIngotMeta != null : "This icon does not exist";
        RefinedCopperIngotMeta.setLore(RefinedCopperIngotLore);
        RefinedCopperIngot.setItemMeta(RefinedCopperIngotMeta);
        return RefinedCopperIngot;
    }
    public static ItemStack StoneSlab() {
        ItemStack StoneSlab = new ItemStack(MiningMaterials.StoneSlab());
        ItemMeta StoneSlabMeta = StoneSlab.getItemMeta();
        ArrayList<String> StoneSlabLore = new ArrayList<>();
        StoneSlabLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        StoneSlabLore.add("");
        StoneSlabLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Rough Stone x64");
        assert StoneSlabMeta != null : "This icon does not exist";
        StoneSlabMeta.setLore(StoneSlabLore);
        StoneSlab.setItemMeta(StoneSlabMeta);
        return StoneSlab;
    }


    public static ItemStack ChoppingIcon() {
        ItemStack Chopping = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta ChoppingMeta = Chopping.getItemMeta();
        assert ChoppingMeta != null : "This icon does not exist";
        ChoppingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Chopping");
        ChoppingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> ChoppingLore = new ArrayList<>();
        ChoppingLore.add(ChatColor.GRAY + "Chop resources to produce higher tier materials");
        ChoppingMeta.setLore(ChoppingLore);
        Chopping.setItemMeta(ChoppingMeta);
        return Chopping;
    }
    public static ItemStack GrindingIcon() {
        ItemStack Grinding = new ItemStack(Material.ANVIL);
        ItemMeta GrindingMeta = Grinding.getItemMeta();
        assert GrindingMeta != null : "This icon does not exist";
        GrindingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Grinding");
        GrindingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> GrindingLore = new ArrayList<>();
        GrindingLore.add(ChatColor.GRAY + "Grind resources to produce higher tier materials");
        GrindingMeta.setLore(GrindingLore);
        Grinding.setItemMeta(GrindingMeta);
        return Grinding;
    }
    public static ItemStack HeatingIcon() {
        ItemStack Heating = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta HeatingMeta = Heating.getItemMeta();
        assert HeatingMeta != null : "This icon does not exist";
        HeatingMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Heating");
        HeatingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> HeatingLore = new ArrayList<>();
        HeatingLore.add(ChatColor.GRAY + "Heat resources to produce higher tier materials");
        HeatingMeta.setLore(HeatingLore);
        Heating.setItemMeta(HeatingMeta);
        return Heating;
    }

    //Gathering details
    public static ItemStack MiningIcon(Player player) {
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        //Mining
        int MiningMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mining.Mastery") + GatheringMastery;
        int MiningBracket = (MiningMastery/50) * 50;
        double MiningRareChance = (plugin.getConfig().getDouble("Gathering.Mining.Mastery." + MiningBracket + ".Rare.Chance"));
        double MiningEpicChance = (plugin.getConfig().getDouble("Gathering.Mining.Mastery." + MiningBracket + ".Epic.Chance"));
        double MiningLegendaryChance = (plugin.getConfig().getDouble("Gathering.Mining.Mastery." + MiningBracket + ".Legendary.Chance"));
        double MiningUncommonChance = (plugin.getConfig().getDouble("Gathering.Mining.Mastery." + MiningBracket + ".Uncommon.Chance"));

        ItemStack Mining = new ItemStack(Material.COBBLESTONE);
        ItemMeta MiningMeta = Mining.getItemMeta();
        assert MiningMeta != null : "This icon does not exist";
        MiningMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Mining");
        MiningMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> MiningLore = new ArrayList<>();
        MiningLore.add(ChatColor.GRAY + "Mastery: " + MiningMastery);
        MiningLore.add(ChatColor.WHITE + "Uncommon: " + MiningUncommonChance + "%");
        MiningLore.add(ChatColor.WHITE + "Rare: " + MiningRareChance + "%");
        MiningLore.add(ChatColor.WHITE + "Epic: " + MiningEpicChance + "%");
        MiningLore.add(ChatColor.WHITE + "Legendary: " + MiningLegendaryChance + "%");
        MiningMeta.setLore(MiningLore);
        Mining.setItemMeta(MiningMeta);
        return Mining;
    }
    public static ItemStack LumberingIcon(Player player) {
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        int LumberingMastery = PlayerData.getFile().getInt(ID + ".Gathering.Lumbering.Mastery") + GatheringMastery;
        int LumberingBracket = (LumberingMastery/50) * 50;
        double LumberingRareChance = (plugin.getConfig().getDouble("Gathering.Lumbering.Mastery." + LumberingBracket + ".Rare.Chance"));
        double LumberingEpicChance = (plugin.getConfig().getDouble("Gathering.Lumbering.Mastery." + LumberingBracket + ".Epic.Chance"));
        double LumberingLegendaryChance = (plugin.getConfig().getDouble("Gathering.Lumbering.Mastery." + LumberingBracket + ".Legendary.Chance"));
        double LumberingUncommonChance = (plugin.getConfig().getDouble("Gathering.Lumbering.Mastery." + LumberingBracket + ".Uncommon.Chance"));

        ItemStack Lumbering = new ItemStack(Material.OAK_LOG);
        ItemMeta LumberingMeta = Lumbering.getItemMeta();
        assert LumberingMeta != null : "This icon does not exist";
        LumberingMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Lumbering");
        LumberingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> LumberingLore = new ArrayList<>();
        LumberingLore.add(ChatColor.GRAY + "Mastery: " + LumberingMastery);
        LumberingLore.add(ChatColor.WHITE + "Uncommon: " + LumberingUncommonChance + "%");
        LumberingLore.add(ChatColor.WHITE + "Rare: " + LumberingRareChance + "%");
        LumberingLore.add(ChatColor.WHITE + "Epic: " + LumberingEpicChance + "%");
        LumberingLore.add(ChatColor.WHITE + "Legendary: " + LumberingLegendaryChance + "%");
        LumberingMeta.setLore(LumberingLore);
        Lumbering.setItemMeta(LumberingMeta);

        return Lumbering;
    }
    public static ItemStack ButcheringIcon(Player player) {
        String ID = player.getUniqueId().toString();
        int GatheringMastery = PlayerData.getFile().getInt(ID + ".Gathering.Mastery");
        int ButcheringMastery = (PlayerData.getFile().getInt(ID + ".Gathering.Butchering.Mastery") + GatheringMastery);
        int ButcheringBracket = (ButcheringMastery/50) * 50;
        double ButcheringRareChance = (plugin.getConfig().getDouble("Gathering.Butchering.Mastery." + ButcheringBracket + ".Rare.Chance"));
        double ButcheringEpicChance = (plugin.getConfig().getDouble("Gathering.Butchering.Mastery." + ButcheringBracket + ".Epic.Chance"));
        double ButcheringLegendaryChance = (plugin.getConfig().getDouble("Gathering.Butchering.Mastery." + ButcheringBracket + ".Legendary.Chance"));
        double ButcheringUncommonChance = (plugin.getConfig().getDouble("Gathering.Butchering.Mastery." + ButcheringBracket + ".Uncommon.Chance"));

        ItemStack Butchering = new ItemStack(Material.MUTTON);
        ItemMeta ButcheringMeta = Butchering.getItemMeta();
        assert ButcheringMeta != null : "This icon does not exist";
        ButcheringMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Butchering");
        ButcheringMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ArrayList<String> ButcheringLore = new ArrayList<>();
        ButcheringLore.add(ChatColor.GRAY + "Mastery: " + ButcheringMastery);
        ButcheringLore.add(ChatColor.WHITE + "Uncommon: " + ButcheringUncommonChance + "%");
        ButcheringLore.add(ChatColor.WHITE + "Rare: " + ButcheringRareChance + "%");
        ButcheringLore.add(ChatColor.WHITE + "Epic: " + ButcheringEpicChance + "%");
        ButcheringLore.add(ChatColor.WHITE + "Legendary: " + ButcheringLegendaryChance + "%");
        ButcheringMeta.setLore(ButcheringLore);
        Butchering.setItemMeta(ButcheringMeta);

        return Butchering;
    }
    public static ItemStack OakPlank() {
        ItemStack OakPlank = new ItemStack(LumberingMaterials.OakPlank());
        ItemMeta OakPlankMeta = OakPlank.getItemMeta();
        ArrayList<String> OakPlankLore = new ArrayList<>();
        OakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        OakPlankLore.add("");
        OakPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Oak Timber x10");
        assert OakPlankMeta != null : "This icon does not exist";
        OakPlankMeta.setLore(OakPlankLore);
        OakPlank.setItemMeta(OakPlankMeta);
        return OakPlank;
    }
    public static ItemStack BirchPlank() {
        ItemStack BirchPlank = new ItemStack(LumberingMaterials.BirchPlank());
        ItemMeta BirchPlankMeta = BirchPlank.getItemMeta();
        ArrayList<String> BirchPlankLore = new ArrayList<>();
        BirchPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        BirchPlankLore.add("");
        BirchPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Birch Timber x10");
        assert BirchPlankMeta != null : "This icon does not exist";
        BirchPlankMeta.setLore(BirchPlankLore);
        BirchPlank.setItemMeta(BirchPlankMeta);
        return BirchPlank;
    }
    public static ItemStack JunglePlank() {
        ItemStack JunglePlank = new ItemStack(LumberingMaterials.JunglePlank());
        ItemMeta JunglePlankMeta = JunglePlank.getItemMeta();
        ArrayList<String> JunglePlankLore = new ArrayList<>();
        JunglePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        JunglePlankLore.add("");
        JunglePlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Jungle Timber x10");
        assert JunglePlankMeta != null : "This icon does not exist";
        JunglePlankMeta.setLore(JunglePlankLore);
        JunglePlank.setItemMeta(JunglePlankMeta);
        return JunglePlank;
    }
    public static ItemStack DarkOakPlank() {
        ItemStack DarkOakPlank = new ItemStack(LumberingMaterials.DarkOakPlank());
        ItemMeta DarkOakPlankMeta = DarkOakPlank.getItemMeta();
        ArrayList<String> DarkOakPlankLore = new ArrayList<>();
        DarkOakPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        DarkOakPlankLore.add("");
        DarkOakPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "DarkOak Timber x10");
        assert DarkOakPlankMeta != null : "This icon does not exist";
        DarkOakPlankMeta.setLore(DarkOakPlankLore);
        DarkOakPlank.setItemMeta(DarkOakPlankMeta);
        return DarkOakPlank;
    }
    public static ItemStack SprucePlank() {
        ItemStack SprucePlank = new ItemStack(LumberingMaterials.SprucePlank());
        ItemMeta SprucePlankMeta = SprucePlank.getItemMeta();
        ArrayList<String> SprucePlankLore = new ArrayList<>();
        SprucePlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        SprucePlankLore.add("");
        SprucePlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Spruce Timber x10");
        assert SprucePlankMeta != null : "This icon does not exist";
        SprucePlankMeta.setLore(SprucePlankLore);
        SprucePlank.setItemMeta(SprucePlankMeta);
        return SprucePlank;
    }
    public static ItemStack AcaciaPlank() {
        ItemStack AcaciaPlank = new ItemStack(LumberingMaterials.AcaciaPlank());
        ItemMeta AcaciaPlankMeta = AcaciaPlank.getItemMeta();
        ArrayList<String> AcaciaPlankLore = new ArrayList<>();
        AcaciaPlankLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        AcaciaPlankLore.add("");
        AcaciaPlankLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Acacia Timber x10");
        assert AcaciaPlankMeta != null : "This icon does not exist";
        AcaciaPlankMeta.setLore(AcaciaPlankLore);
        AcaciaPlank.setItemMeta(AcaciaPlankMeta);
        return AcaciaPlank;
    }
    public static ItemStack OakPlywood() {
        ItemStack OakPlywood = new ItemStack(LumberingMaterials.OakPlywood());
        ItemMeta OakPlywoodMeta = OakPlywood.getItemMeta();
        ArrayList<String> OakPlywoodLore = new ArrayList<>();
        OakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        OakPlywoodLore.add("");
        OakPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Oak Plank x10");
        assert OakPlywoodMeta != null : "This icon does not exist";
        OakPlywoodMeta.setLore(OakPlywoodLore);
        OakPlywood.setItemMeta(OakPlywoodMeta);
        return OakPlywood;

    }
    public static ItemStack BirchPlywood() {
        ItemStack BirchPlywood = new ItemStack(LumberingMaterials.BirchPlywood());
        ItemMeta BirchPlywoodMeta = BirchPlywood.getItemMeta();
        ArrayList<String> BirchPlywoodLore = new ArrayList<>();
        BirchPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        BirchPlywoodLore.add("");
        BirchPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Birch Plank x10");
        assert BirchPlywoodMeta != null : "This icon does not exist";
        BirchPlywoodMeta.setLore(BirchPlywoodLore);
        BirchPlywood.setItemMeta(BirchPlywoodMeta);
        return BirchPlywood;
    }
    public static ItemStack JunglePlywood() {
        ItemStack JunglePlywood = new ItemStack(LumberingMaterials.JunglePlywood());
        ItemMeta JunglePlywoodMeta = JunglePlywood.getItemMeta();
        ArrayList<String> JunglePlywoodLore = new ArrayList<>();
        JunglePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        JunglePlywoodLore.add("");
        JunglePlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Jungle Plank x10");
        assert JunglePlywoodMeta != null : "This icon does not exist";
        JunglePlywoodMeta.setLore(JunglePlywoodLore);
        JunglePlywood.setItemMeta(JunglePlywoodMeta);
        return JunglePlywood;
    }
    public static ItemStack DarkOakPlywood() {
        ItemStack DarkOakPlywood = new ItemStack(LumberingMaterials.DarkOakPlywood());
        ItemMeta DarkOakPlywoodMeta = DarkOakPlywood.getItemMeta();
        ArrayList<String> DarkOakPlywoodLore = new ArrayList<>();
        DarkOakPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        DarkOakPlywoodLore.add("");
        DarkOakPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "DarkOak Plank x10");
        assert DarkOakPlywoodMeta != null : "This icon does not exist";
        DarkOakPlywoodMeta.setLore(DarkOakPlywoodLore);
        DarkOakPlywood.setItemMeta(DarkOakPlywoodMeta);
        return DarkOakPlywood;
    }
    public static ItemStack SprucePlywood() {
        ItemStack SprucePlywood = new ItemStack(LumberingMaterials.SprucePlywood());
        ItemMeta SprucePlywoodMeta = SprucePlywood.getItemMeta();
        ArrayList<String> SprucePlywoodLore = new ArrayList<>();
        SprucePlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        SprucePlywoodLore.add("");
        SprucePlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Spruce Plank x10");
        assert SprucePlywoodMeta != null : "This icon does not exist";
        SprucePlywoodMeta.setLore(SprucePlywoodLore);
        SprucePlywood.setItemMeta(SprucePlywoodMeta);
        return SprucePlywood;
    }
    public static ItemStack AcaciaPlywood() {
        ItemStack AcaciaPlywood = new ItemStack(LumberingMaterials.AcaciaPlywood());
        ItemMeta AcaciaPlywoodMeta = AcaciaPlywood.getItemMeta();
        ArrayList<String> AcaciaPlywoodLore = new ArrayList<>();
        AcaciaPlywoodLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        AcaciaPlywoodLore.add("");
        AcaciaPlywoodLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Acacia Plank x10");
        assert AcaciaPlywoodMeta != null : "This icon does not exist";
        AcaciaPlywoodMeta.setLore(AcaciaPlywoodLore);
        AcaciaPlywood.setItemMeta(AcaciaPlywoodMeta);
        return AcaciaPlywood;
    }
    public static ItemStack Scantling() {
        ItemStack Scantling = new ItemStack(LumberingMaterials.Scantling());
        ItemMeta ScantlingMeta = Scantling.getItemMeta();
        ArrayList<String> ScantlingLore = new ArrayList<>();
        ScantlingLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Tier 2 Material");
        ScantlingLore.add("");
        ScantlingLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Log x10");
        assert ScantlingMeta != null : "This icon does not exist";
        ScantlingMeta.setLore(ScantlingLore);
        Scantling.setItemMeta(ScantlingMeta);
        return Scantling;
    }
    public static ItemStack TimberSquare() {
        ItemStack TimberSquare = new ItemStack(LumberingMaterials.TimberSquare());
        ItemMeta TimberSquareMeta = TimberSquare.getItemMeta();
        ArrayList<String> TimberSquareLore = new ArrayList<>();
        TimberSquareLore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "Tier 3 Material");
        TimberSquareLore.add("");
        TimberSquareLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Scantling x10");
        assert TimberSquareMeta != null : "This icon does not exist";
        TimberSquareMeta.setLore(TimberSquareLore);
        TimberSquare.setItemMeta(TimberSquareMeta);
        return TimberSquare;
    }
    public static ItemStack ReinforcedStick() {
        ItemStack ReinforcedStick = new ItemStack(LumberingMaterials.ReinforcedStick());
        ItemMeta ReinforcedStickMeta = ReinforcedStick.getItemMeta();
        ArrayList<String> ReinforcedStickLore = new ArrayList<>();
        ReinforcedStickLore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Tier 4 Material");
        ReinforcedStickLore.add("");
        ReinforcedStickLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Timber Square x30");
        assert ReinforcedStickMeta != null : "This icon does not exist";
        ReinforcedStickMeta.setLore(ReinforcedStickLore);
        ReinforcedStick.setItemMeta(ReinforcedStickMeta);
        return ReinforcedStick;
    }
    public static ItemStack LumberManosStone() {
        ItemStack LumberManosStone = new ItemStack(LumberingMaterials.LumberManosStone());
        ItemMeta LumberManosStoneMeta = LumberManosStone.getItemMeta();
        ArrayList<String> LumberManosStoneLore = new ArrayList<>();
        LumberManosStoneLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "Tier 5 Material");
        LumberManosStoneLore.add("");
        LumberManosStoneLore.add(ChatColor.GRAY + "Requires: " + ChatColor.WHITE + "Manos Fragments x10");
        LumberManosStoneLore.add(ChatColor.WHITE + "Lumber Core x1");
        assert LumberManosStoneMeta != null : "This icon does not exist";
        LumberManosStoneMeta.setLore(LumberManosStoneLore);
        LumberManosStone.setItemMeta(LumberManosStoneMeta);
        return LumberManosStone;
    }




























}
