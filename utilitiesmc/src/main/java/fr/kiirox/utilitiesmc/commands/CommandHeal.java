package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHeal implements CommandExecutor {
    public static void heal(Player player) {
        if (player.getGameMode() == GameMode.CREATIVE) {
            player.sendMessage("§4§lERROR: §rYou can't be healed in creative mode");
        } else {
            player.sendMessage("§b§lUtilitiesMc §r§8» §6You have been healed!");
            player.setHealth(20);
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // without arguments
            if (args.length == 0) {
                CommandHeal.heal(player);
            }

            // with arguments
            if (args.length == 1) {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null || !target.isOnline()) {
                    player.sendMessage("§4§lError: §rThe target is offline or does not exist!");
                } else {
                    if (target.getGameMode() == GameMode.CREATIVE) {
                        player.sendMessage("§4§lERROR: §rThe target can't be healed in creative mode");
                    } else {
                        player.sendMessage("§b§lUtilitiesMc §r§8» §e" + target.getName() + " §6has been healed");
                        target.setHealth(20);
                        target.sendMessage("§b§lUtilitiesMc §r§8» §6You have been healed!");
                    }
                }

            }

        }
        return false;
    }
}
