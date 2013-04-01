package com.github.pabook.commandkepper;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class getCommand implements Listener {
    CommandKepper cmdKepper;

    public getCommand(CommandKepper cmdkepper){
        this.cmdKepper = cmdkepper;
    }

        @EventHandler
        public void getPlayerCommand(PlayerCommandPreprocessEvent event){
            Player senderPlayer = event.getPlayer();
            String getCmd = event.getMessage();

            if(senderPlayer.hasPermission("commandkepper.bypass") || senderPlayer.isOp()){
                    return;
            }

            for(int i = 0 ; i < cmdKepper.kickCmd.size() ; i++){
                    if(cmdKepper.kickCmd.get(i).equalsIgnoreCase(getCmd)){
                    }
            }
        }
}

