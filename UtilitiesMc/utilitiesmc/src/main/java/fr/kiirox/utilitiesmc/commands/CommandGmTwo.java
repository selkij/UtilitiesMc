package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGmTwo implements CommandExecutor {
    public static void toggleGmTwo(Player player) {
        if (player.getGameMode() == GameMode.ADVENTURE) {
            player.sendMessage("§l§6You are already in [§4Advanture§6] mode");
        } else {
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage("§l§6set [§4Advanture§6] mode to §e" + player.getName());
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // without argument
            if (args.length == 0) {
                CommandGmTwo.toggleGmTwo(player);
            }
            // with argument
            if (args.length == 1) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null || !target.isOnline()) {
                    player.sendMessage("§4Error: §lThe target is offline or does not exist!");
                } else {
                    if (target.getGameMode() == GameMode.ADVENTURE) {
                        player.sendMessage("§l§e" + target.getName() + " §6is already in [§4Adventure§6] mode");
                    } else {
                        target.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage("§l§6set [§4Adventure§6] mode to §e" + target.getName());
                    }
                }
            }
        }
        return false;
    }
}
