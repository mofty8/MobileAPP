package com.mofty.cameracapture;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends Activity {
    Button button;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               //File file = getFile();
               File dir=  Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                //Camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                File output=new File(dir, "image.jpeg");
                Camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));
                startActivityForResult(Camera_intent, RESULT_FIRST_USER );

            }
        });
    }
    public File getFile() {
        File folder = new File("Mobile");
        if(!folder.exists() )
            folder.mkdir();

        File Image_file = new File(folder, "image.jpg");
        return Image_file;
    }


}
