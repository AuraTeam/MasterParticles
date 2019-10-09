package com.github.aurateam.masterparticles.commands;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.SubCommand;
import me.mattstudios.mf.base.CommandBase;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@Command("mp")
public class PlayCommand extends CommandBase {

    @SubCommand("play")
    public void play(CommandSender sender) {
        sender.sendMessage("mp play command test");
    }

}
