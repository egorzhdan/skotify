package com.egorzh.skotify.api

import kotlinx.serialization.Serializable
import com.egorzh.skotify.core.models.Track

@Serializable
internal class TracksList(val tracks: List<Track>)