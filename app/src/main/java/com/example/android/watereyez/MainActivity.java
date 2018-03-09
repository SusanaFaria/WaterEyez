package com.example.android.watereyez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //** Set Listener to button
        final Button button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //**Start new activity when button is pressed
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(intent);

            }
        });
    }
}