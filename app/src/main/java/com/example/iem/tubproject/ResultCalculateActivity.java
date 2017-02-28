package com.example.iem.tubproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ResultCalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_calculate);


        Intent myIntent = getIntent();
        String startStop = myIntent.getStringExtra("startStop");
        String finishStop= myIntent.getStringExtra("finishStop");
        String numLine= myIntent.getStringExtra("numLine");
        String hour= myIntent.getStringExtra("hour");
        String minute= myIntent.getStringExtra("minute");


        Toast.makeText(this,startStop+finishStop+numLine+hour+minute,
                Toast.LENGTH_LONG).show();
    }
}
