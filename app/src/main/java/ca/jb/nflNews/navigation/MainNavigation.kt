package ca.jb.nflNews.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ca.jb.nflNews.presentation.depthChart.DepthChartRoute
import ca.jb.nflNews.presentation.teams.TeamsRoute

@Composable
fun MainNavigation(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = MainDestination.TEAMS.route,
        modifier = Modifier.Companion.padding(innerPadding)
    ) {
        composable(route = MainDestination.TEAMS.route) {
            TeamsRoute()
        }
        composable(route = MainDestination.DEPTH_CHART.route) {
            DepthChartRoute()
        }
    }
}
