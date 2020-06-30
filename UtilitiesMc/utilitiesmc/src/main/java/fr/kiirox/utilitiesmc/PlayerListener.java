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

    }

}
