package com.example.bowlingapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    public static final String DA = "DetailsActivity";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Log.w(DA, "Inside DataActivity:onCreate\n");
        updateView();
    }


    protected void onStart( ) {
        super.onStart( );
        Log.w( DA, "Inside DataActivity:onStart\n" );
    }

    protected void onRestart( ) {
        super.onRestart( );
        Log.w( DA, "Inside DataActivity:onReStart\n" );
    }

    protected void onResume( ) {
        super.onResume( );
        Log.w( DA, "Inside DataActivity:onResume\n" );
    }

    protected void onPause( ) {
        super.onPause( );
        Log.w( DA, "Inside DataActivity:onPause\n" );
    }

    protected void onStop( ) {
        super.onStop( );
        Log.w( DA, "Inside DataActivity:onStop\n" );
    }

    protected void onDestroy( ) {
        super.onDestroy( );
        Log.w( DA, "Inside DataActivity:onDestroy\n" );
    }



    public void updateView(){

    }

    public void startGame(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }



}
