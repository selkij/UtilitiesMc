package fr.kiirox.utilitiesmc.commands;

import fr.kiirox.utilitiesmc.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CommandMenu implements CommandExecutor {
    public static Inventory getGui() {
        Inventory inventory = Bukkit.createInventory(null, 54, "Menu");

        ItemBuilder not = new ItemBuilder(Material.STAINED_GLASS_PANE)
                .setName(" ")
                .setDurability((short) 8);
        ItemBuilder fly = new ItemBuilder(Material.FEATHER)
                .setName("§f§lFly")
                .setLore("§8Toggle the fly mode to be able to fly");
        ItemBuilder god = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setName("§6§lGod")
                .setLore("§8Toggle the god mode to be invincible");
        ItemBuilder gmOne = new ItemBuilder(Material.DIAMOND_BLOCK, 1, (byte) 3)
                .setName("Gamemode §1§lCreative")
                .setLore("§8Set the gamemode to creative");
        ItemBuilder gmTwo = new ItemBuilder(Material.WOOL)
                .setName("Gamemode §4§lAdventure")
                .setDurability((short) 14)
                .setLore("§8Set the gamemode to adventure");
        ItemBuilder gmThree = new ItemBuilder(Material.GLASS)
                .setName("Gamemode §7§lSpectator")
                .setLore("§8Set the gamemode to spectator");
        ItemBuilder gmZero = new ItemBuilder(Material.GRASS)
                .setName("Gamemode §2§lSurvival")
                .setLore("§8Set the gamemode to survival");
        ItemBuilder heal = new ItemBuilder(Material.GOLDEN_APPLE, 1, (byte) 3)
                .setName("§a§lHeal")
                .setDurability((short) 1)
                .setLore("§8Set the health level to 20");
        ItemBuilder feed = new ItemBuilder(Material.COOKED_BEEF)
                .setName("§e§lFeed")
                .setLore("§8Set the food level to 20");
        ItemBuilder bc = new ItemBuilder(Material.BEACON)
                .setName("§d§lBroadcast")
                .setLore("§8Do an alert message");
        ItemBuilder help = new ItemBuilder(Material.COMPASS)
                .setName("§5§lHelp")
                .setLore("§8Open a GUI with the informations", "§8§lof all the commands");
        ItemBuilder mod = new ItemBuilder(Material.GOLD_AXE)
                .setName("§9§lModeration")
                .setLore("§8open a GUI with all the moderations commands");


        inventory.setItem(40, mod.toItemStack());
        inventory.setItem(49, help.toItemStack());
        inventory.setItem(38, bc.toItemStack());
        inventory.setItem(21, feed.toItemStack());
        inventory.setItem(20, heal.toItemStack());
        inventory.setItem(42, gmZero.toItemStack());
        inventory.setItem(33, gmThree.toItemStack());
        inventory.setItem(24, gmTwo.toItemStack());
        inventory.setItem(15, gmOne.toItemStack());
        inventory.setItem(12, god.toItemStack());
        inventory.setItem(11, fly.toItemStack());
        //none
        int[] slots = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14, 16, 17, 18, 19, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 34, 35, 36, 37, 39, 41, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53};
        for (int i : slots) {

            inventory.setItem(i, not.toItemStack());
        }

        return inventory;
    }

    public static Inventory flySet() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Fly");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }

        return inventory;
    }

    public static Inventory godSet() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection God");
        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }
        return inventory;
    }

    public static Inventory gmZero() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Gamemode Survival");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }

        return inventory;
    }

    public static Inventory gmOne() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Gamemode Creative");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }

        return inventory;
    }

    public static Inventory gmThree() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Gamemode Spectator");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }

        return inventory;
    }

    public static Inventory gmTwo() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Gamemode Adventure");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }
        return inventory;
    }

    public static Inventory heal() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Heal");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }
        return inventory;
    }

    public static Inventory feed() {
        Inventory inventory = Bukkit.createInventory(null, (Bukkit.getOnlinePlayers().size() / 9 + 1) * 9, "Selection Feed");

        int slot = 0;

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {

            ItemBuilder head = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName(onlinePlayer.getName())
                    .setSkullOwner(onlinePlayer.getName());

            inventory.setItem(slot, head.toItemStack());
            slot++;
        }
        return inventory;
    }

    public static Inventory help() {
        Inventory inventory = Bukkit.createInventory(null, 18, "Help Menu");

        ItemBuilder fly = new ItemBuilder(Material.FEATHER)
                .setName("§fFly")
                .setLore("§8§lToggle the fly mode to be able to fly");
        ItemBuilder god = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setName("§6God")
                .setLore("§8§lToggle the god mode to be invincible");
        ItemBuilder gmOne = new ItemBuilder(Material.DIAMOND_BLOCK, 1, (byte) 3)
                .setName("Gamemode §1Creative")
                .setLore("§8§lSet the gamemode to creative");
        ItemBuilder gmTwo = new ItemBuilder(Material.WOOL)
                .setName("Gamemode §4Adventure")
                .setDurability((short) 14)
                .setLore("§8§lSet the gamemode to adventure");
        ItemBuilder gmThree = new ItemBuilder(Material.GLASS)
                .setName("Gamemode §7Spectator")
                .setLore("§8§lSet the gamemode to spectator");
        ItemBuilder gmZero = new ItemBuilder(Material.GRASS)
                .setName("Gamemode §2Survival")
                .setLore("§8§lSet the gamemode to survival");
        ItemBuilder heal = new ItemBuilder(Material.GOLDEN_APPLE, 1, (byte) 3)
                .setName("§aHeal")
                .setDurability((short) 1)
                .setLore("§8§lSet the health level to 20");
        ItemBuilder feed = new ItemBuilder(Material.COOKED_BEEF)
                .setName("§eFeed")
                .setLore("§8§lSet the food level to 20");
        ItemBuilder bc = new ItemBuilder(Material.BEACON)
                .setName("§dBroadcast")
                .setLore("§8§lDo an alert message");
        ItemBuilder back = new ItemBuilder(Material.BARRIER)
                .setName("§4§lBack -->");

        inventory.setItem(0, fly.toItemStack());
        inventory.setItem(1, god.toItemStack());
        inventory.setItem(2, heal.toItemStack());
        inventory.setItem(3, feed.toItemStack());
        inventory.setItem(4, bc.toItemStack());
        inventory.setItem(5, gmZero.toItemStack());
        inventory.setItem(6, gmOne.toItemStack());
        inventory.setItem(7, gmTwo.toItemStack());
        inventory.setItem(8, gmThree.toItemStack());
        inventory.setItem(17, back.toItemStack());

        return inventory;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.openInventory(getGui());

        }

        return false;
    }
}
