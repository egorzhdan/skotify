package com.egorzh.skotify.api

import com.egorzh.skotify.core.models.Artist

suspend fun Spotify.getArtist(id: String) = getAndParse<Artist>("artists/$id")