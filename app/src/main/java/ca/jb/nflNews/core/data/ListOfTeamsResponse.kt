package ca.jb.nflNews.core.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ListOfTeamsResponse(
    val sports: List<SportResponse>
)