package com.mofty.practiceoop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        /*MainActivity.User user = (MainActivity.User) intent.getSerializableExtra("User");
        int age = user.age;
        String name = user.Name;
        TextView textView = (TextView) findViewById(R.id.textViewShow);
        textView.setText("you're names is" + "" + name + "" + "your age is" + "" + age );*/



    }
}
