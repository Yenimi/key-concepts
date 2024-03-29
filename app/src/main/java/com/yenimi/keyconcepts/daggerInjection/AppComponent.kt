package com.yenimi.keyconcepts.daggerInjection

import android.app.Application
import com.yenimi.keyconcepts.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<BaseApplication?> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application?): Builder?

        fun build(): AppComponent?
    }
}