package at.legentpc.chatter.config

import at.legentpc.chatter.ChatterModLoader
import io.github.notenoughupdates.moulconfig.common.IMinecraft
import net.minecraft.client.Minecraft

object ConfigGuiManager {

    fun openGui() {
        val client = Minecraft.getInstance()
        client.execute {
            val editor = ChatterModLoader.configManager.managedConfig.getEditor()
            IMinecraft.INSTANCE.openWrappedScreen(editor)
        }
    }
}
