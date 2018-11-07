package com.mofty.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    Button button;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText editText = (EditText)findViewById(R.id.Name);
        button = (Button)findViewById(R.id.button3);
        //name = editText.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("Name", name);
                startActivity(intent);



            }
        });

    }
}
