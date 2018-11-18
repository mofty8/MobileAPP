package com.mofty.practiceoop;

import android.content.Intent;
import android.icu.lang.UCharacterEnums;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    public class User implements Serializable {
        public String Name;
        public int age;

        public User(String Name, int age){
            Name = this.Name;
            age = this.age;

        }

    }
    EditText editTextname ;
    EditText editTextage ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        editTextname = (EditText)findViewById(R.id.editTextName);
        editTextage = (EditText)findViewById(R.id.editTextAge);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String name = editTextname.getText().toString();
                //int age = Integer.parseInt(editTextage.getText().toString());
                User user = new User("mofty", 21);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("object", user);
                startActivity(intent);

            }
        });






    }
}
