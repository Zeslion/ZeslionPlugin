package fr.zeslion.zeslionplugin.miniinv;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.zeslion.zeslionplugin.Main;

public class CmdMiniInv implements CommandExecutor {
	
	private Main main;

	public CmdMiniInv(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		
		ItemStack it = new ItemStack(Material.BARRIER);
		ItemMeta itM = it.getItemMeta();
		itM.setDisplayName("§cMiniInv");
		it.setItemMeta(itM);
		
		if(args.length == 1 && args[0].equalsIgnoreCase("enable")) {
			
			if(main.getConfig().getInt("miniinv.level") == 1) {
				
				p.getInventory().setItem(9, it);
				p.getInventory().setItem(10, it);
				p.getInventory().setItem(11, it);
				p.getInventory().setItem(12, it);
				p.getInventory().setItem(13, it);
				p.getInventory().setItem(14, it);
				p.getInventory().setItem(15, it);
				p.getInventory().setItem(16, it);
				p.getInventory().setItem(17, it);
			
				p.sendMessage("§6Vous venez d'activer le §clevel 1 §6du module §cMiniInv§6.");			
			}
			
			if(main.getConfig().getInt("miniinv.level") == 2) {
				
				p.getInventory().setItem(9, it);
				p.getInventory().setItem(10, it);
				p.getInventory().setItem(11, it);
				p.getInventory().setItem(12, it);
				p.getInventory().setItem(13, it);
				p.getInventory().setItem(14, it);
				p.getInventory().setItem(15, it);
				p.getInventory().setItem(16, it);
				p.getInventory().setItem(17, it);
				
				p.getInventory().setItem(18, it);
				p.getInventory().setItem(19, it);
				p.getInventory().setItem(20, it);
				p.getInventory().setItem(21, it);
				p.getInventory().setItem(22, it);
				p.getInventory().setItem(23, it);
				p.getInventory().setItem(24, it);
				p.getInventory().setItem(25, it);
				p.getInventory().setItem(26, it);
				
				p.sendMessage("§6Vous venez d'activer le §clevel 2 §6du module §cMiniInv§6.");		
				
			}
			
			if(main.getConfig().getInt("miniinv.level") == 3) {
				
				p.getInventory().setItem(9, it);
				p.getInventory().setItem(10, it);
				p.getInventory().setItem(11, it);
				p.getInventory().setItem(12, it);
				p.getInventory().setItem(13, it);
				p.getInventory().setItem(14, it);
				p.getInventory().setItem(15, it);
				p.getInventory().setItem(16, it);
				p.getInventory().setItem(17, it);
				
				p.getInventory().setItem(18, it);
				p.getInventory().setItem(19, it);
				p.getInventory().setItem(20, it);
				p.getInventory().setItem(21, it);
				p.getInventory().setItem(22, it);
				p.getInventory().setItem(23, it);
				p.getInventory().setItem(24, it);
				p.getInventory().setItem(25, it);
				p.getInventory().setItem(26, it);
				
				p.getInventory().setItem(27, it);
				p.getInventory().setItem(28, it);
				p.getInventory().setItem(29, it);
				p.getInventory().setItem(30, it);
				p.getInventory().setItem(31, it);
				p.getInventory().setItem(32, it);
				p.getInventory().setItem(33, it);
				p.getInventory().setItem(34, it);
				p.getInventory().setItem(35, it);
				
				p.sendMessage("§6Vous venez d'activer le §clevel 3 §6du module §cMiniInv§6.");
				
			}
			
			if(main.getConfig().getInt("miniinv.level") == 4) {
				
				p.getInventory().setItem(9, it);
				p.getInventory().setItem(10, it);
				p.getInventory().setItem(11, it);
				p.getInventory().setItem(12, it);
				p.getInventory().setItem(13, it);
				p.getInventory().setItem(14, it);
				p.getInventory().setItem(15, it);
				p.getInventory().setItem(16, it);
				p.getInventory().setItem(17, it);
				
				p.getInventory().setItem(18, it);
				p.getInventory().setItem(19, it);
				p.getInventory().setItem(20, it);
				p.getInventory().setItem(21, it);
				p.getInventory().setItem(22, it);
				p.getInventory().setItem(23, it);
				p.getInventory().setItem(24, it);
				p.getInventory().setItem(25, it);
				p.getInventory().setItem(26, it);
				
				p.getInventory().setItem(27, it);
				p.getInventory().setItem(28, it);
				p.getInventory().setItem(29, it);
				p.getInventory().setItem(30, it);
				p.getInventory().setItem(31, it);
				p.getInventory().setItem(32, it);
				p.getInventory().setItem(33, it);
				p.getInventory().setItem(34, it);
				p.getInventory().setItem(35, it);
				
				p.getInventory().setItem(4, it);
				p.getInventory().setItem(5, it);
				p.getInventory().setItem(6, it);
				p.getInventory().setItem(7, it);
				p.getInventory().setItem(8, it);
				
				p.sendMessage("§6Vous venez d'activer le §clevel 4 §6du module §cMiniInv§6.");
				
			}
			
			if(main.getConfig().getInt("miniinv.level") == 5) {
				
				p.getInventory().setItem(9, it);
				p.getInventory().setItem(10, it);
				p.getInventory().setItem(11, it);
				p.getInventory().setItem(12, it);
				p.getInventory().setItem(13, it);
				p.getInventory().setItem(14, it);
				p.getInventory().setItem(15, it);
				p.getInventory().setItem(16, it);
				p.getInventory().setItem(17, it);
				
				p.getInventory().setItem(18, it);
				p.getInventory().setItem(19, it);
				p.getInventory().setItem(20, it);
				p.getInventory().setItem(21, it);
				p.getInventory().setItem(22, it);
				p.getInventory().setItem(23, it);
				p.getInventory().setItem(24, it);
				p.getInventory().setItem(25, it);
				p.getInventory().setItem(26, it);
				
				p.getInventory().setItem(27, it);
				p.getInventory().setItem(28, it);
				p.getInventory().setItem(29, it);
				p.getInventory().setItem(30, it);
				p.getInventory().setItem(31, it);
				p.getInventory().setItem(32, it);
				p.getInventory().setItem(33, it);
				p.getInventory().setItem(34, it);
				p.getInventory().setItem(35, it);
				
				p.getInventory().setItem(4, it);
				p.getInventory().setItem(5, it);
				p.getInventory().setItem(6, it);
				p.getInventory().setItem(7, it);
				p.getInventory().setItem(8, it);
				
				p.getInventory().setItem(1, it);
				p.getInventory().setItem(2, it);
				p.getInventory().setItem(3, it);
				p.getInventory().setItem(40, it);
				
				p.sendMessage("§6Vous venez d'activer le §clevel 5 §6du module §cMiniInv§6.");
				
			}
			
		}
		
		if(args.length == 1 && args[0].equalsIgnoreCase("disable")) {
			p.getInventory().clear();
			p.sendMessage("§cLe module §6MiniInv §ca été désactivé.");
		}
		
		return false;
	}

}
