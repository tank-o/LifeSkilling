package me.tanko_.lifeskills.MobKillEvent;

import me.tanko_.lifeskills.Butchering.Butchering;
import me.tanko_.lifeskills.CustomItems.CustomTools;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.ArrayList;
import java.util.Collections;

public class MobKillEvent implements Listener {

    @EventHandler
    public void OnMobKill(EntityDeathEvent e){
        ArrayList<String> ButcherKnives = new ArrayList<>();
        Collections.addAll(ButcherKnives, CustomTools.ApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.OneApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.TwoApprenticeButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.ThreeApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.FourApprenticeButcherKnife().getItemMeta().getDisplayName(), CustomTools.FiveApprenticeButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.MasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.OneMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.TwoMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.ThreeMasterButcherKnife().getItemMeta().getDisplayName(),
                CustomTools.FourMasterButcherKnife().getItemMeta().getDisplayName(), CustomTools.FiveMasterButcherKnife().getItemMeta().getDisplayName());
        if (e.getEntity() instanceof Mob) {
            Mob mob = (Mob) e.getEntity();
            if (mob.getKiller() != null){
                Player player = (Player) mob.getKiller();
                e.getDrops().clear();
                if (mob instanceof Wolf){
                    Butchering.GetDrops(player,"wolf");
                    return;
                } else if (mob instanceof Sheep){
                    Butchering.GetDrops(player,"lamb");
                    return;
                } else if (mob instanceof Pig){
                    Butchering.GetDrops(player,"pork");
                    return;
                }

            }
        }
    }
}
