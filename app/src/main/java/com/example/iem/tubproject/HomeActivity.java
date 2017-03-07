package com.example.iem.tubproject;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;



public class HomeActivity extends AppCompatActivity {
    CallbackManager callbackManager;
    TextView txtFacebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this);

        setContentView(R.layout.activity_home);

        callbackManager = CallbackManager.Factory.create();
        setFacebookDisplay();


        Button btnContinueWithoutLogin = (Button)findViewById(R.id.btnContinueWithoutLogin);
        btnContinueWithoutLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }

        });
        Button btnContinue = (Button)findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(AccessToken.getCurrentAccessToken()!= null){
                    Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(HomeActivity.this,"Veuillez vous connecter", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        callbackManager.onActivityResult(requestCode,resultCode,data);
        setFacebookDisplay();

    }

    private void setFacebookDisplay(){
        Profile profile = Profile.getCurrentProfile();

        if(AccessToken.getCurrentAccessToken() != null)
        {
            txtFacebook = (TextView) findViewById(R.id.txtFacebook);
            txtFacebook.setText("Bonjour "+profile.getFirstName().toString()+" "+ profile.getLastName().toString());
            ProfilePictureView profilePictureView;

            profilePictureView = (ProfilePictureView) findViewById(R.id.friendProfilePicture);
            profilePictureView.setProfileId(profile.getId());
        }

    }



}
