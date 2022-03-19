package com.example.deduyo_decision_based_gameg7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    TextView TextBox;
    Button nextButton, choiceA, choiceB, choiceC, choiceD;
    String[] defaultText, textChanger;
    ConstraintLayout background;

    int turnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.game_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //setting up the default text
        defaultText = getResources().getStringArray(R.array.intro_default);
        //setting up the text changer
        textChanger = getResources().getStringArray(R.array.turn_1);
        //button for next dialogue
        nextButton = findViewById(R.id.nextButton);
        //Buttons for choices
        choiceA = findViewById(R.id.button);
        choiceB = findViewById(R.id.button3);
        choiceC = findViewById(R.id.button4);
        choiceD = findViewById(R.id.button5);
        //Buttons for choices onClickListener
        choiceA.setOnClickListener(this);
        choiceB.setOnClickListener(this);
        choiceC.setOnClickListener(this);
        choiceD.setOnClickListener(this);
        //Button state
        boolean choiceA = false;
        boolean choiceB = false;
        boolean choiceC = false;
        boolean choiceD = false;
        //dialogue for txtBox
        TextBox = findViewById(R.id.txtBox);
        //Set Game Background
        background = findViewById(R.id.background_otome);
        //Set the default image view.
        background.setBackgroundResource(R.drawable.schoolgrounds);

        // Set text to default scenario.
        TextBox.setText(" ");
        choiceA.setText(defaultText[1]);
        choiceB.setText(defaultText[2]);
        choiceC.setText(defaultText[3]);
        choiceD.setText(defaultText[4]);
        setText(defaultText[0]);
    }
    public void showChoices1(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.GONE);
        choiceD.setVisibility(View.GONE);
    }
    public void showChoices2(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.VISIBLE);
        choiceD.setVisibility(View.GONE);
    }
    public void showChoices3(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.VISIBLE);
        choiceD.setVisibility(View.VISIBLE);
    }
    public void hideChoices(){
        choiceA.setVisibility(View.GONE);
        choiceB.setVisibility(View.GONE);
        choiceC.setVisibility(View.GONE);
        choiceD.setVisibility(View.GONE);
    }
    //this button must be hidden once choices appear
    public void hidenextButtion(){
        nextButton.setVisibility(View.GONE);
    }
    //this will show the nextButton after the choices
    public void shownextButton(){
        nextButton.setVisibility(View.VISIBLE);
    }


    public void onClick(View view) {
        switch ()
    }
}