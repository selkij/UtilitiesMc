package fr.kiirox.utilitiesmc.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    
	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String msg, String[] args) {
    	if(sender instanceof Player) {
			Player player = (Player)sender;
			
			
			if(cmd.getName().equalsIgnoreCase("bc")) {
				//without argument
				if(args.length == 0) {
					player.sendMessage("§l§4Bad use: §f/bc <message> or /alert <message>");
				}
				//with argument
				if(args.length >= 1) {
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
					
				Bukkit.broadcastMessage("§l§8[§6Alert§8]§4 "+ bc.toString());
					
				}
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("alert")) {
				//without argument
				if(args.length == 0) {
					player.sendMessage("§l§4Bad use: §f/bc <message> or /alert <message>");
				}
				//with argument
				if(args.length >= 1) {
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
					
				Bukkit.broadcastMessage("§l§8[§6Alert§8]§4 "+ bc.toString());
					
				}
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("gm1")) {
				//without argument
				if(args.length == 0) {
					if(player.getGameMode() == GameMode.CREATIVE) {
						player.sendMessage("§l§6You are already in [§4CREATIVE§6] mode");
					} else {
					player.setGameMode(GameMode.CREATIVE);
					player.sendMessage("§l§6set [§4CREATIVE§6] mode to §4"+ player.getName());
					}
				}
				//with argument
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null || !target.isOnline()) {
					player.sendMessage("§l§4The target is offline or does not exist!");
					} else {
						if(target.getGameMode() == GameMode.CREATIVE) {
							player.sendMessage("§l§4"+ target.getName()+ " §6is already in [§4CREATIVE§6] mode");
						} else {
							target.setGameMode(GameMode.CREATIVE);
							player.sendMessage("§l§6set [§4CREATIVE§6] mode to §4"+ target.getName());
						}
					}
				}
				
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("gm0")) {
				//without argument
				if(args.length == 0) {
					if(player.getGameMode() == GameMode.SURVIVAL) {
						player.sendMessage("§l§6You are already in [§4SURVIVAL§6] mode");
					} else {
					player.setGameMode(GameMode.SURVIVAL);
					player.sendMessage("§l§6set [§4SURVIVAL§6] mode to §4"+ player.getName());
					}
				}
				//with argument
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null || !target.isOnline()) {
					player.sendMessage("§l§4The target is offline or does not exist!");
					} else {
						if(target.getGameMode() == GameMode.SURVIVAL) {
							player.sendMessage("§l§4"+ target.getName()+ " §6is already in [§4SURVIVAL§6] mode");
						} else {
							target.setGameMode(GameMode.SURVIVAL);
							player.sendMessage("§l§6set [§4SURVIVAL§6] mode to §4"+ target.getName());
						}
					}
				}
				
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("gm3")) {
				//without argument
				if(args.length == 0) {
					if(player.getGameMode() == GameMode.SPECTATOR) {
						player.sendMessage("§l§6You are already in [§4SPECTATOR§6] mode");
					} else {
					player.setGameMode(GameMode.SPECTATOR);
					player.sendMessage("§l§6set [§4SPECTATOR§6] mode to §4"+ player.getName());
					}
				}
				//with argument
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null || !target.isOnline()) {
					player.sendMessage("§l§4The target is offline or does not exist!");
					} else {
						if(target.getGameMode() == GameMode.SPECTATOR) {
							player.sendMessage("§l§4"+ target.getName()+ " §6is already in [§4SPECTATOR§6] mode");
						} else {
							target.setGameMode(GameMode.SPECTATOR);
							player.sendMessage("§l§6set [§4SPECTATOR§6] mode to §4"+ target.getName());
						}
					}
				}
				
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("gm2")) {
				//without argument
				if(args.length == 0) {
					if(player.getGameMode() == GameMode.ADVENTURE) {
						player.sendMessage("§l§6You are already in [§4ADVANTURE§6] mode");
					} else {
					player.setGameMode(GameMode.ADVENTURE);
					player.sendMessage("§l§6set [§4ADVANTURE§6] mode to §4"+ player.getName());
					}
				}
				//with argument
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if (target == null || !target.isOnline()) {
					player.sendMessage("§l§4The target is offline or does not exist!");
					} else {
						if(target.getGameMode() == GameMode.ADVENTURE) {
							player.sendMessage("§l§4"+ target.getName()+ " §6is already in [§4ADVENTURE§6] mode");
						} else {
							target.setGameMode(GameMode.ADVENTURE);
							player.sendMessage("§l§6set [§4ADVENTURE§6] mode to §4"+ target.getName());
						}
					}
				}
				
	    		return true;
	    	}
			
			if(cmd.getName().equalsIgnoreCase("feed")) {
				//without arguments
	    		if(args.length == 0) {
	    			player.sendMessage("§l§6You have been feed!");
	    			player.setFoodLevel(20);
	        }
	    		//with arguments
	    	    if(args.length == 1) {
	    	    	final Player target = Bukkit.getPlayerExact(args[0]);
	    	    	if (target == null) {
	    	    		player.sendMessage("§l§4The target is offline or does not exist!");
	    	    	} else {
	    	    		player.sendMessage("§l§4"+ target.getName()+ " §6has been feed");
	    	    		target.setFoodLevel(20);
	    	    		target.sendMessage("§l§6You have been feed!");
				}
	    	}
	    	   return true;
    }
			if(cmd.getName().equalsIgnoreCase("heal")) {
				//without arguments
	    		if(args.length == 0) {
	    			player.sendMessage("§l§6You have been healed!");
	    			player.setHealth(20);
	        }
	    		//with arguments
	    	    if(args.length == 1) {
	    	    	final Player target = Bukkit.getPlayerExact(args[0]);
	    	    	if (target == null || !target.isOnline()) {
	    	    		player.sendMessage("§l§4The target is offline or does not exist!");
	    	    	} else {
	    	    		player.sendMessage("§l§4"+ target.getName()+ " §6has been healed");
	    	    		target.setHealth(20);
	    	    		target.sendMessage("§l§6You have been healed!");
				}
	    	}
	    	   return true;
    }	
			if(cmd.getName().equalsIgnoreCase("godmode")) {
				//without arguments
				if(args.length == 0) {
					if(player.isInvulnerable()) {
						player.setInvulnerable(false);
						player.sendMessage("§l§6set [§4GODMODE§6] to §cOFF§6 to " + player.getName());
					} else {
						player.setInvulnerable(true);
						player.sendMessage("§l§6set [§4GODMODE§6] to §2ON§6 to " + player.getName());
					}
				}
				//with arguments
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if(target == null || !target.isOnline()) {
						player.sendMessage("§l§4The target is offline or does not exist!");
					} else {
						if(target.isInvulnerable()) {
							target.setInvulnerable(false);;
							player.sendMessage("§l§6set [§4GODMODE§6] to §cOFF§6 to" + target.getName());
							target.sendMessage("§l§6[§4GODMODE§6] has been set to §cOFF");
						} else {
							target.setInvulnerable(true);
							player.sendMessage("§l§6set [§4GODMODE§6] to §2ON§6 to " + target.getName());
							target.sendMessage("§l§6[§4GODMODE§6] has been set to §2ON");
						}
					}
				}       
				
			return true;
	      }
			
			if(cmd.getName().equalsIgnoreCase("fly")) {
				//without arguments
				if(args.length == 0) {
					if(player.isFlying()) {
						player.setAllowFlight(false);
						player.setFlying(false);
						player.sendMessage("§l§6set [§4FLYMODE§6] to §cOFF§6 to " + player.getName());
					} else {
						player.setAllowFlight(true);
						player.setFlying(true);
						player.sendMessage("§l§6set [§4FLYMODE§6] to §2ON§6 to " + player.getName());
					}
				}
				//with arguments
				if(args.length == 1) {
					final Player target = Bukkit.getPlayerExact(args[0]);
					if(target == null || !target.isOnline()) {
						player.sendMessage("§l§4The target is offline or does not exist!");
					
					} else {
						if(target.isFlying()) {
							target.setAllowFlight(false);
							target.setFlying(false);
							player.sendMessage("§l§6set [§4FLYMODE§6] to §cOFF§6 to " + target.getName());
							target.sendMessage("§l§6[§4FLYMODE§6] has been set to §cOFF");
						} else {
							target.setAllowFlight(true);
							target.setFlying(true);
							player.sendMessage("§l§6set [§4FLYMODE§6] to §2ON§6 to " + target.getName());
							target.sendMessage("§l§6[§4FLYMODE§6] has been set to §2ON");
						}
					}
				}
				
			return true;
	      }
			
		  
	   
    }
		
		return false;
 }
    
};

	