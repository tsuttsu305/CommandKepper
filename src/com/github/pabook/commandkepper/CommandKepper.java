package com.github.pabook.commandkepper;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class CommandKepper extends JavaPlugin {

    public String kickMsg, noticeMsg, noticeStaffMsg;
    public List<String> kickCmd;

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new getCommand(this), this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        saveConfig();
        kickCmd = getConfig().getStringList("KickCommand");
        kickMsg = getConfig().getString("KickMessage");
        noticeMsg = getConfig().getString("BroadCastMessage");
        noticeStaffMsg = getConfig().getString("BroadCastStaffMessage");

    }

}
