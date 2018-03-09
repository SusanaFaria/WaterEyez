package com.example.android.watereyez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        // Get the Intent that started this activity and extract the int
        Intent intent = getIntent();
        int Score = intent.getIntExtra("score", 0);

        //get the results to boolean and set messages according to results

        boolean lowScore = Score <= 50;
        boolean midScore = Score > 50 && Score <= 70;
        boolean highScore = Score >= 130;
        String lowScoreMessage = getString(R.string.lowScore);
        String midScoreMessage = getString(R.string.midScore);
        String highScoreMessage = getString(R.string.highScore);

        TextView Scr = findViewById(R.id.Results);
        String score = getString(R.string.toastMsgPart1) + " " + Score + " " + getString(R.string.toastMsgPart2);

        //this displays messages according to the score

        if (lowScore) {
            Scr.setText(lowScoreMessage);
            Toast toast = Toast.makeText(Main3Activity.this, score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }
        if (midScore) {
            Scr.setText(midScoreMessage);
            Toast toast = Toast.makeText(Main3Activity.this, score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }
        if (highScore) {
            Scr.setText(highScoreMessage);
            Toast toast = Toast.makeText(Main3Activity.this, score, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }

//** deal with reset button. By clicking it, activity restarts and displays a message.
        final Button button = findViewById(R.id.btn3);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

//this intent restarts the app
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                Main3Activity.this.startActivity(intent);
//this displays a toast
                String certain = getString(R.string.finalToast);
                Toast toast = Toast.makeText(Main3Activity.this, certain, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }

        });
    }
}



