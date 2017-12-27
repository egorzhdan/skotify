# skotify – Spotify API for Kotlin

This is Spotify API for Kotlin (currently JVM-only), which uses [networkinkt](https://github.com/egorzhdan/networkinkt) to make HTTP requests.

```kotlin
val a = Spotify.getArtist(id = "0gxyHStUsqpMadRV0Di1Qt")
println(a.name) // prints "Rick Astley"
```

## Getting started

Add Gradle dependency:

```gradle
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    compile "com.egorzh:skotify:$skotify_version"
}
```

Then set the credentials generated on the Spotify Developers website:

```kotlin
Credentials.clientID = "..."
Credentials.clientSecret = "..."
```
