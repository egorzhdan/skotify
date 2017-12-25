package com.egorzh.skotify.core.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import com.egorzh.skotify.core.SpotifyObject

/**
 * @author Egor Zhdan
 */
@Serializable
data class Playlist(
        val collaborative: Boolean,
        @SerialName("external_urls") val externalURLs: Map<String, String>,
        val href: String,
        val id: String,
        // TODO images
        val name: String,
        // TODO public
        @SerialName("snapshot_id") val snapshotID: String,
        // TODO tracks
        val uri: String
) : SpotifyObject