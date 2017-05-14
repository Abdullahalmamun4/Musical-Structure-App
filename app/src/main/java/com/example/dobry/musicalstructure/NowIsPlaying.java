package com.example.dobry.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NowIsPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);


        // Mapping for all buttons on the screen
        ImageButton playButton = (ImageButton) findViewById(R.id.playSongButton);
        ImageButton previousSongButton = (ImageButton) findViewById(R.id.previousSongButton);
        ImageButton nextSongButton = (ImageButton) findViewById(R.id.nextSongButton);
        ImageButton repeatButton = (ImageButton) findViewById(R.id.repeatButton);
        ImageButton shuffleButton = (ImageButton) findViewById(R.id.shuffleButton);
        ImageButton buyCurrentSongButton = (ImageButton) findViewById(R.id.buyCurrentSongButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Song is playing", Toast.LENGTH_SHORT).show();
            }
        });

        previousSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switched to previous song", Toast.LENGTH_SHORT).show();
            }
        });

        nextSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switched to next song", Toast.LENGTH_SHORT).show();
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Song will be repeated", Toast.LENGTH_SHORT).show();
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Shuffle has been enabled", Toast.LENGTH_SHORT).show();
            }
        });

        buyCurrentSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You decided buy this song. Thank you.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
