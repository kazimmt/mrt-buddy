package net.adhikary.mrtbuddy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform