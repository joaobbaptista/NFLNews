package ca.jb.nflNews.presentation.teams

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel

@Composable
fun TeamsRoute(viewModel: TeamsViewModel = koinViewModel()) {
    val state = viewModel.state.collectAsStateWithLifecycle()

    TeamsScreen(Modifier.fillMaxSize(), state.value)
}

@Composable
fun TeamsScreen(modifier: Modifier = Modifier, value: TeamsState) {
    Column(modifier = modifier) {
        Text("NFL News")
        LazyColumn {
            items(value.teams) { team ->
                Text(team.team.name)
            }
        }
    }
}