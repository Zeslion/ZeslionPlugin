package fr.zeslion.zeslionplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.zeslion.zeslionplugin.miniinv.CmdMiniInv;
import fr.zeslion.zeslionplugin.miniinv.MiniInvListeners;
import fr.zeslion.zeslionplugin.zp.CmdHelp;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		System.out.println("Plugin ZeslionPlugin allume !");
		
		getCommand("help").setExecutor(new CmdHelp());
		getCommand("miniinv").setExecutor(new CmdMiniInv(this));
		
		getServer().getPluginManager().registerEvents(new MiniInvListeners(), this);
	}
	
}
