package at.legentpc.chatter.config.features.misc

import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption

class MiscConfig {

    @ConfigOption(name = "Hide Gift Nametag", desc = "Hides the nametag above gift entities in Skyblock")
    @ConfigEditorBoolean
    var hideGiftNametag: Boolean = true
}
