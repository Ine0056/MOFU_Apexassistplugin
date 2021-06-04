package ine0056.com.github.mofu_apexassistplugin;

import org.bukkit.plugin.java.JavaPlugin;
import ine0056.com.github.mofu_apexassistplugin.MOFU_Apexassistplugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fighttimer extends JavaPlugin{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("mopex")) {
                if (args.length != 0) {
                    if (args[0].equalsIgnoreCase("gamestart")) {

                    }
                }
            }
        }
    }
}
