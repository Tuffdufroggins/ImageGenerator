package m_a_n.imagegenerator.commands;

import m_a_n.imagegenerator.Utils;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("§7[§9ImGen§7] Help:");
        sender.sendMessage("§7Put images in §9{server location}/plugins/ImageGenerator");
        sender.sendMessage("§7Example: §8\"MyServer/plugins/ImageGenerator/image.png\"");
        sender.sendMessage("");
        sender.sendMessage("§7To render the image in game use §9/image");
        sender.sendMessage("§9/image <filename> <x direction> <y direction> <z direction> [<x> <y> <z>] (pos optional)");
        sender.sendMessage("§7Example: §8/image image.png 0 -1 1");
        sender.sendMessage("§7or §8/image house.jpeg 1 0 1 500 62 1402");
        sender.sendMessage("§8Supports nearly all image types");
        sender.sendMessage("");
        sender.sendMessage("§7To adjust which blocks are used use §9/filter");

        return true;
    }
}