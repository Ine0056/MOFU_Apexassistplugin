package ine0056.com.github.mofu_apexassistplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import ine0056.com.github.mofu_apexassistplugin.MOFU_Apexassistplugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class Fighttimer extends JavaPlugin{

    private static int mopex20slefttask;
    private String mopexteam;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("mopex")) {
                if (args.length != 0) {
                    if (args[0].equalsIgnoreCase("gamestart")) {
                            Bukkit.broadcastMessage(ChatColor.RED + "30" + ChatColor.AQUA +"秒後にゲームを開始します...");
                            mopex20slefttask = Bukkit.getScheduler().runTaskLater(this, () -> {

                            }, 20*20L).getTaskId();
                    }
                }
            }
        }
        return false;
    }
}
