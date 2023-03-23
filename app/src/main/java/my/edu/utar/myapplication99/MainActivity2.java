package my.edu.utar.myapplication99;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private static final String EXTRA_NUMBER ="my.edu.utar.myapplication99" ;

    TextView score;
    private int mScore;  // private allow user to access the variable throughout the activity

    int startTime, curHighlight, curLevel;

    Button b_start2;
    Button button1, button2, button3, button4,button5, button6, button7, button8, button9;
    int currentTime;

    Intent intent = getIntent();


    List<Integer> buttons;

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level2);

        Intent intent = getIntent();
        mScore = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        b_start2 = (Button) findViewById(R.id.b_start2);
        score = (TextView) findViewById(R.id.tv_score2);
        score.setText(("Score:" + mScore));

        button1 = (Button) findViewById(R.id.bt1);
        button2 = (Button) findViewById(R.id.bt2);
        button3 = (Button) findViewById(R.id.bt3);
        button4 = (Button) findViewById(R.id.bt4);
        button5 = (Button) findViewById(R.id.bt5);
        button6 = (Button) findViewById(R.id.bt6);
        button7 = (Button) findViewById(R.id.bt7);
        button8 = (Button) findViewById(R.id.bt8);
        button9 = (Button) findViewById(R.id.bt9);

        button1.setTag(1);
        button2.setTag(2);
        button3.setTag(3);
        button4.setTag(4);
        button5.setTag(5);
        button6.setTag(6);
        button7.setTag(7);
        button8.setTag(8);
        button9.setTag(9);

        buttons = new ArrayList<>();
        buttons.add(1);
        buttons.add(2);
        buttons.add(3);
        buttons.add(4);
        buttons.add(5);
        buttons.add(6);
        buttons.add(7);
        buttons.add(8);
        buttons.add(9);

        b_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_start2.setVisibility(View.INVISIBLE);

                startTime=5000;
                currentTime=5000;
                curHighlight = 0;
                curLevel = 1;
                generateView2(curLevel);
            }
        });




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

    }


    private void viewAction(View v) {
        List<Integer> tempList = new ArrayList<>();
        //for (int i = 0; i < curLevel; i++) {
        tempList.add(buttons.get(0));       //the maximum of question

        //}
        if (tempList.contains(v.getTag())) {
            curLevel++;
            curHighlight++;
            checkWin();
        } else {
            lostGame();
        }

    }

    private void checkWin() {
        if (curHighlight == 1) { //when correct 1 highlighted
            mScore++;
            score.setText("Score:" + mScore);
            disableView();
            if (curLevel == 12) {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
                b_start2.setVisibility(View.VISIBLE);
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        curHighlight = 0;
                        curLevel = 1;
                        generateView2(curLevel);

                    }
                }, 200);

            }
        }

    }

    private void lostGame()          {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("Game Over! Score: "+mScore);

        SharedPreferences preferences = getSharedPreferences("PREFS",0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("lastScore",mScore);
        editor.apply();

        alertDialogBuilder.setPositiveButton(("Next Level"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra(EXTRA_NUMBER,mScore);
                startActivity(intent);
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton(("Quit"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


    private void generateView2(int number) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        Collections.shuffle(buttons);

        for (int i = 0; i < number; i++) {
            showView(buttons.get(i));

        }

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(startTime);
        progressBar.setProgress(startTime);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                currentTime = currentTime - 1000;
                progressBar.setProgress(currentTime);

                if (currentTime > 0) {
                    enableView();
                }else{
                    lostGame();
                }
            }

        }, 200);
    }


    private void showView(int number) {
        switch (number) {
            case 1:
                button1.setText("CLICK ME!");
                break;
            case 2:
                button2.setText("CLICK ME!");
                break;
            case 3:
                button3.setText("CLICK ME!");
                break;
            case 4:
                button4.setText("CLICK ME!");
                break;
            case 5:
                button5.setText("CLICK ME!");
                break;
            case 6:
                button6.setText("CLICK ME!");
                break;
            case 7:
                button7.setText("CLICK ME!");
                break;
            case 8:
                button8.setText("CLICK ME!");
                break;
            case 9:
                button9.setText("CLICK ME!");
                break;

        }
    }

    private void enableView() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }

    private void disableView() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

}

