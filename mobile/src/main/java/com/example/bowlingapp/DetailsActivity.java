package com.example.bowlingapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    public static final String DA = "DetailsActivity";
    public static BowlingGame game1;
    public static BowlingGame game2;
    public static BowlingGame game3;
    public static BowlingGame game4;
    public static BowlingGame game5;
    public static BowlingGame game6;


    public static List<BowlingGame> games = new LinkedList<BowlingGame>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        game1 = new BowlingGame();
        game2 = new BowlingGame();
        game3 = new BowlingGame();
        game4 = new BowlingGame();
        game5 = new BowlingGame();
        game6 = new BowlingGame();

        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);
        games.add(game6);

        setContentView(R.layout.activity_details);
        Log.w(DA, "Inside DataActivity:onCreate\n");
        updateView();
        //init();
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

    public void updateGame(){
        //BowlingGame game1 = MainActivity.game1;
        EditText player1ET = findViewById(R.id.player1_name);
        String player1String = player1ET.getText().toString();
        game1.setPlayerName(player1String);

        //BowlingGame game2 = MainActivity.game2;
        EditText player2ET = findViewById(R.id.player2_name);
        String player2String = player2ET.getText().toString();
        game2.setPlayerName(player2String);

        //BowlingGame game3 = MainActivity.game3;
        EditText player3ET = findViewById(R.id.player3_name);
        String player3String = player3ET.getText().toString();
        game3.setPlayerName(player3String);

        //BowlingGame game4 = MainActivity.game4;
        EditText player4ET = findViewById(R.id.player4_name);
        String player4String = player4ET.getText().toString();
        game4.setPlayerName(player4String);

        //BowlingGame game5 = MainActivity.game5;
        EditText player5ET = findViewById(R.id.player5_name);
        String player5String = player5ET.getText().toString();
        game5.setPlayerName(player5String);

        //BowlingGame game6 = MainActivity.game6;
        EditText player6ET = findViewById(R.id.player6_name);
        String player6String = player6ET.getText().toString();
        game6.setPlayerName(player6String);



    }


/***

    public void updateView(){
        for (player:
             Players) {
            BowlingGame player = MainActivity.

        }

    }

***/

    public void startGame(View v){
        updateGame();

        Intent startIntent = new Intent(this, MainActivity.class);
        this.startActivity(startIntent);


    }

    public void init(){

    }



}
