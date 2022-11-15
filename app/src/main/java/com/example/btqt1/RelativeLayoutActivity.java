package com.example.btqt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
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