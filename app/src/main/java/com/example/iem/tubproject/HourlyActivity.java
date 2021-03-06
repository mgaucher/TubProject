package com.example.iem.tubproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import com.example.iem.tubproject.rest.ApiClient;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourlyActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly);
        final GridView gridHoraire = (GridView) findViewById(R.id.gridHoraire);

        Spinner spinnerArret = (Spinner)findViewById(R.id.SpinnerArret);
        String name = "";
        int i = 0;


        //Appel VIA RetroFit des données, mode test
        ApiClient.getLines();
        ApiClient.getPass();
        ApiClient.getStops();








        final List<LineHoraire> listeligneHoraire = new ArrayList<LineHoraire>();

        CSVReader reader = null;
         reader = new CSVReader(new InputStreamReader(getResources().openRawResource(R.raw.horaire1),
                    Charset.forName("windows-1254")),';', CSVParser.DEFAULT_QUOTE_CHARACTER, 0);

        ArrayList<String> listeArray = new ArrayList<>();

        final ArrayList<String> horraireArray = new ArrayList<>();
        String[] nextLine;
        try {
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine != null) {
                    name = nextLine[0];
                    i =  nextLine.length;


                        while (i != 0) {

                            i--;

                                horraireArray.add(nextLine[i]);



                            if (i == 0) {


                                ArrayList Horaire = (ArrayList) horraireArray.clone();
                                Collections.reverse(Horaire);
                                listeligneHoraire.add(new LineHoraire(name, Horaire));
                                horraireArray.clear();
                            }

                        }
                        listeArray.add(nextLine[0]);
                    }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, listeArray);
        spinnerArret.setAdapter(adapter);
        spinnerArret.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,int position, long id) {

                for (LineHoraire e : listeligneHoraire)
                {


                    if(e.getNom() == arg0.getItemAtPosition(position).toString())
                    {

                        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_gallery_item, e.getListe());

                        gridHoraire.setAdapter(adapter2);

                    }
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

    }
}

