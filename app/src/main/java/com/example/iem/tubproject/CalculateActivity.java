package com.example.iem.tubproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.widget.LoginButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.example.iem.tubproject.R.id.login_button;


public class CalculateActivity extends AppCompatActivity {

    private String TAG = CalculateActivity.class.getSimpleName();

    private ProgressDialog pDialog;
    private ListView lv;

    // URL to get contacts JSON
    private static String url = "http://tubwebservice.local/index.php/bus/stop";

    ArrayList<HashMap<String, String>> lineList;



    private String[] arraySpinner;
    Spinner s ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_calculate);


        lineList = new ArrayList<>();

        lv = (ListView) findViewById(R.id.list);


        ArrayAdapter<String> adapter;
        List<String> list;
        list = new ArrayList<String>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");


        s = (Spinner) findViewById(R.id.etDepart);


        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);






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
