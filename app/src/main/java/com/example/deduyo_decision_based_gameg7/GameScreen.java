package com.example.deduyo_decision_based_gameg7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    TextView TextBox, charName;
    Button nextButton, choiceA, choiceB, choiceC, choiceD;
    String[] defaultText, ccharName, TTxtBox, buttons;
    ConstraintLayout background;
    ImageView haruka, mitsuru, ryoku, sato;

    int turnCount; //turn number
    int route; // corresponds to route taken

    int number;



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
        ccharName = getResources().getStringArray(R.array.intro_default);
        //setting up the characters
        haruka = findViewById(R.id.haruka);
        mitsuru = findViewById(R.id.mitsuru);
        ryoku = findViewById(R.id.ryoku);
        sato = findViewById(R.id.sato);
        //setting up button text
        buttons = getResources().getStringArray(R.array.intro_default);
        //setting up txtBox
        TTxtBox = getResources().getStringArray(R.array.intro_default);
        //button to trigger the next dialogue
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

        //dialogue for charName
        charName = findViewById(R.id.charName);
        //dialogue for txtBox
        TextBox = findViewById(R.id.txtBox);
        //Set Game Background
        background = findViewById(R.id.background_otome);
        //Set the default image view.
        background.setBackgroundResource(R.drawable.schoolgrounds);

        // Set text to default scenario.
        charName.setText(defaultText[0]);
        TextBox.setText(defaultText[1]);
        choiceA.setText(defaultText[2]);
        choiceB.setText(defaultText[3]);
        choiceC.setText(defaultText[4]);
        choiceD.setText(defaultText[5]);
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
    public void hidenextButton(){
        nextButton.setVisibility(View.GONE);
    }

    //this will show the nextButton after the choices state end
    public void shownextButton(){
        nextButton.setVisibility(View.VISIBLE);
    }

    //this will hide the character name
    public void hideCharName(){
        charName.setVisibility(View.GONE);
    }

    //this will show the character name
    public void showCharName(){
        charName.setVisibility(View.VISIBLE);
    }


    public void storyProgression() {

        if (turnCount == 1) { //Turn 1
            ccharName = getResources().getStringArray(R.array.turn_1);
            TTxtBox = getResources().getStringArray(R.array.turn_1);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 2){ //Turn 2
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_2);
            TTxtBox = getResources().getStringArray(R.array.turn_2);
            buttons = getResources().getStringArray(R.array.turn_2);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 3){ //Turn 3
            shownextButton();
            hideChoices();
            ccharName = getResources().getStringArray(R.array.turn_3);
            TTxtBox = getResources().getStringArray(R.array.turn_3);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 4){ //Turn 4
            ccharName = getResources().getStringArray(R.array.turn_4);
            TTxtBox = getResources().getStringArray(R.array.turn_4);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 5){ //Turn 5
            ccharName = getResources().getStringArray(R.array.turn_5);
            TTxtBox = getResources().getStringArray(R.array.turn_5);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 6){ //Turn 6
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_6);
            TTxtBox = getResources().getStringArray(R.array.turn_6);
            buttons = getResources().getStringArray(R.array.turn_6);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 7){ //Turn 7
            shownextButton();
            hideChoices();
            hideCharName();
            TTxtBox = getResources().getStringArray(R.array.turn_7);
            TextBox.setText(TTxtBox[1]);
            haruka.setVisibility(View.GONE);
        }
        else if (turnCount == 8){ //Turn 8
            showCharName();
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_8);
            TTxtBox = getResources().getStringArray(R.array.turn_8);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 9){ //Turn 9
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_9);
            TTxtBox = getResources().getStringArray(R.array.turn_9);
            buttons = getResources().getStringArray(R.array.turn_9);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
            switch (number) {
                case 1: //Ryoku Route
                    ccharName = getResources().getStringArray(R.array.ryoku_route1);
                    TTxtBox = getResources().getStringArray(R.array.ryoku_route1);
                    number = 1;
                    break;
                case 2: //Mitsuru Route
                    ccharName = getResources().getStringArray(R.array.mitsuru_route1);
                    TTxtBox = getResources().getStringArray(R.array.mitsuru_route1);
                    number = 2;
                    break;
            }

        }
        else if (turnCount == 10){ //Turn 10 Ryoku Route
            if (number == 1){
                hideChoices();
                shownextButton();
                haruka.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.ryoku_route1);
                TTxtBox = getResources().getStringArray(R.array.ryoku_route1);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);

            }
            else { //Turn 10 Mitsuru Route
                hideChoices();
                shownextButton();
                haruka.setVisibility(View.GONE);
                mitsuru.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.mitsuru_route1);
                TTxtBox = getResources().getStringArray(R.array.mitsuru_route1);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
            }


        }
        else if (turnCount == 11){ //Turn 11
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_11);
            TTxtBox = getResources().getStringArray(R.array.turn_11);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            number = 0;
        }
        else if (turnCount == 12){ //Turn 12
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_12);
            TTxtBox = getResources().getStringArray(R.array.turn_12);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 13){ //Turn 13
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_13);
            TTxtBox = getResources().getStringArray(R.array.turn_13);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
    }


    public void onClick(View view) {
        storyProgression();
        switch (view.getId()) {
            case R.id.nextButton:
                turnCount++;
                break;

            case R.id.button:
                turnCount++;
                break;

            case R.id.button3:
                turnCount++;
                break;

            case R.id.button4:

            case R.id.button5:
        }
    }
}