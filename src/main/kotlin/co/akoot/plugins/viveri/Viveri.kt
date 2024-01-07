package co.akoot.plugins.viveri

import org.bukkit.plugin.java.JavaPlugin

class Viveri : JavaPlugin() {

    override fun onEnable() {
        logger.info("We are eating good tonight!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}