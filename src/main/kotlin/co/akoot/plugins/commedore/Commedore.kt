package co.akoot.plugins.commedore

import co.akoot.plugins.bluefox.BlueFox
import org.bukkit.plugin.java.JavaPlugin

class Commedore : JavaPlugin() {

    override fun onEnable() {
        logger.info("We are eating good tonight!")
        BlueFox.trace("hehehe.. - Commedore") // Test that PROVES we can reference BlueFox!!
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}