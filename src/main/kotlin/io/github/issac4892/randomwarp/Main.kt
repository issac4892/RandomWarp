package io.github.issac4892.randomwarp

/**
 *  @author issac4892
 */

import io.github.issac4892.randomwarp.commands.RandomWarp
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(){
    override fun onEnable() {
        logger.info("---------------------------------")
        logger.info("RandomWarp Ver1.0")
        logger.info("\n")
        logger.info("Made by @issac4892")
        logger.info("github.com/issac4892")
        logger.info("\n")
        logger.info("Plugin Enabled!")
        logger.info("---------------------------------")
        getCommand("rwarp")?.executor = RandomWarp()
    }

    override fun onDisable() {
        logger.info("RandomWarp Plugin Disabled.")
    }
}
