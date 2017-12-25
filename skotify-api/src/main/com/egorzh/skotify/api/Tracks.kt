package com.egorzh.skotify.api

import com.egorzh.skotify.core.models.Track

suspend fun Spotify.getTrack(id: String) = getAndParse<Track>("tracks/$id")