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

public class MainActivity5 extends AppCompatActivity {

    private static final String EXTRA_NUMBER ="my.edu.utar.myapplication99" ;
    TextView score;
    private int mScore;  // private allow user to access the variable throughout the activity

    int startTime, curHighlight, curLevel;

    Button b_start5;
    Button button1, button2, button3, button4,button5, button6, button7, button8, button9,button10, button11, button12, button13,button14, button15, button16, button17, button18, button19,button20, button21, button22, button23, button24, button25,button26, button27, button28, button29, button30,button31, button32, button33, button34, button35, button36;
    int currentTime;

    List<Integer> buttons;

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level5);

        Intent intent = getIntent();
        mScore = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        b_start5 = (Button) findViewById(R.id.b_start5);
        score = (TextView) findViewById(R.id.tv_score5);
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
        button10 = (Button) findViewById(R.id.bt10);
        button11 = (Button) findViewById(R.id.bt11);
        button12 = (Button) findViewById(R.id.bt12);
        button13 = (Button) findViewById(R.id.bt13);
        button14 = (Button) findViewById(R.id.bt14);
        button15 = (Button) findViewById(R.id.bt15);
        button16 = (Button) findViewById(R.id.bt16);
        button17 = (Button) findViewById(R.id.bt17);
        button18 = (Button) findViewById(R.id.bt18);
        button19 = (Button) findViewById(R.id.bt19);
        button20 = (Button) findViewById(R.id.bt20);
        button21 = (Button) findViewById(R.id.bt21);
        button22 = (Button) findViewById(R.id.bt22);
        button23 = (Button) findViewById(R.id.bt23);
        button24 = (Button) findViewById(R.id.bt24);
        button25 = (Button) findViewById(R.id.bt25);
        button26 = (Button) findViewById(R.id.bt26);
        button27 = (Button) findViewById(R.id.bt27);
        button28 = (Button) findViewById(R.id.bt28);
        button29 = (Button) findViewById(R.id.bt29);
        button30 = (Button) findViewById(R.id.bt30);
        button31 = (Button) findViewById(R.id.bt31);
        button32 = (Button) findViewById(R.id.bt32);
        button33 = (Button) findViewById(R.id.bt33);
        button34 = (Button) findViewById(R.id.bt34);
        button35 = (Button) findViewById(R.id.bt35);
        button36 = (Button) findViewById(R.id.bt36);

        button1.setTag(1);
        button2.setTag(2);
        button3.setTag(3);
        button4.setTag(4);
        button5.setTag(5);
        button6.setTag(6);
        button7.setTag(7);
        button8.setTag(8);
        button9.setTag(9);
        button10.setTag(10);
        button11.setTag(11);
        button12.setTag(12);
        button13.setTag(13);
        button14.setTag(14);
        button15.setTag(15);
        button16.setTag(16);
        button17.setTag(17);
        button18.setTag(18);
        button19.setTag(19);
        button20.setTag(20);
        button21.setTag(21);
        button22.setTag(22);
        button23.setTag(23);
        button24.setTag(24);
        button25.setTag(25);
        button26.setTag(26);
        button27.setTag(27);
        button28.setTag(28);
        button29.setTag(29);
        button30.setTag(30);
        button31.setTag(31);
        button32.setTag(32);
        button33.setTag(33);
        button34.setTag(34);
        button35.setTag(35);
        button36.setTag(36);

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
        buttons.add(10);
        buttons.add(11);
        buttons.add(12);
        buttons.add(13);
        buttons.add(14);
        buttons.add(15);
        buttons.add(16);
        buttons.add(17);
        buttons.add(18);
        buttons.add(19);
        buttons.add(20);
        buttons.add(21);
        buttons.add(22);
        buttons.add(23);
        buttons.add(24);
        buttons.add(25);
        buttons.add(26);
        buttons.add(27);
        buttons.add(28);
        buttons.add(29);
        buttons.add(30);
        buttons.add(31);
        buttons.add(32);
        buttons.add(33);
        buttons.add(34);
        buttons.add(35);
        buttons.add(36);

        b_start5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_start5.setVisibility(View.INVISIBLE);

                startTime=5000;
                currentTime=5000;
                curHighlight = 0;
                curLevel = 1;
                generateView5(curLevel);
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

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAction(v);
                ((Button) v).setText("CLICK ME!");
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
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
            if (curLevel == 25) {
                Toast.makeText(this, "Success! You", Toast.LENGTH_SHORT).show();
                b_start5.setVisibility(View.VISIBLE);
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        curHighlight = 0;
                        curLevel = 1;
                        generateView5(curLevel);

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

        alertDialogBuilder.setPositiveButton(("End"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);
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


    private void generateView5(int number) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");
        button16.setText("");
        button17.setText("");
        button18.setText("");
        button19.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");
        button25.setText("");
        button26.setText("");
        button27.setText("");
        button28.setText("");
        button29.setText("");
        button30.setText("");
        button31.setText("");
        button32.setText("");
        button33.setText("");
        button34.setText("");
        button35.setText("");
        button36.setText("");






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
            case 10:
                button10.setText("CLICK ME!");
                break;
            case 11:
                button11.setText("CLICK ME!");
                break;
            case 12:
                button12.setText("CLICK ME!");
                break;
            case 13:
                button13.setText("CLICK ME!");
                break;
            case 14:
                button14.setText("CLICK ME!");
                break;
            case 15:
                button15.setText("CLICK ME!");
                break;
            case 16:
                button16.setText("CLICK ME!");
                break;
            case 17:
                button17.setText("CLICK ME!");
                break;
            case 18:
                button18.setText("CLICK ME!");
                break;
            case 19:
                button19.setText("CLICK ME!");
                break;
            case 20:
                button20.setText("CLICK ME!");
                break;
            case 21:
                button21.setText("CLICK ME!");
                break;
            case 22:
                button22.setText("CLICK ME!");
                break;
            case 23:
                button23.setText("CLICK ME!");
                break;
            case 24:
                button24.setText("CLICK ME!");
                break;
            case 25:
                button25.setText("CLICK ME!");
                break;
            case 26:
                button26.setText("CLICK ME!");
                break;
            case 27:
                button27.setText("CLICK ME!");
                break;
            case 28:
                button28.setText("CLICK ME!");
                break;
            case 29:
                button29.setText("CLICK ME!");
                break;
            case 30:
                button30.setText("CLICK ME!");
                break;
            case 31:
                button31.setText("CLICK ME!");
                break;
            case 32:
                button32.setText("CLICK ME!");
                break;
            case 33:
                button33.setText("CLICK ME!");
                break;
            case 34:
                button34.setText("CLICK ME!");
                break;
            case 35:
                button35.setText("CLICK ME!");
                break;
            case 36:
                button36.setText("CLICK ME!");
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
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
        button19.setEnabled(true);
        button20.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button24.setEnabled(true);
        button25.setEnabled(true);
        button26.setEnabled(true);
        button27.setEnabled(true);
        button28.setEnabled(true);
        button29.setEnabled(true);
        button30.setEnabled(true);
        button31.setEnabled(true);
        button32.setEnabled(true);
        button33.setEnabled(true);
        button34.setEnabled(true);
        button35.setEnabled(true);
        button36.setEnabled(true);

    }

    private void disableView() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);
        button36.setEnabled(false);

    }

}

