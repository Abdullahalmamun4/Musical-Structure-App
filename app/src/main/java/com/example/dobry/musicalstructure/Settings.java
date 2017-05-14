package com.example.dobry.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Mapping buttons
        Button registerSpotifyButton = (Button) findViewById(R.id.buttonRegister);
        Button loginSpotifyButton = (Button) findViewById(R.id.buttonLogin);
        Button logintoSpotifyViaFacebook = (Button) findViewById(R.id.loginViaFacebook);
        Button logintoSpotifyViaGoogle = (Button) findViewById(R.id.loginViaGoogle);

        // Listeners for buttons
        registerSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_register_message,Toast.LENGTH_SHORT).show();
            }
        });

        loginSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message,Toast.LENGTH_SHORT).show();
            }
        });

        logintoSpotifyViaFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message,Toast.LENGTH_SHORT).show();
            }
        });

        logintoSpotifyViaGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
