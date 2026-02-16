package com.dev.phosphor_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform