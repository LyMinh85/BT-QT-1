package com.example.btqt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class RelativeLayoutActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private View[] listView = new View[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        try {
            listView[0] = (View) findViewById(R.id.top_blue);
            listView[1] = (View) findViewById(R.id.top_red);
            listView[2] = (View) findViewById(R.id.center_gray);
            listView[3] = (View) findViewById(R.id.bottom_blue);
            listView[4] = (View) findViewById(R.id.bottom_pink);
        } catch (Exception e) {
            Log.e("error", "Exception", e);
        }


        seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean b) {
                if (progressValue % 10 == 0) {
                    for (View view : listView) {
                        int color = Color.TRANSPARENT;
                        Drawable background = view.getBackground();
                        if (background instanceof ColorDrawable) {
                            color = ((ColorDrawable) background).getColor();
                        }
                        color = color + progressValue * 2 + 23;
                        view.setBackgroundColor(color);
                    }
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater im = getMenuInflater();
        im.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_inf:
                AlertDialog.Builder info = new AlertDialog.Builder(this);
                info.setMessage("Bai Tap Qua Trinh 01 nhom \n NHOM 16 \n Link github: https://github.com/LyMinh85/BT-QT-1");
                info.setPositiveButton("Ok", null);
                info.show();
        }
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        return true;
    }
}