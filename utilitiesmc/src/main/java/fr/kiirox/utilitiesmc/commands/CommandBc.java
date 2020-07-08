package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBc implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;

			// without argument
			if (args.length == 0) {
				player.sendMessage("§4§lError: §rBad usage: §f/bc <message> or /alert <message>");
			}
			// with argument
			if (args.length >= 1) {
				Bukkit.broadcastMessage("§l§8[§6Alert§8]§4 " + ChatColor.translateAlternateColorCodes('&', String.join(" ", args)));
			}
		}

		return false;
	}

}
