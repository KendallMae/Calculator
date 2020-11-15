package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTestView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });

        Button subBtn = (Button) findViewById((R.id.subBtn));
        subBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditTest = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTestView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditTest.getText().toString());
                int result = num1 - num2;

                resultTextView.setText(result + "");
            }
        }));

        Button mulBtn = (Button) findViewById((R.id.mulBtn));
        mulBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditTest = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTestView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditTest.getText().toString());
                int result = num1 * num2;

                resultTextView.setText(result + "");
            }
        }));

        Button divBtn = (Button) findViewById((R.id.divBtn));
        divBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditTest = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTestView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditTest.getText().toString());
                int result = num1 / num2;

                resultTextView.setText(result + "");
            }
        }));
    }
}