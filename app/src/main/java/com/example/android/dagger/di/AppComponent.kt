package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

// Definition of a Dagger component
@Component(modules = [StorageModule::class])
interface AppComponent {
    fun inject(activity: RegistrationActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):AppComponent
    }
}