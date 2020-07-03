package fr.kiirox.utilitiesmc;

import fr.kiirox.utilitiesmc.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static fr.kiirox.utilitiesmc.commands.CommandMenu.*;

public class PlayerListener implements Listener {


    public PlayerListener(Main main) {

    }

    @EventHandler
    public void inventoryClickEvent(InventoryClickEvent e) {
        Player play = Bukkit.getPlayerExact(e.getCurrentItem().getItemMeta().getDisplayName());
        Player player = (Player) e.getWhoClicked();
        if (player == null)
            return;
        if (e.getView().getTitle().equalsIgnoreCase("menu")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR
                    || e.getCurrentItem().getItemMeta() == null || !e.getCurrentItem().getItemMeta().hasDisplayName())
                return;

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dBroadcast")) {
                player.closeInventory();
                player.sendMessage("§4§lUsage:§r /bc <message>");
                player.sendMessage("/broadcast <message>");
                player.sendMessage("/alert <message>");
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fFly")) {
                player.openInventory(flySet());
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6God")) {
                player.openInventory(godSet());
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eFeed")) {
                player.openInventory(feed());
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aHeal")) {
                player.openInventory(heal());
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Help")) {
                player.openInventory(help());
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §1Creative")) {
                player.openInventory(gmOne());
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §2Survival")) {
                player.openInventory(gmZero());
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §4Adventure")) {
                player.openInventory(gmTwo());
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §7Spectator")) {
                player.openInventory(gmThree());
            }
        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection Fly")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR
                    || e.getCurrentItem().getItemMeta() == null || !e.getCurrentItem().getItemMeta().hasDisplayName())
                return;


            if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
                player.closeInventory();
                CommandFly.toggleFly(play);
                if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                    player.sendMessage("§6set [§4FLY§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());

                }

            }
        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection God")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR
                    || e.getCurrentItem().getItemMeta() == null || !e.getCurrentItem().getItemMeta().hasDisplayName())
                return;


            if (e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
                player.closeInventory();
                CommandGod.toggleGod(play);
                if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                    player.sendMessage("§6set [§4GOD§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());

                }

            }

        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection Gamemode Survival")) {
            player.closeInventory();
            CommandGmZero.toggleGmzero(Bukkit.getPlayerExact(e.getCurrentItem().getItemMeta().getDisplayName()));
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§6set [§4Survival§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());
            }
        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection Gamemode Creative")) {
            player.closeInventory();
            CommandGmOne.toggleGmOne(play);
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§6set [§4Creative§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());
            }
        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection Gamemode Adventure")) {
            player.closeInventory();
            CommandGmTwo.toggleGmTwo(play);
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§6set [§4Adventure§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());
            }
        }

        if (e.getView().getTitle().equalsIgnoreCase("Selection Gamemode Spectator")) {
            player.closeInventory();
            CommandGmThree.toggleGmThree(play);
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§6set [§4Spectator§6] mode to §e" + e.getCurrentItem().getItemMeta().getDisplayName());
            }
        }

        if(e.getView().getTitle().equalsIgnoreCase("Selection Heal")) {
            player.closeInventory();
            CommandHeal.heal(play);
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§4" + e.getCurrentItem().getItemMeta().getDisplayName() + " §6Has been healed!");
            }
        }

        if(e.getView().getTitle().equalsIgnoreCase("Selection Feed")) {
            player.closeInventory();
            CommandFeed.feed(play);
            if (!e.getCurrentItem().getItemMeta().getDisplayName().equals(player.getName())) {
                player.sendMessage("§4" + e.getCurrentItem().getItemMeta().getDisplayName() + " §6Has been feed!");
            }
        }

        if(e.getView().getTitle().equalsIgnoreCase("Help Menu")) {
            e.setCancelled(true);

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lBack -->")) {
                player.openInventory(getGui());
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fFly")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Fly");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Set fly mode to be able to fly");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /fly <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6God")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r God");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Set the god mode to be invulnerable");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /god <player>");
                player.sendMessage("              aliases: /godmode <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aHeal")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Heal");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Restore the life level to 20");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /heal <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eFeed")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Feed");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Restore the food level to 20");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /feed <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dBroadcast")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Broadcast");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Do a broadcast usage");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /bc <message>");
                player.sendMessage("              aliases: /alert <message>");
                player.sendMessage("                       /broadcast <message>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §2Survival")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Gamemode Survival");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Activate the survival mode");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /gm0 <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §1Creative")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Gamemode Creative");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Activate the creative mode");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /gm1 <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §4Adventure")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Gamemode Adventure");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Activate the adventure mode");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /gm2 <player>");
                player.sendMessage("§6----------------------");
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Gamemode §7Spectator")) {
                player.closeInventory();
                player.sendMessage("§6----------------------");
                player.sendMessage("§b§lInfos Command: ");
                player.sendMessage(" ");
                player.sendMessage("§6§lName:§r Gamemode Spectator");
                player.sendMessage(" ");
                player.sendMessage("§6§lDescription:§r Activate the spectator mode");
                player.sendMessage(" ");
                player.sendMessage("§6§lUsage:§r /gm3 <player>");
                player.sendMessage("§6----------------------");
            }

        }

    }

}
