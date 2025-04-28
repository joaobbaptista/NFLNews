package ca.jb.nflNews.core.di

import ca.jb.nflNews.presentation.depthChart.DepthChartViewModel
import ca.jb.nflNews.presentation.teams.TeamsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::DepthChartViewModel)
    viewModelOf(::TeamsViewModel)

}