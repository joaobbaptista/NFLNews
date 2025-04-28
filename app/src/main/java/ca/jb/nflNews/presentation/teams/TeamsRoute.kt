package ca.jb.nflNews.presentation.teams

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ca.jb.nflNews.core.data.TeamDetailResponse
import ca.jb.nflNews.core.ui.utils.toColor
import coil3.compose.AsyncImage
import org.koin.androidx.compose.koinViewModel

@Composable
fun TeamsRoute(viewModel: TeamsViewModel = koinViewModel()) {
    val state = viewModel.state.collectAsStateWithLifecycle()

    TeamsScreen(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp), state.value
    )
}

@Composable
fun TeamsScreen(modifier: Modifier = Modifier, value: TeamsState) {
    Column(modifier = modifier) {
        Text(
            modifier = Modifier
                .padding(vertical = 8.dp),
            text = "NFL News",
            fontSize = 18.sp,
        )
        HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(value.teams) { team ->
                TeamDetail(team)
            }
        }
    }
}

@Composable
fun TeamDetail(team: TeamDetailResponse) {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Black,
                        team.color.toColor()
                    )
                ), shape = RoundedCornerShape(8.dp)

            )
            .border(
                width = 2.dp,
                color = Color.White,
                shape = RoundedCornerShape(8.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AsyncImage(
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp),
            model = team.logos[3].href,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )

        Text(team.displayName)
    }


}