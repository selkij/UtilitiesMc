package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // without arguments
            if (args.length == 0) {
                CommandFeed.feed(player);
            }
            // with arguments
            if (args.length == 1) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    player.sendMessage("§4§lError: §rThe target is offline or does not exist!");
                } else {
                    if (target.getGameMode() == GameMode.CREATIVE) {
                        player.sendMessage("§4§lERROR: §rThe target can't be feed in creative mode");
                    } else {
                        player.sendMessage("§b§lUtilitiesMc §r§8» §e" + target.getName() + " §6has been feed");
                        target.setFoodLevel(20);
                        target.sendMessage("§b§lUtilitiesMc §r§8» §6You have been feed!");
                    }
                }
            }
        }
        return false;
    }

    public static void feed(Player player) {
        if (player.getGameMode() == GameMode.CREATIVE) {
            player.sendMessage("§4§lERROR: §rYou can't be feed in creative mode");
        } else {
            player.sendMessage("§b§lUtilitiesMc §r§8» §6You have been feed!");
            player.setFoodLevel(20);
        }
    }
}
