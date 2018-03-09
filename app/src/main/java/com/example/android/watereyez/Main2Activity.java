package com.example.android.watereyez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Set;

public class Main2Activity extends AppCompatActivity {

    int finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Set listener to button

        final Button button = findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {

            //Method triggered when button is pressed
            public void onClick(View v) {

                //Get 1st answer. Check it.
                RadioButton twoFive = findViewById(R.id.A1_3);
                boolean isTwoFive = twoFive.isChecked();
                if (isTwoFive) {
                    finalScore += 10;
                } else finalScore += 0;

                //Get 2nd answer. Check it.
                RadioButton waterFlow = findViewById(R.id.A2_2);
                boolean isWaterFlow = waterFlow.isChecked();
                if (isWaterFlow) {
                    finalScore += 10;
                } else finalScore += 0;

                //Get 3rd answer. Check it.
                // get the answers to boolean
                CheckBox precip = findViewById(R.id.A3_1);
                boolean chosePrecip = precip.isChecked();

                CheckBox infilt = findViewById(R.id.A3_2);
                boolean choseInfilt = infilt.isChecked();

                CheckBox evap = findViewById(R.id.A3_3);
                boolean choseEvap = evap.isChecked();

                CheckBox decant = findViewById(R.id.A3_4);
                boolean choseDecant = decant.isChecked();

                //get the score
                if (chosePrecip) {
                    finalScore += 10;
                }

                if (choseInfilt) {
                    finalScore += 10;
                }

                if (choseEvap) {
                    finalScore += 10;
                }

                if (choseDecant) {
                    finalScore -= 5;
                } else finalScore += 0;

                //Get 4th answer. Check it.
                RadioButton boutSeventy = findViewById(R.id.A4_1);
                boolean isBoutSeventy = boutSeventy.isChecked();
                if (isBoutSeventy) {
                    finalScore += 10;
                } else finalScore += 0;

                //Get 5th answer. Check it.
                RadioButton enzyme = findViewById(R.id.A5_3);
                boolean isEnzyme = enzyme.isChecked();
                if (isEnzyme) {
                    finalScore += 10;
                } else finalScore += 0;

                // Get 6th answer.
                if (answerSix().equals(getString(R.string.a6))) {
                    finalScore += 10;
                } else finalScore += 0;

                //Get 7th answer. Check it.
                RadioButton SouthAfrica = findViewById(R.id.A7_2);
                boolean isSA = SouthAfrica.isChecked();
                if (isSA) {
                    finalScore += 10;
                } else finalScore += 0;

                //Get 8th answer. Check it.
                // get the answers to boolean
                CheckBox tapOff = findViewById(R.id.A8_1);
                boolean choseTapOff = tapOff.isChecked();

                CheckBox hose = findViewById(R.id.A8_2);
                boolean choseHose = hose.isChecked();

                CheckBox cistern = findViewById(R.id.A8_3);
                boolean choseCistern = cistern.isChecked();

                CheckBox halfLoad = findViewById(R.id.A8_4);
                boolean choseHalfLoad = halfLoad.isChecked();

                CheckBox shrtShwr = findViewById(R.id.A8_5);
                boolean choseShrtShwr = shrtShwr.isChecked();

                CheckBox morning = findViewById(R.id.A8_6);
                boolean choseMorning = morning.isChecked();

                //get the score
                if (choseTapOff) {
                    finalScore += 10;
                }

                if (choseHose) {
                    finalScore -= 5;
                }

                if (choseCistern) {
                    finalScore += 10;
                }

                if (choseHalfLoad) {
                    finalScore -= 5;
                }
                if (choseShrtShwr) {
                    finalScore += 10;
                }
                if (choseMorning) {
                    finalScore += 10;
                } else finalScore += 0;


                // Intent to start  new activity with results display

                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("score", finalScore);
                Main2Activity.this.startActivity(intent);
            }

            //extract string from edit text
            private String answerSix() {
                EditText isH20 = (EditText) findViewById(R.id.waterFormula);
                return isH20.getText().toString();
            }

        });
    }
}

