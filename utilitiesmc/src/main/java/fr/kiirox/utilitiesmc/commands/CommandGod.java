package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGod implements CommandExecutor {

    public static void toggleGod(Player player) {
        if (player.isInvulnerable()) {
            player.setInvulnerable(false);
            player.sendMessage("§l§6set [§4God§6] mode to §cOFF§6 for §e" + player.getName());
        } else {
            player.setInvulnerable(true);
            player.sendMessage("§l§6set [§4God§6] mode to §2ON§6 for §e" + player.getName());
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String msg, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // without arguments
            if (args.length == 0) {
                CommandGod.toggleGod(player);
            }
            if (args.length == 1) {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null || !target.isOnline()) {
                    player.sendMessage("§4§lError: §rThe target is offline or does not exist!");
                } else {
                    if (target.isInvulnerable()) {
                        target.setInvulnerable(false);
                        player.sendMessage("§l§6set [§4God§6] mode to §cOFF§6 for §e" + target.getName());
                        target.sendMessage("§l§6[§4God§6] mode has been set to §cOFF");
                    } else {
                        target.setInvulnerable(true);
                        player.sendMessage("§l§6set [§4God§6] mode to §2ON§6 for §e" + target.getName());
                        target.sendMessage("§l§6[§4God§6] mode has been set to §2ON");
                    }
                }
            }
        }
        return false;
    }

}
