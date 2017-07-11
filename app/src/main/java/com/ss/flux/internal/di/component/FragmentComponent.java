package com.ss.flux.internal.di.component;

import android.app.Fragment;

import com.ss.flux.internal.di.module.FragmentModule;
import com.ss.flux.internal.di.scope.FragmentScope;

import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(Fragment fragment);

}
