package com.example.iem.tubproject.rest;

import android.content.Context;


import com.example.iem.tubproject.Pojo.Line;
import com.example.iem.tubproject.Pojo.Stop;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by iem on 10/01/2017.
 */

public class ApiClient  {

    public static final String BASE_URL = "http://138.68.89.183/TubWebService/web/index.php/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiInterface getApiInterface(){
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        return apiService;
    }


    public static void getStops(int id, final Context context){

        Call<List<Stop>> call =  getApiInterface().getStops(id);

        call.enqueue(new Callback<List<Stop>>() {
            @Override
            public void onResponse(Call<List<Stop>> call, Response<List<Stop>> response) {


            }

            @Override
            public void onFailure(Call<List<Stop>> call, Throwable t) {

            }

        });
    }

    public static void getLines(final Context context){

        Call<List<Line>> call =  getApiInterface().getLines();

        call.enqueue(new Callback<List<Line>>() {
            @Override
            public void onResponse(Call<List<Line>> call, Response<List<Line>> response) {


            }

            @Override
            public void onFailure(Call<List<Line>> call, Throwable t) {

            }

        });
    }


}
