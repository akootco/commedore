package co.akoot.plugins.commedore

import co.akoot.plugins.bluefox.BlueFox
import org.bukkit.plugin.java.JavaPlugin

class Commedore : JavaPlugin() {

    override fun onEnable() {
        logger.info("We are eating good tonight!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}