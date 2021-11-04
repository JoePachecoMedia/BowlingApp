package com.example.bowlingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String MA = "MainActivity";
    //public static List<BowlingGame> games = new LinkedList<BowlingGame>();
    public int numPlayers = 6;
    public static BowlingGame currentGame;
    public static TableRow currentRow;

    int [] tvIds = {1_1,1_2,2_1,2_2,3_1,3_2,4_1,4_2,5_1,5_2,6_1,7_2,8_1,8_2,9_1,9_2,10_1,10_2,10_3};

    TableRow tr1,tr2,tr3,tr4,tr5,tr6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w( MA, "Inside MainActivity:onCreate\n" );
        setContentView(R.layout.activity_main);



    }

    public void onStart() {
        super.onStart();
        Log.w( MA, "Inside MainActivity:onStart\n" );

        tr1 = (TableRow) findViewById(R.id.row1);
        tr2 = (TableRow) findViewById(R.id.row2);
        tr3 = (TableRow) findViewById(R.id.row3);
        tr4 = (TableRow) findViewById(R.id.row4);
        tr5 = (TableRow) findViewById(R.id.row5);
        tr6 = (TableRow) findViewById(R.id.row6);

        //ActivityMainBinding binding = DataBindingUtil.se
        updateView();
    }
    protected void onRestart( ) {
        super.onRestart( );
        updateRow(currentRow);
        Log.w( MA, "Inside MainActivity:onReStart\n" );
    }

    protected void onResume( ) {
        super.onResume( );
        Log.w( MA, "Inside MainActivity:onResume\n" );
        //updateView();
        //updateRow(currentRow);
        /***
        System.out.println(DetailsActivity.game1.getScore());
        for(int i = 0; i < 6; i++){
            System.out.println(DetailsActivity.game1.rolls[i]);
        }
         ***/
        //updateScore();
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

    public void updateRow(TableRow row){
        TextView tv = new TextView(this);
        TextView tv0 = new TextView(this);
        tv.setText(String.valueOf(RollActivity.currentHit));
        row.addView(tv);
        if (RollActivity.currentHit == "10"){
            tv0.setText("-");
            row.addView(tv0);

        }
    }


    public void updateView(){

        TextView player1TV = findViewById(R.id.player1View);
        player1TV.setText(DetailsActivity.game1.getPlayerName());

        TextView player2TV = findViewById(R.id.player2View);
        player2TV.setText(DetailsActivity.game2.getPlayerName());

        TextView player3TV = findViewById(R.id.player3View);
        player3TV.setText(DetailsActivity.game3.getPlayerName());

        TextView player4TV = findViewById(R.id.player4View);
        player4TV.setText(DetailsActivity.game4.getPlayerName());

        TextView player5TV = findViewById(R.id.player5View);
        player5TV.setText(DetailsActivity.game5.getPlayerName());

        TextView player6TV = findViewById(R.id.player6View);
        player6TV.setText(DetailsActivity.game6.getPlayerName());


        if(DetailsActivity.game1 != null) {
            TextView scoreATV = (TextView) findViewById(R.id.scoreA);
            System.out.println(scoreATV);
            scoreATV.setText(String.valueOf(DetailsActivity.game1.getScore()));
            //currentRow = tr1;

        }

        if (DetailsActivity.game2 != null) {
            TextView scoreBTV = findViewById(R.id.scoreB);
            scoreBTV.setText(String.valueOf(DetailsActivity.game2.getScore()));
            //currentRow = tr2;

        }

        if(DetailsActivity.game3 != null) {
            TextView scoreCTV = findViewById(R.id.scoreC);
            scoreCTV.setText(String.valueOf(DetailsActivity.game3.getScore()));
            //currentRow = tr3;


        }
        if(DetailsActivity.game4 != null) {
            TextView scoreDTV = findViewById(R.id.scoreD);
            scoreDTV.setText(String.valueOf(DetailsActivity.game4.getScore()));
            //currentRow = tr4;

        }

        if(DetailsActivity.game5 != null) {
            TextView scoreETV = findViewById(R.id.scoreE);
            scoreETV.setText(String.valueOf(DetailsActivity.game5.getScore()));

        }

        if(DetailsActivity.game6 != null) {
            TextView scoreFTV = findViewById(R.id.scoreF);
            scoreFTV.setText(String.valueOf(DetailsActivity.game6.getScore()));

        }









    }
/***
    public void updateScore(){
        //if();
        try {
            TextView scoreATV = findViewById(R.id.scoreA);
            scoreATV.setText(DetailsActivity.game1.getScore());

            TextView scoreBTV = findViewById(R.id.scoreB);
            scoreBTV.setText(DetailsActivity.game2.getScore());

            TextView scoreCTV = findViewById(R.id.scoreC);
            scoreCTV.setText(DetailsActivity.game3.getScore());

            TextView scoreDTV = findViewById(R.id.scoreD);
            scoreDTV.setText(DetailsActivity.game4.getScore());

            TextView scoreETV = findViewById(R.id.scoreE);
            scoreETV.setText(DetailsActivity.game5.getScore());

            TextView scoreFTV = findViewById(R.id.scoreF);
            scoreFTV.setText(DetailsActivity.game6.getScore());
        }catch (RuntimeException e){
            //Toast.makeText(getBaseContext(), e, 1000);
        }
    }


***/


    public void rollA(View v){
        currentGame = DetailsActivity.games.get(0);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr1;

    }

    public void rollB(View v){
        currentGame = DetailsActivity.games.get(1);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr2;

    }

    public void rollC(View v){
        currentGame = DetailsActivity.games.get(2);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr3;

    }

    public void rollD(View v){
        currentGame = DetailsActivity.games.get(3);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr4;


    }

    public void rollE(View v){
        currentGame = DetailsActivity.games.get(4);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr5;

    }

    public void rollF(View v){
        currentGame = DetailsActivity.games.get(5);

        Intent rollIntent = new Intent(this, RollActivity.class);
        this.startActivity(rollIntent);
        currentRow = tr6;


    }
}