package ca.jb.nflNews.core.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LogoResponse(
    val href: String,
    val alt: String,
    val rel: List<String>,
    val width: Int,
    val height: Int
)