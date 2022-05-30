package com.example.crypto.app

import android.app.Application
import com.example.crypto.app.module.networkModule
import com.example.crypto.app.module.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        startKoin {
            androidContext(this@App)
            modules(
                (
                        listOf(
                            networkModule,
                            uiModule
                        )
                        )
            )
        }
    }

    companion object {
        internal lateinit var INSTANCE: App
            private set
    }
}
