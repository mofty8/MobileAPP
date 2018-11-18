package com.mofty.change_backgroud;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();

        int orientation = newConfig.orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.d("tag", "Portrait");
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
             setActivityBackgroundColor(250);
        }
        else if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("tag", "Landscape");
            Toast.makeText(this, "Landscape", Toast.LENGTH_SHORT).show();

            setActivityBackgroundColor(150);
        }
        else{
            Log.w("tag", "other: " + orientation);
            setActivityBackgroundColor(50);
        }

    }
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
