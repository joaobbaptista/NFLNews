package ca.jb.nflNews

import android.app.Application
import ca.jb.nflNews.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class EaglesApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@EaglesApplication)
            modules(appModule)
        }
    }
}