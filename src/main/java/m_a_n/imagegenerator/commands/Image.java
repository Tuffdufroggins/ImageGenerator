package m_a_n.imagegenerator.commands;

import m_a_n.imagegenerator.Main;
import m_a_n.imagegenerator.Utils;
import org.bukkit.World;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Image  implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Entity || sender instanceof BlockCommandSender)) {
            sender.sendMessage("§7[§9ImGen§7] You can't use this command here :(");
            return true;
        }

        if(sender instanceof Player && args.length == 4) {

            Player player = (Player) sender;

            Utils.drawImage(args[0], player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ(), player.getWorld(), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));

            return true;
        }

        if(args.length >= 7) {
            if(sender instanceof Entity) {
                Utils.drawImage(args[0], Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), ((Entity)sender).getWorld(), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
            } else {
                Utils.drawImage(args[0], Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), ((BlockCommandSender)sender).getBlock().getWorld(), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
            }
            return true;
        }

        sender.sendMessage("§7[§9ImGen§7] Usage §9/image <filename> <x direction> <y direction> <z direction> [<x> <y> <z>] (pos optional)");
        return true;
    }
}