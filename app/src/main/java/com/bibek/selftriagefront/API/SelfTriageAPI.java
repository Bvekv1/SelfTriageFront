package com.bibek.selftriagefront.API;

import com.bibek.selftriagefront.SignUpResponse.SignUpResponse;
import com.bibek.selftriagefront.model.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SelfTriageAPI {
    @POST("/api/v1/registerUser")
    Call<SignUpResponse> registerUser(@Body Users users);

    @FormUrlEncoded
    @POST("/api/v1/loginUser")
    Call<SignUpResponse> checkUser(@Field("email") String email, @Field("password") String password);


}
