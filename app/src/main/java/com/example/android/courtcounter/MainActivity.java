package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Add 3 points for Team A.
     */
    public void addThreePointsTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 points for Team A.
     */
    public void addTwoPointsTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 1 point for Team A.
     */
    public void addOnePointTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Add 3 points for Team B.
     */
    public void addThreePointsTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 points for Team B.
     */
    public void addTwoPointsTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 1 point for Team B.
     */
    public void addOnePointTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

}
