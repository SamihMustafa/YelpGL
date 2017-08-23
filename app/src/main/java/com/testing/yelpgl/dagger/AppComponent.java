package com.testing.yelpgl.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ali on 24-Aug-17.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {



}
