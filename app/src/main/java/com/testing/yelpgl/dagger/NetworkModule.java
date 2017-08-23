package com.testing.yelpgl.dagger;

import com.testing.yelpgl.AppConstant;
import com.testing.yelpgl.network.WebService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ali on 24-Aug-17.
 */

@Module
public class NetworkModule {

    private static final String NAME_BASE_URL = "NAME_BASE_URL";

    @Provides
    @Named(NAME_BASE_URL)
    String provideBaseUrlString() {
        return AppConstant.BASE_URL;
    }

    @Provides
    @Singleton
    GsonConverterFactory provideGsonConverter() {
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    RxJava2CallAdapterFactory provideRxJavaCallAdapter() {
        return RxJava2CallAdapterFactory.create();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(GsonConverterFactory converter, RxJava2CallAdapterFactory callAdapter, @Named(NAME_BASE_URL) String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converter)
                .addCallAdapterFactory(callAdapter)
                .build();
    }

    @Provides
    @Singleton
    WebService provideWebServiceApi(Retrofit retrofit) {
        return retrofit.create(WebService.class);
    }


}
