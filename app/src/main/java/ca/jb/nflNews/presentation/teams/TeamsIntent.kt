package ca.jb.nflNews.presentation.teams

sealed interface TeamsIntent {
    data class onTeamClick(val team: String) : TeamsIntent
}