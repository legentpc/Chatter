package at.legentpc.chatter.events

import at.legentpc.chatter.utils.IslandType

fun interface IslandChangeEvent {
    fun onIslandChange(newIsland: IslandType, oldIsland: IslandType)
}
