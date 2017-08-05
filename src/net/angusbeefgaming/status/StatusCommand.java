package net.angusbeefgaming.status

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;


public class StatusCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(!(sender.hasPermission("serverstatus.use"))){
			sender.sendMessage(ChatColor.RED + "Missing Permission node: serverstatus.use");
			return false;
		}
		sender.sendMessage(ChatColor.GREEN + "Server Name > " + ChatColor.YELLOW + Bukkit.getServer().getServerName());
		sender.sendMessage(ChatColor.GREEN + "Gamemode > " + ChatColor.YELLOW + Bukkit.getServer().getDefaultGameMode());
		sender.sendMessage(ChatColor.GREEN + "Max Players > " + ChatColor.YELLOW + Bukkit.getServer().getMaxPlayers());
		sender.sendMessage(ChatColor.GREEN + "Whitelist Running > " + ChatColor.YELLOW + Bukkit.getServer().hasWhitelist());
		sender.sendMessage(ChatColor.GREEN + "Hardcore Mode > " + ChatColor.YELLOW + Bukkit.getServer().isHardcore());
		sender.sendMessage(ChatColor.GREEN + "Server Version > " + ChatColor.YELLOW + Bukkit.getServer().getVersion());
		sender.sendMessage(ChatColor.GREEN + "Flight Allowed > " + ChatColor.YELLOW + Bukkit.getServer().getAllowFlight());
		sender.sendMessage(ChatColor.GREEN + "Nether Allowed > " + ChatColor.YELLOW + Bukkit.getServer().getAllowNether());
		sender.sendMessage(ChatColor.GREEN + "End Allowed > " + ChatColor.YELLOW + Bukkit.getServer().getAllowEnd());
		sender.sendMessage(ChatColor.GREEN + "Server Port > " + ChatColor.YELLOW + Bukkit.getServer().getPort());
		sender.sendMessage(ChatColor.GREEN + "Online Mode > " + ChatColor.YELLOW + Bukkit.getServer().getOnlineMode());
		return true;
	}

}
