package ca.jb.nflNews.presentation.teams

import ca.jb.nflNews.core.data.TeamDetailResponse

data class TeamsState(
    //TODO: change to UI object
    val teams: List<TeamDetailResponse> = emptyList()
)