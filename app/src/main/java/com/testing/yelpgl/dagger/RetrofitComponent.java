package com.testing.yelpgl.dagger;

import com.testing.yelpgl.network.WebService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ali on 24-Aug-17.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface RetrofitComponent {

    WebService provideWebService();

}
