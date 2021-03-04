package io.github.issac4892.randomwarp.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.Bukkit
import org.bukkit.entity.Player

class RandomWarp : CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean{
        if(sender is Player) {
            sender.sendMessage("You can't use this command as Player!")
        }
        else{
        for (player in Bukkit.getOnlinePlayers()) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "rtp $player ${args[0]}")
        }
    }
        return true
    }
}