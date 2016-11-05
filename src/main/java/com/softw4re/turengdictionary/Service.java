package com.softw4re.turengdictionary;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ugurc on 4.11.2016.
 */
interface Service {

    @POST("Search")
    Call<ResponseBody> search(@Body RequestBody requestBody);

}