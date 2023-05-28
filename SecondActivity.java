package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    private ImageButton male;
    private ImageButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(listener);
        female.setOnClickListener(listener1);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), MaleActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent1 = new Intent(getApplicationContext(),FemaleActivity.class);
            startActivity(intent1);

        }
    };

}