package ca.jb.nflNews.presentation.teams

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ca.jb.nflNews.core.network.Result
import ca.jb.nflNews.domain.teams.TeamsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TeamsViewModel(
    teamsRepository: TeamsRepository
) : ViewModel() {
    var _state = MutableStateFlow(TeamsState())
    val state = _state.asStateFlow()


    init {

        viewModelScope.launch {
            teamsRepository.provideTeams().collect { response ->
                when (response) {
                    is Result.Error -> {

                    }

                    Result.Loading -> {

                    }

                    is Result.Success -> {
                        _state.update { TeamsState(teams = response.data) }
                    }
                }
            }
        }
    }
}