package com.testing.yelpgl.network;

import com.testing.yelpgl.network.model.YelpAuthentication;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by Ali on 23-Aug-17.
 */

public interface WebService {

    @POST("oauth2/token")
    Single<YelpAuthentication> getAutenticationTokenFromYelp(@Field("grant_type") String grantType,
                                                             @Field("client_id") String clientID,
                                                             @Field("client_secret") String clientSecret);
}
