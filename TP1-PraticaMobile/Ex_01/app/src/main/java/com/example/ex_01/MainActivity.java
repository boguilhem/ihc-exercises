package com.example.ex_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numberOne;
    TextView numberTwo;

    Button sumButton;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = (EditText) findViewById(R.id.numberOne);
        numberTwo = (EditText) findViewById(R.id.numberTwo);

        sumButton = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);


        sumButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1 = Double.parseDouble(numberOne.getText().toString());
                double num2 = Double.parseDouble(numberTwo.getText().toString());
                double sum = num1 + num2;

                result.setText(Double.toString(sum));
            }
        });
    }
}