package com.example.bowlingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class RollActivity extends AppCompatActivity {

    public static final String RA = "RollActivity";
    public static String currentHit;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w( RA, "Inside MainActivity:onCreate\n" );
        setContentView(R.layout.activity_roll);
    }


    public void onStart() {
        super.onStart();
        Log.w( RA, "Inside MainActivity:onStart\n" );
    }
    protected void onRestart( ) {
        super.onRestart( );
        Log.w( RA, "Inside MainActivity:onReStart\n" );
    }

    protected void onResume( ) {
        super.onResume( );
        Log.w( RA, "Inside MainActivity:onResume\n" );
    }

    protected void onPause( ) {
        super.onPause( );
        Log.w( RA, "Inside MainActivity:onPause\n" );
    }

    protected void onStop( ) {
        super.onStop( );
        Log.w( RA, "Inside MainActivity:onStop\n" );
    }

    protected void onDestroy( ) {
        super.onDestroy( );
        Log.w( RA, "Inside MainActivity:onDestroy\n" );
    }

    public void updateView(){



    }

    public void hit(View v){


        //if(MainActivity.)


        Button b = (Button)v;
        String currentHit = b.getText().toString();
        //currentHit = buttonText;


        //MainActivity.class

        //DetailsActivity.games.get(0);
        MainActivity.currentGame.hit(Integer.parseInt(currentHit));
        System.out.println(MainActivity.currentGame);
        Toast.makeText(getBaseContext(), currentHit , 1000).show();

        this.finish();
        //System.out.println(v);
    }

/***
    @Override
    public void finish(){
        System.out.println("penus");
    }
***/
}
