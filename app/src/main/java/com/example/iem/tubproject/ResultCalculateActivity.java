package com.example.iem.tubproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
        String  timeStart= myIntent.getStringExtra("timeStart");
        String  timeFinish= myIntent.getStringExtra("timeFinish");

        TextView  txtViewStopStart = (TextView) findViewById(R.id.txtViewStopStart);
        txtViewStopStart.setText(startStop);
        TextView  txtViewStopFinish = (TextView) findViewById(R.id.txtViewStopFinish);
        txtViewStopFinish.setText(finishStop);
        TextView  txtViewTimeStart = (TextView) findViewById(R.id.txtViewTimeStart);
        txtViewTimeStart.setText(timeStart);
        TextView  txtViewTimeFinish = (TextView) findViewById(R.id.txtViewTimeFinish);
        txtViewTimeFinish.setText(timeFinish);
        TextView  txtViewLine = (TextView) findViewById(R.id.txtViewLine);
        txtViewLine.setText("Ligne :" +numLine);


        Button btnMap = (Button) findViewById(R.id.btnMap);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        Button btnBackCalcul = (Button) findViewById(R.id.btnBackCalcul);

        btnBackCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
                startActivity(intent);
            }
        });

    }
}
