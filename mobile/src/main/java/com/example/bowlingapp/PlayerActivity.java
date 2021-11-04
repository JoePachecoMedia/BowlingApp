package com.example.bowlingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
/***
public class PlayersActivity extends AppCompatActivity {

    public static final String PA = "DataActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        Log.w(PA, "Inside DataActivity:onCreate\n");
        //setContentView(R.layout.activity_data);
        //updateView();
    }


    protected void onStart( ) {
        super.onStart( );
        Log.w( PA, "Inside DataActivity:onStart\n" );
    }

    protected void onRestart( ) {
        super.onRestart( );
        Log.w( PA, "Inside DataActivity:onReStart\n" );
    }

    protected void onResume( ) {
        super.onResume( );
        Log.w( PA, "Inside DataActivity:onResume\n" );
    }

    protected void onPause( ) {
        super.onPause( );
        Log.w( PA, "Inside DataActivity:onPause\n" );
    }

    protected void onStop( ) {
        super.onStop( );
        Log.w( PA, "Inside DataActivity:onStop\n" );
    }

    protected void onDestroy( ) {
        super.onDestroy( );
        Log.w( PA, "Inside DataActivity:onDestroy\n" );
    }
/***
    public createTable(){
        RadioButton rb1 = findViewById(R.id.one);
        RadioButton rb2 = findViewById(R.id.two);
        RadioButton rb3 = findViewById(R.id.three);
        RadioButton rb4 = findViewById(R.id.four);
        RadioButton rb5 = findViewById(R.id.five);
        RadioButton rb6 = findViewById(R.id.six);
        int players = 6;
        if (rb1.isChecked())
            players = 1;
        else if (rb2.isChecked())
            players = 2;
        else if (rb3.isChecked())
            players = 3;
        else if (rb4.isChecked())
            players = 4;
        else if (rb5.isChecked())
            players = 5;
        else if (rb6.isChecked())
            players = 6;

        for

    }


    public void enterNames(View v){
        createTable();
        this.finish();
    }

}
        ***/