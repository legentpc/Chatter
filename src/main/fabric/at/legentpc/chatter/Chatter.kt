package at.legentpc.chatter

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Chatter : ModInitializer {

    const val MOD_ID = "chatter"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Chatter initialized")
    }
}
