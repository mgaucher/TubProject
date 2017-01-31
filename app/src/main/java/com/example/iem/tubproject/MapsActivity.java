package com.example.iem.tubproject;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.kml.KmlLayer;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
/** Connection / récupérer json
 Retrofit

 Objet from db
 DBFlow
**/
 private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {

        final Spinner selectLine = (Spinner) findViewById(R.id.spinnerline);

        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(46.2, 5.23), 12.8f));

        Button btnTimeTable = (Button)findViewById(R.id.btnTimeTable);
        btnTimeTable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), HoraireActivity.class);
                intent.putExtra("numligne",selectLine.getSelectedItem().toString());

                startActivity(intent);


            }

        });

        Button btnCalculate = (Button)findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
                startActivity(intent);


            }

        });

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.LigneBusArray, android.R.layout.simple_spinner_item);
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Apply the adapter to the spinner
            selectLine.setAdapter(adapter);


            selectLine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String loadLine = selectLine.getSelectedItem().toString();
                  loadLine =   loadLine.replaceAll("\\s+", "");
                  loadLine = loadLine.toLowerCase();
                    switch (loadLine) {
                        case "ligne1": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne1, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne2": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne2, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne3": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne3, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne4": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne4, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne5": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne5, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne6": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne6, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne7": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne7, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne8": {
                          try {
                           mMap.clear();
                           KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne8, getApplicationContext());
                           layer.addLayerToMap();
                          } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "ligne21": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne21, getApplicationContext());
                                layer.addLayerToMap();
                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }
                        case "touteleslignes": {
                            try {
                                mMap.clear();
                                KmlLayer layer = new KmlLayer(googleMap, R.raw.ligne1, getApplicationContext());
                                KmlLayer layer2 = new KmlLayer(googleMap, R.raw.ligne2, getApplicationContext());
                                KmlLayer layer3 = new KmlLayer(googleMap, R.raw.ligne3, getApplicationContext());
                                KmlLayer layer4 = new KmlLayer(googleMap, R.raw.ligne4, getApplicationContext());
                                KmlLayer layer5 = new KmlLayer(googleMap, R.raw.ligne5, getApplicationContext());
                                KmlLayer layer6 = new KmlLayer(googleMap, R.raw.ligne5, getApplicationContext());
                                KmlLayer layer7 = new KmlLayer(googleMap, R.raw.ligne7, getApplicationContext());
                                KmlLayer layer8 = new KmlLayer(googleMap, R.raw.ligne8, getApplicationContext());
                                KmlLayer layer21 = new KmlLayer(googleMap, R.raw.ligne21, getApplicationContext());

                                layer.addLayerToMap();
                                layer2.addLayerToMap();
                                layer3.addLayerToMap();
                                layer4.addLayerToMap();
                                layer5.addLayerToMap();
                                layer6.addLayerToMap();
                                layer7.addLayerToMap();
                                layer8.addLayerToMap();
                                layer21.addLayerToMap();

                            } catch (IOException e) {e.printStackTrace();} catch (XmlPullParserException e) {e.printStackTrace();}
                            break;
                        }


                    }


                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }


            });



    }
}