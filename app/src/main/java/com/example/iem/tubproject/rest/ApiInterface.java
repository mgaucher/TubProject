package com.example.iem.tubproject.rest;

/**
 * Created by iem on 10/01/2017.
 */


import com.example.iem.tubproject.Pojo.Line;
import com.example.iem.tubproject.Pojo.Stop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ApiInterface {


    @FormUrlEncoded
    @GET("/TubWebService/web/index.php/stops")
    Call<List<Stop>> getStops(@Field("id") int id);

    @FormUrlEncoded
    @POST("/CiradWB/web/index.php/parceluser")
    Call<List<Line>> getLines();

}
