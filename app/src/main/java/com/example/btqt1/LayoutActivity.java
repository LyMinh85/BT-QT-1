package com.example.btqt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class LayoutActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private View[] views = new View[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layout = getIntent().getStringExtra("layout");

        if (layout.equalsIgnoreCase("linear")) {
            setContentView(R.layout.linear_layout);
        } else if (layout.equalsIgnoreCase("relative")) {
            setContentView(R.layout.relative_layout);
        } else {
            setContentView(R.layout.table_layout);
        }

        views[0] = (View) findViewById(R.id.top_blue);
        views[1] = (View) findViewById(R.id.top_red);
        views[2] = (View) findViewById(R.id.center_gray);
        views[3] = (View) findViewById(R.id.bottom_blue);
        views[4] = (View) findViewById(R.id.bottom_pink);

        seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean b) {
                for (View view : views) {
                    int color = Color.TRANSPARENT;
                    Drawable background = view.getBackground();
                    if (background instanceof ColorDrawable) {
                        color = ((ColorDrawable) background).getColor();
                    }
                    color = color + progressValue;
                    view.setBackgroundColor(color);
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
        if (item.getItemId() == R.id.menu_inf) {
            AlertDialog.Builder info = new AlertDialog.Builder(this);
            info.setMessage("Bai Tap Qua Trinh 01 nhom \n NHOM 16 \n Link github: https://github.com/LyMinh85/BT-QT-1");
            info.setPositiveButton("Ok", null);
            info.show();
        }
        return true;
    }
}