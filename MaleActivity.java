package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaleActivity extends AppCompatActivity {

    private Button back;
    private Button resultButton;
    private TextView result;

    public EditText heightIn;
    private EditText weightIn;
    private EditText ageIn;

    private int height;
    private int weight;
    private int age;
    private int calory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);

        back = findViewById(R.id.back);
        resultButton = findViewById(R.id.resultButton);
        weightIn = findViewById(R.id.weightIn);
        ageIn = findViewById(R.id.ageIn);
        result = findViewById(R.id.result);
        heightIn = findViewById(R.id.heightIn);

        back.setOnClickListener(listener);
        resultButton.setOnClickListener(listener1);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            height = Integer.parseInt(heightIn.getText().toString());
            weight = Integer.parseInt(weightIn.getText().toString());
            age = Integer.parseInt(ageIn.getText().toString());
            calory = (height * 10 + weight * 6 - age * 5 + 5);

            result.setText("Ваша суточная норма потребления в ккалориях:" +
                    "\n" + String.valueOf(calory));
        }
    };

}

