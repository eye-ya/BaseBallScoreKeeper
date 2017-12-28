package com.example.android.baseballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int innings = 0;

    int runsTeamA = 0;
    int strikesTeamA = 0;
    int outsTeamA = 0;
    int homerunsTeamA = 0;
    int ballsTeamA =0;

    int runsTeamB = 0;
    int strikesTeamB = 0;
    int outsTeamB = 0;
    int homerunsTeamB = 0;
    int ballsTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
////////////////////////////INNINGS//////////////////////////////////////////

    /**
     * Displays the innings for game.
     */
    public void displayInnings(int innings) {
        TextView inningsView = (TextView) findViewById(R.id.theinnings);
        inningsView.setText(String.valueOf(innings));
    }

    /**
     * Increases the innings for the game.
     */
    public void innings (View v)
    {
        if(innings<9)
        {
            innings+=1;
            displayInnings(innings);
        }


    }

    //////////////////////////////////////TEAM A///////////////////////////////////////////

////////////////////////////RUNS TEAM A//////////////////////////////////////////
    /**
     * Displays the runs for Team A.
     */
    public void displayRunsForTeamA(int runsTeamA) {
        TextView runsView = (TextView) findViewById(R.id.team_a_runs);
        runsView.setText(String.valueOf(runsTeamA));
    }

    /**
     * Increases the runs for Team A.
     */
    public void addRunForTeamA(View v)
    {
        runsTeamA+=1;
        displayRunsForTeamA(runsTeamA);
    }
///////////////////////STRIKES TEAM A////////////////////////////////////////////
    /**
     * Displays the strikes for Team A.
     */
    public void displayStrikesForTeamA(int strikesTeamA) {
        TextView strikesView = (TextView) findViewById(R.id.team_a_strikes);
        strikesView.setText(String.valueOf(strikesTeamA));
    }

    /**
     * Increases the strikes for Team A.
     */
    public void addStrikeForTeamA(View v)
    {

            if(strikesTeamA<3)
            {
                strikesTeamA+=1;
                displayStrikesForTeamA(strikesTeamA);
            }

            if(strikesTeamA == 3)
            {
            outsTeamA+=1;
            displayOutsForTeamA(outsTeamA);
            }
            while(strikesTeamA==3)
            {
               strikesTeamA = 0;
            }

    }
//////////////////////////OUTS TEAM A////////////////////////////////////////////////
    /**
     * Displays the outs for Team A.
     */
    public void displayOutsForTeamA(int outsTeamA) {
        TextView outsView = (TextView) findViewById(R.id.team_a_outs);
        outsView.setText(String.valueOf(outsTeamA));
    }
    /**
     * Increase the outs for Team A.
     *//*
    public void outsForTeamA(View v)
    {
        outsTeamA+=1;
        displayOutsForTeamA(outsTeamA);

    }*/
    //////////////////////////BALLS TEAM A////////////////////////////////////////////////

    /**
     * Displays the balls for Team A.
     */
    public void displayBallsForTeamA(int ballsTeamA) {
        TextView outsView = (TextView) findViewById(R.id.team_a_balls);
        outsView.setText(String.valueOf(ballsTeamA));
    }
    /**
     * Increase the balls for Team A.
     */
    public void ballsForTeamA(View v)
    {
        ballsTeamA+=1;
        displayBallsForTeamA(ballsTeamA);
    }
    //////////////////////////////////////TEAM B///////////////////////////////////////////
////////////////////////////RUNS TEAM B//////////////////////////////////////////

    /**
     * Displays the runs for Team B.
     */
    public void displayRunsForTeamB(int runsTeamB) {
        TextView runsView = (TextView) findViewById(R.id.team_b_runs);
        runsView.setText(String.valueOf(runsTeamB));
    }

    /**
     * Increases the runs for Team B.
     */
    public void addRunForTeamB(View v)
    {
        runsTeamB+=1;
        displayRunsForTeamB(runsTeamB);
    }

///////////////////////STRIKES TEAM B////////////////////////////////////////////

    /**
     * Displays the runs for Team B.
     */
    public void displayStrikesForTeamB(int strikesTeamB) {
        TextView strikesView = (TextView) findViewById(R.id.team_b_strikes);
        strikesView.setText(String.valueOf(strikesTeamB));
    }

    /**
     * Increases the strikes for Team B.
     */
    public void addStrikeForTeamB(View v)
    {
        if(strikesTeamB<3)
        {
            strikesTeamB+=1;
            displayStrikesForTeamB(strikesTeamB);
        }

        if(strikesTeamB == 3)
        {
            outsTeamB+=1;
            displayOutsForTeamB(outsTeamB);
        }
        while(strikesTeamB==3)
        {
            strikesTeamB = 0;
        }
    }

//////////////////////////OUTS TEAM B////////////////////////////////////////////////

    /**
     * Displays the outs for Team B.
     */
    public void displayOutsForTeamB(int outsTeamB) {
        TextView outsView = (TextView) findViewById(R.id.team_b_outs);
        outsView.setText(String.valueOf(outsTeamB));
    }
   /* *//**
     * Increase the outs for Team B.
     *//*
    public void outsForTeamB(View v)
    {
        outsTeamB+=1;
        displayOutsForTeamB(outsTeamB);
    }*/

    //////////////////////////BALLS TEAM B////////////////////////////////////////////////

    /**
     * Displays the balls for Team B.
     */
    public void displayBallsForTeamB(int ballsTeamB) {
        TextView outsView = (TextView) findViewById(R.id.team_b_balls);
        outsView.setText(String.valueOf(ballsTeamB));
    }
    /**
     * Increase the balls for Team B.
     */
    public void ballsForTeamB(View v)
    {
        ballsTeamB+=1;
        displayBallsForTeamB(ballsTeamB);
    }
////////////////////////////////RESET///////////////////////////////////////////////
    public void reset (View v)
    {
         innings = 0;

         runsTeamA = 0;
         strikesTeamA = 0;
         outsTeamA = 0;
         homerunsTeamA = 0;

         runsTeamB = 0;
         strikesTeamB = 0;
         outsTeamB = 0;
         homerunsTeamB = 0;

        displayInnings(innings);

        displayRunsForTeamA(runsTeamA);
        displayStrikesForTeamA(strikesTeamA);
        displayOutsForTeamA(outsTeamA);

        displayRunsForTeamB(runsTeamB);
        displayStrikesForTeamB(strikesTeamB);
        displayOutsForTeamB(outsTeamB);
    }
}
