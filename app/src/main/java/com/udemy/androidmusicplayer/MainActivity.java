package com.udemy.androidmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageView playPauseIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thunderstruck); }

    public void previus(View view) {
    }

    public void next(View view) {
    }

    public void play(View view) {
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            playPauseIcon.setImageResource(R.drawable.ic_baseline_pause_green_24);
        } else
        {
            mediaPlayer.start();
       //     playPauseIcon.setImageResource(R.drawable.ic_baseline_play_green_24);
        }
    }
}