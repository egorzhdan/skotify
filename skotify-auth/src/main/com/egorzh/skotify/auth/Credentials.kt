package com.egorzh.skotify.auth

import com.egorzh.networkinkt.HTTP
import kotlinx.serialization.json.JSON
import java.util.*

/**
 * @author Egor Zhdan
 */
object Credentials {
    var clientID: String? = null
    var clientSecret: String? = null
    var grantType = "client_credentials"

    var accessToken: String? = null
        private set

    /**
     * Generates a new access token with limited expiration time
     */
    suspend fun authorize() {
        val id = checkNotNull(clientID)
        val secret = checkNotNull(clientSecret)

        val req = HTTP.post("https://accounts.spotify.com/api/token")
        req.configure {
            val auth = Base64.getEncoder().encodeToString("$id:$secret".toByteArray())
            setRequestProperty("Authorization", "Basic $auth")

            doOutput = true
            outputStream.writer().use { it.write("grant_type=$grantType") }
        }
        val resp = req.loadText()
        val parsed = JSON.nonstrict.parse<AccessToken>(resp)
        accessToken = parsed.token
    }
}