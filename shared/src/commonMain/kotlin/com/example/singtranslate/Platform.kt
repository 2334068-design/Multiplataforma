package com.example.singtranslate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform