package ca.jb.nflNews.presentation.teams

import ca.jb.nflNews.core.data.TeamDetailResponse
import ca.jb.nflNews.core.data.TeamResponse

data class TeamsState(
    //TODO: change to UI object
    val teams: List<TeamResponse> = emptyList()
)