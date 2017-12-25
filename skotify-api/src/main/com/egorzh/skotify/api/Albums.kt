package com.egorzh.skotify.api

import com.egorzh.skotify.core.models.Album

suspend fun Spotify.getAlbum(id: String) = getAndParse<Album>("albums/$id")