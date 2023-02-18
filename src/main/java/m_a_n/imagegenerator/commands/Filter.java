package m_a_n.imagegenerator.commands;

import m_a_n.imagegenerator.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Filter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args.length > 0 && (args[0].equals("falling") || args[0].equals("decaying"))) {
            if(args[0].equals("falling")) {
                Utils.falling = !Utils.falling;
                sender.sendMessage("§7[§9ImGen§7] Falling " + (Utils.falling ? "§aEnabled" : "§cDisabled"));
            }
            else {
                Utils.decaying = !Utils.decaying;
                sender.sendMessage("§7[§9ImGen§7] Decaying " + (Utils.decaying ? "§aEnabled" : "§cDisabled"));
            }

            return true;
        }

        sender.sendMessage("§7[§9ImGen§7] Usage §9/filter <falling/decaying>");

        return true;
    }
}