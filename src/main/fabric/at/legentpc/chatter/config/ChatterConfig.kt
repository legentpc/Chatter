package at.legentpc.chatter.config

import at.legentpc.chatter.config.features.misc.MiscConfig
import io.github.notenoughupdates.moulconfig.Config
import io.github.notenoughupdates.moulconfig.annotations.Category
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption

class ChatterConfig : Config() {

    @Category(name = "General", desc = "General Settings")
    var general: GeneralConfig = GeneralConfig()

    @Category(name = "Misc", desc = "Miscellaneous Features")
    var misc: MiscConfig = MiscConfig()

    class GeneralConfig {

        @ConfigOption(name = "Enable Chatter", desc = "Enable all Chatter mod features")
        @ConfigEditorBoolean
        var enabled: Boolean = true
    }
}
