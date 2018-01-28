package com.egorzh.skotify.api

import kotlinx.serialization.Serializable
import com.egorzh.skotify.core.models.*

@Serializable
internal class TracksList(val tracks: List<Track>)

@Serializable
internal class SimplifiedAlbumsList(val items: List<SimplifiedAlbum>)