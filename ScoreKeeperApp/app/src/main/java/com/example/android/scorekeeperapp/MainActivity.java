package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A.
     */
    public void addScoreTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the Yellow Card for Team A.
     */
    public void addYellowCardTeamA(View v) {
        yellowCardTeamA++;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Increase the Red Card for Team A.
     */
    public void addRedCardTeamA(View v) {
        redCardTeamA++;
        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Displays the given Yellow Card for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B.
     */
    public void addScoreTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the Yellow Card for Team B.
     */
    public void addYellowCardTeamB(View v) {
        yellowCardTeamB++;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    /**
     * Increase the Red Card for Team B.
     */
    public void addRedCardTeamB(View v) {
        redCardTeamB++;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given Yellow Card for Team B.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card for Team B.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
    }
}
