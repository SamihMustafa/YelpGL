package com.testing.yelpgl.network;

import com.apollographql.apollo.api.Response;
import com.testing.yelpgl.network.model.YelpAuthentication;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import yelp.SearchYelpQuery;

/**
 * Created by Ali on 23-Aug-17.
 */

public interface WebService {

    @POST("oauth2/token")
    Single<YelpAuthentication> getAutenticationTokenFromYelp(@Field("grant_type") String grantType,
                                                             @Field("client_id") String clientID,
                                                             @Field("client_secret") String clientSecret);

    @GET("/graphql")
    Observable<Response<SearchYelpQuery.Search>> getSearchResults(@Query("query") String query);


}
