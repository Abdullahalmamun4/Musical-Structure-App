package com.example.dobry.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Mapping buttons
        Button readMoreArtist1 = (Button) findViewById(R.id.readMoreButtonArtist1);
        Button readMoreArtist2 = (Button) findViewById(R.id.readMoreButtonArtist2);
        Button readMoreArtist3 = (Button) findViewById(R.id.readMoreButtonArtist3);
        Button readMoreArtist4 = (Button) findViewById(R.id.readMoreButtonArtist4);

        // Listeners for buttons
        readMoreArtist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
