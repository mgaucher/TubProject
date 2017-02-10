package com.example.iem.tubproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.widget.LoginButton;

import static com.example.iem.tubproject.R.id.login_button;

//import static com.example.iem.tubproject.R.id.login_button;g


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this);

        setContentView(R.layout.activity_home);
        LoginButton loginButton;

        CallbackManager callbackManager;
        loginButton = (LoginButton) findViewById(login_button);
        callbackManager = CallbackManager.Factory.create();


        Button btnContinueWithoutLogin = (Button)findViewById(R.id.btnContinueWithoutLogin);
        btnContinueWithoutLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);


            }

        });


       Profile profile = Profile.getCurrentProfile();
      // Toast.makeText(getApplicationContext(), profile.getFirstName().toString(),
            //   Toast.LENGTH_SHORT).show();
    }
}
