package com.example.cosmic.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamascore = 0;
    private int teambscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threepta(View view){
        int threea = 3;
        displaya(threea);
    }
    public void twopta(View view){
        int twoa = 2;
        displaya(twoa);
    }
    public void onepta(View view){
        int onea = 1;
        displaya(onea);
    }
    public void threeptb(View view){
        int threeb = 3;
        displayb(threeb);
    }
    public void twoptb(View view){
        int twob = 2;
        displayb(twob);
    }
    public void oneptb(View view){
        int oneb = 1;
        displayb(oneb);
    }
    public void reset(View view){
        teamascore = 0;
        displaya(0);
        teambscore = 0;
        displayb(0);
    }







    private void displaya(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamascore);
        teamascore = teamascore + number;
        quantityTextView.setText("" + teamascore);


    }
    private void displayb(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teambscore);
        teambscore = teambscore + number;
        quantityTextView.setText("" + teambscore);


    }
}
