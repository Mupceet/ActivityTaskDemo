package com.mupceet.activitytaskdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toSecondActivity = (Button) findViewById(R.id.btn_to_second);
        toSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StandardActivity.class));
            }
        });

        Button toSingleTopActivity = (Button) findViewById(R.id.btn_to_single);
        toSingleTopActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleTopActivity.class));
            }
        });

        Button toSingleTaskActivity = (Button) findViewById(R.id.btn_to_single_task);
        toSingleTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleTaskActivity.class));
            }
        });

        Button toSingleInstanceActivity = (Button) findViewById(R.id.btn_to_single_instance);
        toSingleInstanceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleInstanceActivity.class));
            }
        });

        Button toSingleTaskWithAffinity = (Button) findViewById(R.id.btn_to_single_task_with_affinity);
        toSingleTaskWithAffinity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingleTaskActivityWithAffinity.class));
            }
        });
    }
}
