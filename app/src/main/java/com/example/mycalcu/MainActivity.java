package com.example.mycalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtn1, edtn2;
    TextView txt;
    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtn1 = findViewById(R.id.num1);
        edtn2 = findViewById(R.id.num2);
        btn1 = findViewById(R.id.Add);
        btn2 = findViewById(R.id.Subtract);
        btn3 = findViewById(R.id.Multiply);
        txt = findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(edtn1.getText().toString());
                int number2 = Integer.parseInt(edtn2.getText().toString());
                int result = addNumbers(number1, number2);
                txt.setText(Integer.toString(result));
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(edtn1.getText().toString());
                int number2 = Integer.parseInt(edtn2.getText().toString());
                int result = subtractNumber(number1, number2);
                txt.setText(Integer.toString(result));
            }


        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(edtn1.getText().toString());
                int number2 = Integer.parseInt(edtn2.getText().toString());
                int result = multiplyNumber(number1, number2);
                txt.setText(Integer.toString(result));
            }


        });

    }


    int addNumbers(int a, int b) {
        int c = a + b;
        return c;
    }

    int subtractNumber(int a, int b) {
        int c = a - b;
        return c;
    }

    int multiplyNumber(int a, int b) {
        int c = a * b;
        return c;
    }
}

