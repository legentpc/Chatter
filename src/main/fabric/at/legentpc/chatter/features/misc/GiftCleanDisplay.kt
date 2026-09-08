package at.legentpc.chatter.features.misc

import at.legentpc.chatter.ChatterModLoader
import at.legentpc.chatter.events.ChatterEvents
import at.legentpc.chatter.module.Module
import net.minecraft.network.chat.Component

object GiftCleanDisplay : Module("Gift Clean Display") {

    private val colorCode = Regex("§[0-9a-fk-orA-FK-OR]")

    fun init() {
        ChatterEvents.ENTITY_DISPLAY_NAME.register { event ->
            if (!ChatterModLoader.configManager.config.misc.hideGiftNametag) return@register
            val clean = event.displayName.string.replace(colorCode, "").trim()
            if (clean.startsWith("From:") || clean.startsWith("To:")) {
                event.displayName = Component.literal("")
            }
        }
    }
}
