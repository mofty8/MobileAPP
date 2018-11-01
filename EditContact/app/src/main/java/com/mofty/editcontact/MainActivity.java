package com.mofty.editcontact;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button edit;
    EditText  name, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (Button)findViewById(R.id.button);

        name =(EditText) findViewById(R.id.edittext_first);
        phone =(EditText) findViewById(R.id.edittext_phone);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK);
                i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                if(i.resolveActivity(getPackageManager())!=null)
                    startActivityForResult(i, RESULT_FIRST_USER);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==RESULT_FIRST_USER && resultCode==RESULT_OK){
            Uri edituri = data.getData();
            editcontact(edituri);
        }
    }

    public void editcontact (Uri edituri)
    {
        Intent edit = new Intent(Intent.ACTION_EDIT);
        edit.setData(edituri);

        edit.putExtra(ContactsContract.Intents.Insert.NAME,name.getText().toString());
        edit.putExtra(ContactsContract.Intents.Insert.PHONE,phone.getText().toString());
        if(edit.resolveActivity(getPackageManager())!=null)
            startActivity(edit);
    }

}

