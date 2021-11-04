package com.example.bowlingapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends AppCompatActivity {
    public static final String MA = "Main ACtivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(MA, "Inside Details Activity:onStart");
    }

    public void onStart() {
        super.onStart();
        Log.w( MA, "Inside MainActivity:onStart\n" );
        updateView();

    }
    protected void onRestart( ) {
        super.onRestart( );
        Log.w( MA, "Inside MainActivity:onReStart\n" );
    }

    protected void onResume( ) {
        super.onResume( );
        Log.w( MA, "Inside MainActivity:onResume\n" );
    }

    protected void onPause( ) {
        super.onPause( );
        Log.w( MA, "Inside MainActivity:onPause\n" );
    }

    protected void onStop( ) {
        super.onStop( );
        Log.w( MA, "Inside MainActivity:onStop\n" );
    }

    protected void onDestroy( ) {
        super.onDestroy( );
        Log.w( MA, "Inside MainActivity:onDestroy\n" );
    }

    public void updateView(){

        //TextView


    }


}