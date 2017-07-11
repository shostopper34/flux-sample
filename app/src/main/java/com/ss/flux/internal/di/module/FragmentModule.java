package com.ss.flux.internal.di.module;

import android.app.Fragment;
import android.app.FragmentManager;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {

    final Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    public FragmentManager provideFragmentManager() {
        return  fragment.getFragmentManager();
    }
}
