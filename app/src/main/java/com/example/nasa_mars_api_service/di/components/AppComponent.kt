package com.example.nasa_mars_api_service.di.components

import android.content.Context
import com.example.nasa_mars_api_service.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun appContext(context: Context): Builder

        fun build(): AppComponent
    }

}