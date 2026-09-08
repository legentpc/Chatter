package at.legentpc.chatter

import at.legentpc.chatter.config.ChatterConfigManager
import at.legentpc.chatter.config.ConfigGuiManager
import at.legentpc.chatter.features.misc.GiftCleanDisplay
import at.legentpc.chatter.utils.HypixelUtils
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents

object ChatterModLoader : ClientModInitializer {

    val configManager: ChatterConfigManager = ChatterConfigManager()

    override fun onInitializeClient() {
        HypixelUtils.init()
        registerFeatures()
        registerCommands()
        registerShutdownHook()
    }

    private fun registerFeatures() {
        GiftCleanDisplay.init()
    }

    private fun registerCommands() {
        ClientCommandRegistrationCallback.EVENT.register { dispatcher, _ ->
            dispatcher.register(
                LiteralArgumentBuilder.literal<FabricClientCommandSource>("chatter")
                    .executes {
                        ConfigGuiManager.openGui()
                        1
                    }
            )
        }
    }

    private fun registerShutdownHook() {
        ClientLifecycleEvents.CLIENT_STOPPING.register {
            configManager.saveConfig()
        }
    }
}
