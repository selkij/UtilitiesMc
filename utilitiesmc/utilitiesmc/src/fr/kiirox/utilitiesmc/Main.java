package fr.kiirox.utilitiesmc;

import org.bukkit.plugin.java.JavaPlugin;

import fr.kiirox.utilitiesmc.commands.Command;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("UtilitesMc is ON!");
		getCommand("bc").setExecutor(new Command());
		getCommand("alert").setExecutor(new Command());
		getCommand("gm1").setExecutor(new Command());
		getCommand("gm0").setExecutor(new Command());
		getCommand("gm3").setExecutor(new Command());
		getCommand("gm2").setExecutor(new Command());
		getCommand("feed").setExecutor(new Command());
		getCommand("heal").setExecutor(new Command());
		getCommand("setlife").setExecutor(new Command());
		getCommand("godmode").setExecutor(new Command());
		getCommand("fly").setExecutor(new Command());
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("UtilitesMc is OFF!");
	}

}


