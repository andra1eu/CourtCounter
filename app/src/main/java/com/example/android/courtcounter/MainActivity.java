package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String SCORE_A_KEY = "SCORE_A_KEY";
    public static final String SCORE_B_KEY = "SCORE_B_KEY";

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_A_KEY);
            scoreTeamB = savedInstanceState.getInt(SCORE_B_KEY);
        }

        teamAScore.setText(String.valueOf(scoreTeamA));
        teamBScore.setText(String.valueOf(scoreTeamB));
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_A_KEY, scoreTeamA);
        outState.putInt(SCORE_B_KEY, scoreTeamB);
    }
}
