package com.example.iem.tubproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.iem.tubproject.Models.Line;
import com.example.iem.tubproject.Models.Stop;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.R.attr.data;
import static com.example.iem.tubproject.rest.ApiClient.getApiInterface;


public class CalculateActivity extends AppCompatActivity {

    Spinner spChooseLigne ;
    Spinner spStartStop;
    Spinner spFinishStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getLines(this);


        setContentView(R.layout.activity_calculate);
        spChooseLigne = (Spinner) findViewById(R.id.SpinchooseLigne);
        spStartStop = (Spinner) findViewById(R.id.SpinchooseLigne);
        spChooseLigne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Line line = (Line)spChooseLigne.getSelectedItem();
                getStopById(line.getIdLine(),getApplicationContext());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void getLines(final Context context) {

        Call<List<Line>> call = getApiInterface().getLines();

        call.enqueue(new Callback<List<Line>>() {
                         @Override
                         public void onResponse(Call<List<Line>> call, Response<List<Line>> response) {
                             if(response.body().size() == 0)
                             {
                                 Toast.makeText(context,"Pas de ligne disponible",
                                         Toast.LENGTH_LONG).show();
                             }
                             else
                             {
                                 spChooseLigne = (Spinner) findViewById(R.id.SpinchooseLigne);
                                 ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(context,
                                         android.R.layout.simple_spinner_item, response.body());
                                 spChooseLigne.setAdapter(spinnerArrayAdapter);
                             }
                         }

                         @Override
                         public void onFailure (Call < List < Line >> call, Throwable t){
                             Toast.makeText(context,"Erreur lors de la récupération des données",
                                     Toast.LENGTH_LONG).show();
                         }

                     }

        );
    }
    public void getStopById(String idLine,final Context context) {

        Call<List<Stop>> call = getApiInterface().getStopById(idLine);

        call.enqueue(new Callback<List<Stop>>() {
                         @Override
                         public void onResponse(Call<List<Stop>> call, Response<List<Stop>> response) {
                             if(response.body().size() == 0)
                             {
                                 Toast.makeText(context,"Pas d'arrêt disponible",
                                         Toast.LENGTH_LONG).show();
                             }
                             else{
                                 spStartStop = (Spinner) findViewById(R.id.etDepart);
                                 spFinishStop= (Spinner) findViewById(R.id.etArrivee);
                                 ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(context,
                                         android.R.layout.simple_spinner_item, response.body());
                                 spStartStop.setAdapter(spinnerArrayAdapter);
                                 spFinishStop.setAdapter(spinnerArrayAdapter);
                             }

                         }

                         @Override
                         public void onFailure (Call < List < Stop >> call, Throwable t){
                             Toast.makeText(context,"Erreur lors de la récupération des données",
                                     Toast.LENGTH_LONG).show();
                         }

                     }
        );
    }

    /*

    TABLE PASSAGE
    id : 123
    Nom ; Mon arret
    Ligne : 1
    Heure : 8h32
    PassagePrec : 122
    PassageSuiv : 124
    Date : 23/12/2017



    Entrée : Station de départ ; Heure de départ ; Station arrivée
    Sortie : Heure d'arrivée
    * */


}


