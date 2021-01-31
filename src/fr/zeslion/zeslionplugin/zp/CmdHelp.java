package fr.zeslion.zeslionplugin.zp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdHelp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		
		p.sendMessage("§c------------[§aZeslionPlugin §6Help§c]------------");
		p.sendMessage("");
		p.sendMessage("§c- §6/miniinv <enable/disable> - §cCommande pour activer/désactiver le module §6MiniInv§c.");
		p.sendMessage("");
		p.sendMessage("§c----------[§6Plugin fait par §aZeslion§c]----------");
				
		
		return false;
	}

}
