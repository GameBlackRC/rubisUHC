package fr.gameblack.rubisuhc.commands.admin;

import fr.gameblack.rubisuhc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandReset implements CommandExecutor {

    private Main main;

    public CommandReset(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {

        main.getInvulnerable().clear();

        return false;
    }

}
