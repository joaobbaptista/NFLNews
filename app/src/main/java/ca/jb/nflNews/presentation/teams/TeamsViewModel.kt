package ca.jb.nflNews.presentation.teams

import androidx.lifecycle.ViewModel
import ca.jb.nflNews.domain.teams.TeamsRepository

class TeamsViewModel(
    private val teamsRepository: TeamsRepository
) : ViewModel() {
}