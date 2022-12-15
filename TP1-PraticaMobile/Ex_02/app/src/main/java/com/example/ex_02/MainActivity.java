package com.example.ex_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this::showText);
    }

    public void showText(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);
        EditText editTextMessage = findViewById(R.id.editText);
        intent.putExtra("message", editTextMessage.getText().toString());
        startActivity(intent);
    }
}