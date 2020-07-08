package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
    public static void toggleFly(Player player) {

        if (player.getAllowFlight() == true) {
            player.setAllowFlight(false);
            player.setFlying(false);
            player.sendMessage("§6set [§4Fly§6] mode to §cOFF§6 for §e" + player.getName());
        } else {
            player.setAllowFlight(true);
            player.setFlying(true);
            player.sendMessage("§6set [§4Fly§6] mode to §2ON§6 for §e" + player.getName());
        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // without arguments
            if (args.length == 0) {
                CommandFly.toggleFly(player);
            }
            // with arguments
            if (args.length == 1) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null || !target.isOnline()) {
                    player.sendMessage("§4§lError: §rThe target is offline or does not exist!");

                } else {
                    if (target.getAllowFlight() == true) {
                        target.setAllowFlight(false);
                        target.setFlying(false);
                        player.sendMessage("§6set [§4Fly§6] mode to §cOFF§6 for §e" + target.getName());
                        target.sendMessage("§6[§4FLY§6] mode has been set to §cOFF");
                    } else {
                        target.setAllowFlight(true);
                        target.setFlying(true);
                        player.sendMessage("§6set [§4Fly§6] mode to §2ON§6 for §e" + target.getName());
                        target.sendMessage("§6[§4Fly§6] mode has been set to §2ON");
                    }
                }
            }

        }
        return false;
    }

}
