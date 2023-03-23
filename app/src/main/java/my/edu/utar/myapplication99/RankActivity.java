package my.edu.utar.myapplication99;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class RankActivity extends MainActivity{

    TextView tv_score;
    int lastScore;
    int[] topScores = new int[25];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top25);

        tv_score=(TextView) findViewById(R.id.tv_score);
        SharedPreferences preferences = getSharedPreferences("PREFS",0);
        lastScore = preferences.getInt("lastScore",0);

        // initialize topScores array with stored values
        for (int i = 0; i < topScores.length; i++) {
            topScores[i] = preferences.getInt("top" + (i+1), 0);
        }

        // check if lastScore is a new high score and insert into correct position
        for (int i = 0; i < topScores.length; i++) {
            if (lastScore > topScores[i]) {
                int temp = topScores[i];
                topScores[i] = lastScore;
                lastScore = temp;
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("top" + (i+1), topScores[i]);
                editor.apply();
            }
        }

        // display all top scores
        String scoreText = "";
        for (int i = 0; i < topScores.length; i++) {
            scoreText += (i+1) + ". " + topScores[i] + "\n";
        }
        tv_score.setText(scoreText);
    }


    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }
}


