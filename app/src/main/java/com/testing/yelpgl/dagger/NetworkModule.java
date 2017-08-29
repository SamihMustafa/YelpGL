package com.testing.yelpgl.dagger;

import com.apollographql.android.converter.pojo.ApolloConverterFactory;
import com.testing.yelpgl.util.AppConstant;
import com.testing.yelpgl.network.WebService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ali on 24-Aug-17.
 */

@Module
public class NetworkModule {

    private final String baseUrl;

    public NetworkModule(String baseUrl) {
        this.baseUrl = baseUrl;
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
    ApolloConverterFactory provideApolloConverter() {
        return new ApolloConverterFactory.Builder().build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(GsonConverterFactory converter, ApolloConverterFactory apollo, RxJava2CallAdapterFactory callAdapter) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converter)
                .addConverterFactory(apollo)
                .addCallAdapterFactory(callAdapter)
                .build();
    }

    @Provides
    @Singleton
    WebService provideWebServiceApi(Retrofit retrofit) {
        return retrofit.create(WebService.class);
    }


}
