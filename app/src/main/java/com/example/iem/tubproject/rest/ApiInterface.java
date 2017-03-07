package com.example.iem.tubproject.rest;

/**
 * Created by iem on 10/01/2017.
 */


import com.example.iem.tubproject.Models.CalculatedPath;
import com.example.iem.tubproject.Models.Line;
import com.example.iem.tubproject.Models.Lines;
import com.example.iem.tubproject.Models.Pass;
import com.example.iem.tubproject.Models.Stop;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ApiInterface {


    @GET("stops")
    Call<List<Stop>> getStops();

    @GET("lines")
    Call<List<Line>> getLines();

    @GET("pass")
    Call<List<Pass>> getPass();

    @FormUrlEncoded
    @POST("stopbyid")
    Call<List<Stop>> getStopById(@Field("id") String idLine);

    @FormUrlEncoded
    @POST("calcul")
    Call<CalculatedPath> calculatePath(@Field("idLine") String idLine, @Field("idStartStop") String idStartStop, @Field("idEndStop") String isEndStop,@Field("time") String time);




}
