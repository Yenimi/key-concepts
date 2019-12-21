package com.yenimi.keyconcepts

import com.yenimi.keyconcepts.daggerInjection.AppComponent
import com.yenimi.keyconcepts.daggerInjection.DaggerAppComponent
import dagger.android.support.DaggerApplication


class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AppComponent? {
        return DaggerAppComponent.builder().application(this)!!.build()
    }
}