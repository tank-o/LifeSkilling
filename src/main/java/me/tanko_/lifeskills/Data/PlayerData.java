package me.tanko_.lifeskills.Data;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;


import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

    public class PlayerData {
        private static File playerFile;
        private static FileConfiguration playerFileConfig;


        //Finds existent playerdata file or generates playerdata file
        public static void setup(JavaPlugin plugin){
            playerFile = new File(plugin.getDataFolder() + "/playerData.yml");

            if (!playerFile.exists()){
                try{
                    playerFile.createNewFile();
                }catch (IOException e){
                    //stop in the name of plod
                }
            }
            playerFileConfig = YamlConfiguration.loadConfiguration(playerFile);
            playerFileConfig.options().copyDefaults(true);
        }

        //Get instance of file configuration
        public static FileConfiguration getFile(){

            return playerFileConfig;
        }

        //Save file
        public static void save(){
            try{
                playerFileConfig.save(playerFile);
            }catch (IOException e){
                System.out.println("couldn't save file");
            }

        }

        //Reload File
        public static void reload(){
            playerFileConfig = YamlConfiguration.loadConfiguration(playerFile);
        }

    }

