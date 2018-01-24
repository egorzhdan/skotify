package com.egorzh.skotify.api

import kotlinx.serialization.json.JSON
import org.slf4j.*
import com.egorzh.networkinkt.*
import com.egorzh.skotify.auth.Credentials

/**
 * @author Egor Zhdan
 */
object Spotify {
    private suspend fun unsafeLoadData(endpoint: String): String {
        val req = HTTP.get("https://api.spotify.com/v1/$endpoint")
        req.configure {
            doOutput = true
            setRequestProperty("Authorization", "Bearer ${Credentials.accessToken}")
        }
        val resp = req.getText()
        LoggerFactory.getLogger(this::class.java).debug("Requested $endpoint, received: $resp")
        return resp
    }

    internal suspend fun get(endpoint: String): String {
        try {
            return unsafeLoadData(endpoint)
        } catch (e: HTTPException) {
            if (e.code == 401 /* Unauthorized */) {
                println("Access denied, attempting to regenerate token...")
                Credentials.authorize()
                return unsafeLoadData(endpoint)
            }
            throw e
        }
    }

    internal inline suspend fun <reified T: Any> getAndParse(endpoint: String) =
            JSON.nonstrict.parse<T>(get(endpoint))
}