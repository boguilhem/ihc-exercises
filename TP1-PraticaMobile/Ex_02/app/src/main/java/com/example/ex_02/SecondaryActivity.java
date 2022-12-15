package com.example.ex_02;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        textView = findViewById(R.id.textView);

        String message = getIntent().getStringExtra("message");
        textView.setText(message);
    }
}