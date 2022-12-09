package com.example.btqt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinear = findViewById(R.id.linear_layout);
        Button btnRelative = findViewById(R.id.relative_layout);
        Button btnTable = findViewById(R.id.table_layout);

        btnLinear.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            intent.putExtra("layout", "linear");
            startActivity(intent);
        });
        btnRelative.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            intent.putExtra("layout", "relative");
            startActivity(intent);
        });
        btnTable.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            intent.putExtra("layout", "table");
            startActivity(intent);
        });
    }
}