package fr.zeslion.zeslionplugin.miniinv;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class MiniInvListeners implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		
		if(it.getType() == Material.BARRIER) {
			e.setCancelled(true);
			p.closeInventory();
			p.sendMessage("§cCette emplacement est bloqué par le module §6MiniInv§c.");
		}
		
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		
		ItemStack it = e.getItem();
		
		if(it.getType() == Material.BARRIER) {
			e.setCancelled(true);
		}
		
	}
	
}
