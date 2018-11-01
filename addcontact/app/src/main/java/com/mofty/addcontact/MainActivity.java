package com.mofty.addcontact;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);


                EditText firstname = (EditText) findViewById(R.id.edittext_first);
                EditText Lastname = (EditText) findViewById(R.id.edittext_last);
                EditText phone = (EditText) findViewById(R.id.edittext_phone);


                intent.putExtra(ContactsContract.Intents.Insert.NAME, firstname.getText() + " " + Lastname.getText());
                intent.putExtra(ContactsContract.Intents.Insert.PHONE, phone.getText());
                intent.putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);
                startActivity(intent);

            }
        });
    }
}



