package fr.gameblack.rubisuhc.commands.rc.toinou;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.gameblack.rubisuhc.Main;
import fr.gameblack.rubisuhc.Roles;
import fr.gameblack.rubisuhc.roles.rc.Toinou;

public class CommandBonus implements CommandExecutor {
	
	private Main main;
	
	public CommandBonus(Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		Player player = (Player)sender;
		
		if(main.getRole(player) == Roles.TOINOU) {
		
			Toinou.Texte_bonus(player);
			
		}
		else {
			
			player.sendMessage("Vous n'avez pas le bon rôle");
			
		}
		
		return false;
	}

}