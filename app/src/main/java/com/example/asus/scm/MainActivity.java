package com.example.asus.scm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button spare,far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spare = findViewById(R.id.spare);
        far = findViewById(R.id.far);


    }

    @Override
    protected void onStart() {
        super.onStart();

        spare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SpareActivity.class);
                startActivity(intent);
            }
        });

        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FarActivity.class);
                startActivity(intent);
            }
        });

    }
}
