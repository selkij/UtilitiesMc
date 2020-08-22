package fr.kiirox.utilitiesmc;

import fr.kiirox.utilitiesmc.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
        getCommand("bc").setExecutor(new CommandBc());
        getCommand("gm1").setExecutor(new CommandGmOne());
        getCommand("gm0").setExecutor(new CommandGmZero());
        getCommand("gm3").setExecutor(new CommandGmThree());
        getCommand("gm2").setExecutor(new CommandGmTwo());
        getCommand("feed").setExecutor(new CommandFeed());
        getCommand("heal").setExecutor(new CommandHeal());
        getCommand("godmode").setExecutor(new CommandGod());
        getCommand("fly").setExecutor(new CommandFly());
        getCommand("menu").setExecutor(new CommandMenu());
        getCommand("helpcom").setExecutor(new CommandHelpCom());
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[UtilitiesMc] " + ChatColor.GREEN + "On");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[UtilitiesMc] " + ChatColor.RED + "Off");
    }

}
