package com.example.iem.tubproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.widget.LoginButton;

import static com.example.iem.tubproject.R.id.login_button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LoginButton loginButton;

        FacebookSdk.sdkInitialize(this);
        CallbackManager callbackManager;
        loginButton = (LoginButton) findViewById(login_button);
        callbackManager = CallbackManager.Factory.create();

        Profile profile = Profile.getCurrentProfile();
//        Toast.makeText(getApplicationContext(), profile.getFirstName().toString(),
//                Toast.LENGTH_SHORT).show();
    }
}
