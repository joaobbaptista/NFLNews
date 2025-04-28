package ca.jb.nflNews.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ca.jb.nflNews.R

enum class MainDestination(
    @StringRes val titleIdRes: Int,
    @DrawableRes val iconRes: Int,
    val route: String
) {
    TEAMS(
        titleIdRes = R.string.teams,
        iconRes = R.drawable.ic_depth_chart,
        route = "teams"
    ),
    DEPTH_CHART(
        titleIdRes = R.string.depth_chart,
        iconRes = R.drawable.ic_depth_chart,
        route = "depth_chart"
    ),
    NEWS(
        titleIdRes = R.string.news,
        iconRes = R.drawable.ic_news,
        route = ""
    ),
    SCHEDULE(
        titleIdRes = R.string.schedule,
        iconRes = R.drawable.ic_calendar,
        route = ""
    )
}