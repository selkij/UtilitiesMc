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

        ItemBuilder not = new ItemBuilder(Material.STAINED_GLASS_PANE).setName(" ")
                .setDurability((short) 8);
        ItemBuilder fly = new ItemBuilder(Material.FEATHER).setName("§fFly")
                .setLore("§8§lToggle the fly mode to be able to fly");
        ItemBuilder god = new ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).setName("§6God")
                .setLore("§8§lToggle the god mode to be invincible");
        ItemBuilder gmOne = new ItemBuilder(Material.DIAMOND_BLOCK, 1, (byte) 3).setName("Gamemode §1Creative")
                .setLore("§8§lSet the gamemode to creative");
        ItemBuilder gmTwo = new ItemBuilder(Material.CONCRETE).setName("Gamemode §4Adventure")
                .setDurability((short) 14)
                .setLore("§8§lSet the gamemode to adventure");
        ItemBuilder gmThree = new ItemBuilder(Material.GLASS).setName("Gamemode §7Spectator")
                .setLore("§8§lSet the gamemode to spectator");
        ItemBuilder gmZero = new ItemBuilder(Material.GRASS).setName("Gamemode §2Survival")
                .setLore("§8§lSet the gamemode to survival");
        ItemBuilder heal = new ItemBuilder(Material.GOLDEN_APPLE, 1, (byte) 3).setName("§aHeal")
                .setDurability((short) 1)
                .setLore("§8§lSet the health level to 20");
        ItemBuilder feed = new ItemBuilder(Material.COOKED_BEEF).setName("§eFeed")
                .setLore("§8§lSet the food level to 20");
        ItemBuilder bc = new ItemBuilder(Material.BEACON).setName("§dBroadcast")
                .setLore("§8§lDo an alert message");
        //none
        inventory.setItem(53, not.toItemStack());
        inventory.setItem(52, not.toItemStack());
        inventory.setItem(51, not.toItemStack());
        inventory.setItem(50, not.toItemStack());
        inventory.setItem(49, not.toItemStack());
        inventory.setItem(48, not.toItemStack());
        inventory.setItem(47, not.toItemStack());
        inventory.setItem(46, not.toItemStack());
        inventory.setItem(45, not.toItemStack());
        inventory.setItem(44, not.toItemStack());
        inventory.setItem(43, not.toItemStack());
        inventory.setItem(41, not.toItemStack());
        inventory.setItem(40, not.toItemStack());
        inventory.setItem(39, not.toItemStack());
        inventory.setItem(37, not.toItemStack());
        inventory.setItem(36, not.toItemStack());
        inventory.setItem(35, not.toItemStack());
        inventory.setItem(34, not.toItemStack());
        inventory.setItem(32, not.toItemStack());
        inventory.setItem(31, not.toItemStack());
        inventory.setItem(30, not.toItemStack());
        inventory.setItem(29, not.toItemStack());
        inventory.setItem(28, not.toItemStack());
        inventory.setItem(27, not.toItemStack());
        inventory.setItem(26, not.toItemStack());
        inventory.setItem(25, not.toItemStack());
        inventory.setItem(23, not.toItemStack());
        inventory.setItem(22, not.toItemStack());
        inventory.setItem(19, not.toItemStack());
        inventory.setItem(18, not.toItemStack());
        inventory.setItem(17, not.toItemStack());
        inventory.setItem(16, not.toItemStack());
        inventory.setItem(14, not.toItemStack());
        inventory.setItem(13, not.toItemStack());
        inventory.setItem(10, not.toItemStack());

        //utility
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
        int[] slots = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < slots.length; i++) {

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


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.openInventory(getGui());

        }

        return false;
    }
}
