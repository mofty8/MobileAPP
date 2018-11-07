package com.mofty.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Main3Activity extends AppCompatActivity {

TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        TextView textView = findViewById(R.id.textView);
        String Display = name + "" + "your account has been created" + "" ;
        textView.setText(Display);




    }
}
