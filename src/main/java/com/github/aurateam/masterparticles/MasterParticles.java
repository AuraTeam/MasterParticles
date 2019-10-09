package com.github.aurateam.masterparticles;

import com.github.aurateam.masterparticles.commands.PlayCommand;
import me.mattstudios.mf.base.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MasterParticles extends JavaPlugin {

    private CommandManager commandManager;

    @Override
    public void onEnable() {

        commandManager = new CommandManager(this);
        commandManager.register(new PlayCommand());

    }

}
